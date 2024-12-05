package com.test.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pet.dto.AnimalHospitalDTO;
import com.test.pet.mapper.InfoHospitalMapper;

/**
 * 동물 병원 관련 데이터베이스 작업을 처리하는 DAO 클래스입니다.
 * 동물 병원 정보를 데이터베이스에서 조회하는 역할을 합니다.
 * 
 *  
 */
@Repository
public class AnimalHospitalDAO {
	
	private final InfoHospitalMapper hospitalmapper;
	
    /**
     * 생성자 주입 방식으로 InfoHospitalMapper 인스턴스를 주입받습니다.
     * 
     * @param hospitalmapper InfoHospitalMapper 인터페이스를 구현한 객체로,
     *                       데이터베이스에서 동물 병원 정보를 조회하는 역할을 합니다.
     */
	@Autowired
	public AnimalHospitalDAO(InfoHospitalMapper hospitalmapper) {
		this.hospitalmapper = hospitalmapper;
	}

    /**
     * 동물 병원 목록을 조회하는 메서드입니다.
     * 
     * @return 동물 병원 정보를 담고 있는 List 객체.
     *         각 항목은 link AnimalHospitalDTO 객체로, 병원의 세부 정보를 포함합니다.
     */
	public List<AnimalHospitalDTO> getHospital() {
		return hospitalmapper.getHospital();
	}


}
