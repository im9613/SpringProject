package com.test.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pet.dto.ShelterDTO;
import com.test.pet.mapper.InfoShelterMapper;

/**
 * 쉼터 관련 데이터베이스 작업을 처리하는 DAO 클래스입니다.
 * 쉼터 목록을 조회하는 기능을 제공합니다.
 * 
 * 
 */
@Repository
public class ShelterDAO {

	private final InfoShelterMapper sheltermapper;

    /**
     * 생성자 주입 방식으로 InfoShelterMapper 인스턴스를 주입받습니다.
     * 
     * @param sheltermapper InfoShelterMapper 인터페이스를 구현한 객체로,
     *                       데이터베이스에서 쉼터 정보를 조회하는 역할을 합니다.
     */
	@Autowired
	public ShelterDAO(InfoShelterMapper sheltermapper) {
		this.sheltermapper = sheltermapper;
    }
	
    /**
     * 데이터베이스에서 쉼터 목록을 조회하는 메서드입니다.
     * 
     * @return 쉼터 목록을 담고 있는 List 객체.
     *         각 항목은 ShelterDTO 객체로, 쉼터의 세부 정보를 포함합니다.
     */
	public List<ShelterDTO> getshelter() {
		return sheltermapper.getshelter();
	}



}
