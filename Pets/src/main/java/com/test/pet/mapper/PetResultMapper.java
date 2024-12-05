package com.test.pet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.test.pet.model.PetResult;

/**
 * 애완동물 결과 관련 데이터베이스 매퍼 인터페이스.
 * 
 * 이 인터페이스는 애완동물의 결과를 조회하는 SQL 쿼리를 매핑하는 역할을 합니다.
 * MyBatis와 연동되어 {@link PetResult} 객체를 반환하는 쿼리 메서드를 제공합니다.
 * 
 */
@Mapper
@Repository
public interface PetResultMapper {

    /**
     * 점수에 해당하는 애완동물 결과 목록을 조회하는 메서드.
     * 
     * 이 메서드는 주어진 점수를 기준으로 애완동물 결과를 조회하여 목록으로 반환합니다.
     * 
     * 
     * @param score 점수를 기준으로 애완동물 결과를 조회합니다.
     * @return 주어진 점수에 해당하는 {@link PetResult} 객체들의 리스트.
     */
    List<PetResult> findResultsByScore(@Param("score") int score);
}
