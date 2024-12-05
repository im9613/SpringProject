package com.test.pet.mapper;

import java.util.List;

import com.test.pet.model.VolunteerBoardDTO;

/**
 * VolunteerMapper 인터페이스는 자원봉사 게시판과 관련된 데이터베이스 작업을 처리하는 매퍼입니다.
 * MyBatis를 사용하여 SQL 쿼리를 매핑합니다.
 */
public interface VolunteerMapper {

    /**
     * 자원봉사 게시판 목록을 조회하는 메소드
     * @return 자원봉사 게시판에 등록된 모든 게시글의 리스트
     */
    public List<VolunteerBoardDTO> list();

    /**
     * 자원봉사 게시글을 추가하는 메소드
     * @param dto 추가할 자원봉사 게시글 DTO 객체
     * @return 추가된 게시글의 개수 (성공 시 1, 실패 시 0)
     */
    public int add(VolunteerBoardDTO dto);

    /**
     * 자원봉사 게시글을 조회하는 메소드
     * @param seq 게시글의 고유 ID
     * @return 조회된 자원봉사 게시글 DTO 객체
     */
    public VolunteerBoardDTO get(String seq);

    /**
     * 자원봉사 게시글을 수정하는 메소드
     * @param dto 수정할 자원봉사 게시글 DTO 객체
     * @return 수정된 게시글의 개수 (성공 시 1, 실패 시 0)
     */
    public int edit(VolunteerBoardDTO dto);

    /**
     * 자원봉사 게시글을 삭제하는 메소드
     * @param dto 삭제할 자원봉사 게시글 DTO 객체
     * @return 삭제된 게시글의 개수 (성공 시 1, 실패 시 0)
     */
    public int del(VolunteerBoardDTO dto);
}
