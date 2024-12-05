package com.test.pet.mapper;

import java.util.List;

import com.test.pet.dto.AdoptReviewListDTO;

/**
 * 입양 후기와 관련된 데이터베이스 작업을 처리하는 MyBatis Mapper 인터페이스입니다.
 * 이 인터페이스는 입양 후기 목록 조회, 추가, 수정, 삭제와 관련된 SQL 매핑을 담당합니다.
 * 
 * 
 */
public interface AdoptReviewMapper {

    /**
     * 입양 후기 목록을 조회합니다.
     * 
     * @return 입양 후기 목록을 담고 있는 List 객체. 각 항목은 AdoptReviewListDTO 객체입니다.
     */
    public List<AdoptReviewListDTO> list();
    
    /**
     * 새로운 입양 후기를 데이터베이스에 추가합니다.
     * 
     * @param dto 추가할 입양 후기 정보를 담고 있는 AdoptReviewListDTO 객체
     * @return 추가된 후기의 개수 (1이면 성공, 0이면 실패)
     */
    public int add(AdoptReviewListDTO dto);
    
    /**
     * 특정 입양 후기를 조회합니다.
     * 
     * @param seq 조회할 후기의 고유 ID
     * @return 조회된 입양 후기 정보가 담긴AdoptReviewListDTO 객체
     */
    AdoptReviewListDTO get(String seq);

    /**
     * 입양 후기를 수정합니다.
     * 
     * @param dto 수정된 입양 후기 정보를 담고 있는 AdoptReviewListDTO 객체
     * @return 수정된 후기의 개수 (1이면 성공, 0이면 실패)
     */
    public int edit(AdoptReviewListDTO dto);

    /**
     * 특정 입양 후기를 삭제합니다.
     * 
     * @param dto 삭제할 입양 후기 정보를 담고 있는 AdoptReviewListDTO 객체
     * @return 삭제된 후기의 개수 (1이면 성공, 0이면 실패)
     */
    public int del(AdoptReviewListDTO dto);
}
