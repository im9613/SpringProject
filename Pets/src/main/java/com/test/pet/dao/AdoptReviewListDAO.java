package com.test.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pet.dto.AdoptReviewListDTO;
import com.test.pet.mapper.AdoptReviewMapper;

/**
 * 입양 후기 관련 데이터베이스 작업을 처리하는 DAO 클래스입니다.
 * 입양 후기 목록 조회, 추가, 수정, 삭제 작업을 수행합니다.
 * 
 * 
 */
@Repository
public class AdoptReviewListDAO {

	  	@Autowired
	    private AdoptReviewMapper mapper;
	  

	    /**
	     * 입양 후기 목록을 조회합니다.
	     * 
	     * @return 입양 후기 목록을 담고 있는 List
	     */
	    public List<AdoptReviewListDTO> getAdoptReviewList() {
	        return mapper.list();
	    }
	    
	    /**
	     * 새로운 입양 후기를 추가합니다.
	     *
	     * @param dto 추가할 입양 후기 정보를 담고 있는 DTO 객체
	     * @return 추가된 후기의 개수 (1이면 성공, 0이면 실패)
	     */
	    public int add(AdoptReviewListDTO dto) {
	        return mapper.add(dto);
	    }
	    
	    /**
	     * 특정 입양 후기를 조회합니다.
	     *
	     * @param seq 조회할 후기의 고유 ID (seq)
	     * @return 조회된 입양 후기 정보가 담긴 DTO 객체
	     */
		public AdoptReviewListDTO get(String seq) {
			return mapper.get(seq);
		}
		
	    /**
	     * 입양 후기를 수정합니다.
	     *
	     * @param dto 수정된 입양 후기 정보를 담고 있는 DTO 객체
	     * @return 수정된 후기의 개수 (1이면 성공, 0이면 실패)
	     */
		public int reviewedit(AdoptReviewListDTO dto) {
			  return mapper.edit(dto);
		}

	    /**
	     * 특정 입양 후기를 삭제합니다.
	     *
	     * @param dto 삭제할 후기의 정보를 담고 있는 DTO 객체
	     * @return 삭제된 후기의 개수 (1이면 성공, 0이면 실패)
	     */
		public int reviewdel(AdoptReviewListDTO dto) {
			return mapper.del(dto);
		}
	}