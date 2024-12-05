package com.test.pet.mapper;

import java.util.List;

import com.test.pet.dto.AnimalHospitalDTO;

/**
 * 동물 병원 관련 데이터베이스 작업을 수행하는 MyBatis Mapper 인터페이스입니다.
 * 이 인터페이스는 동물 병원 목록을 조회하는 SQL 쿼리와 매핑됩니다.
 * 
 * 
 */
public interface InfoHospitalMapper {

    /**
     * 데이터베이스에서 동물 병원 목록을 조회하는 메서드입니다.
     * 
     * @return 동물 병원 목록을 담고 있는 List 객체.
     *         각 항목은 AnimalHospitalDTO 객체로, 병원의 세부 정보를 포함합니다.
     */
	public List<AnimalHospitalDTO> getHospital();

}
