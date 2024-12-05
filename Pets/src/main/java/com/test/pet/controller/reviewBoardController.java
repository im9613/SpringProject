package com.test.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.pet.dao.AdoptReviewListDAO;
import com.test.pet.dto.AdoptReviewListDTO;

/**
 * 입양 후기 게시판을 처리하는 컨트롤러 클래스입니다.
 * 게시글 목록 조회, 상세 조회, 추가, 수정, 삭제 기능을 제공합니다.
 *  
 */
@Controller
public class reviewBoardController {
	
	@Autowired
	private AdoptReviewListDAO adoptReviewListDAO;

	/**
	 * 게시판 목록을 조회하여 보여줍니다.
	 * 
	 * @param model 데이터를 뷰에 전달하는 모델 객체
	 * @return 게시판 목록을 보여주는 뷰의 이름
	 */
	@GetMapping("/review.do")
	public String review(Model model) {
		List<AdoptReviewListDTO> reviewList = adoptReviewListDAO.getAdoptReviewList();
		model.addAttribute("reviewList", reviewList);
		return "board/adoptionreviewboard";		//목록 페이지
	}
	
	/**
	 * 특정 게시글에 대한 상세 내용을 조회하여 보여줍니다.
	 * 
	 * @param model 데이터를 뷰에 전달하는 모델 객체
	 * @param seq 조회할 후기에 대한 고유 ID
	 * @return 해당 후기에 대한 상세 정보를 보여주는 뷰의 이름
	 */
	@GetMapping("/reviewdetail.do")
	public String reviewdetail(Model model, String seq) {
		AdoptReviewListDTO dto = adoptReviewListDAO.get(seq);
		
		model.addAttribute("AdoptReviewListDTO", dto);
		return "board/reviewdetail";
		
	}
	
    /**
     * 새로운 입양 후기를 작성하는 폼을 보여줍니다.
     *
     * @param model 데이터를 뷰에 전달하는 모델 객체
     * @return 후기를 추가하는 폼을 보여주는 뷰의 이름
     */
	@GetMapping("/reviewadd.do")
	public String reviewadd(Model model) {
		
		return "board/reviewadd";	//게시글 추가
	}	
	
    /**
     * 새 입양 후기를 추가하는 처리 메서드입니다.
     *
     * @param model 데이터를 뷰에 전달하는 모델 객체
     * @param dto 추가할 후기에 대한 DTO 객체
     * @return 게시글 목록 페이지로 리다이렉트하는 뷰의 이름
     */
		@PostMapping("/reviewaddok")
		public String reviewaddok(Model model, AdoptReviewListDTO dto) {
			int result = adoptReviewListDAO.add(dto);
					return "redirect:/review.do";
		}
		
    /**
     * 기존의 입양 후기를 수정하는 폼을 보여줍니다.
     *
     * @param model 데이터를 뷰에 전달하는 모델 객체
     * @param seq 수정할 후기에 대한 고유 ID
     * @return 후기를 수정하는 폼을 보여주는 뷰의 이름
     */
	@GetMapping("/reviewedit.do")
	public String reviewedit(Model model, @RequestParam("seq") String seq) {
		AdoptReviewListDTO dto = adoptReviewListDAO.get(seq);
		model.addAttribute("AdoptReviewListDTO", dto);
		return "board/reviewedit";
	}
    /**
     * 입양 후기를 수정한 내용을 처리합니다.
     *
     * @param model 데이터를 뷰에 전달하는 모델 객체
     * @param dto 수정된 후기에 대한 DTO 객체
     * @return 수정된 후기의 상세 페이지로 리다이렉트하는 뷰의 이름
     */
		@PostMapping("/revieweditok.do")
		public String reviewediteok(Model model, @ModelAttribute AdoptReviewListDTO dto) {
			int result = adoptReviewListDAO.reviewedit(dto);
			return "redirect:/reviewdetail.do?seq=" + dto.getSeq();
		}
		
		
    /**
     * 입양 후기 삭제 확인 폼을 보여줍니다.
     *
     * @param model 데이터를 뷰에 전달하는 모델 객체
     * @param seq 삭제할 후기에 대한 고유 ID
     * @param id 삭제를 요청한 사용자 ID (선택적)
     * @return 삭제 확인 폼을 보여주는 뷰의 이름
     */
	@GetMapping("/reviewdel.do")
	public String reviewedel(Model model, @RequestParam("seq") String seq, String id) {
		AdoptReviewListDTO dto = adoptReviewListDAO.get(seq);
		model.addAttribute("AdoptReviewListDTO", dto);
		return "board/reviewdel";
		}
    /**
     * 입양 후기를 삭제하는 처리 메서드입니다.
     *
     * @param model 데이터를 뷰에 전달하는 모델 객체
     * @param dto 삭제할 후기에 대한 DTO 객체
     * @return 게시글 목록 페이지로 리다이렉트하는 뷰의 이름
     */
			@PostMapping("/reviewdelok.do")
			public String reviewedelok(Model model, AdoptReviewListDTO dto) {
				System.out.println("삭제번호: " + dto.getSeq()); // seq 값 출력
				int result = adoptReviewListDAO.reviewdel(dto);
				System.out.println("삭제결과: " + result);
				return "redirect:/review.do";
				
			}
	
}











