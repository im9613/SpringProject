package com.test.pet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.pet.model.AdoptionApplication;

/**
 * AdoptionApplicationMapper 인터페이스는 입양 신청서와 관련된 데이터베이스 작업을 처리하는 매퍼입니다.
 * MyBatis를 사용하여 SQL 쿼리를 매핑합니다.
 */
@Mapper
public interface AdoptionApplicationMapper {

    /**
     * 입양 신청서를 데이터베이스에 저장하는 메소드
     * @param adoptionApplication 저장할 입양 신청서 객체
     */
    void insertAdoptionApplication(AdoptionApplication adoptionApplication);

    /**
     * 모든 입양 신청서를 조회하는 메소드
     * @return 모든 입양 신청서의 리스트
     */
    List<AdoptionApplication> getAllAdoptionApplications();
}
