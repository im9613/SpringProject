package com.test.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.pet.dao.AdoptReviewListDAO;
import com.test.pet.dto.AdoptReviewListDTO;

@Controller
public class InfoDetail {
	
	@Autowired
	private AdoptReviewListDAO adoptReviewListDAO;
	
	/*
	 * //상세 조회
	 * 
	 * @GetMapping("/infodetail.do") public String infodetail(Model model, String
	 * seq) { AdoptReviewListDTO dto = adoptReviewListDAO.get(seq);
	 * 
	 * model.addAttribute("AdoptReviewListDTO", dto); }
	 */
	
}
