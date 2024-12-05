package com.test.pet.mapper;

import java.util.List;

import com.test.pet.model.VolunteerBoardDTO;

/**
 * 자원봉사 게시판 관련 데이터베이스 매퍼 인터페이스.
 * 
 * 이 인터페이스는 자원봉사 게시판의 CRUD(Create, Read, Update, Delete) 작업을 수행하는
 * MyBatis 쿼리 매핑 메서드를 제공합니다. {@link VolunteerBoardDTO} 객체를 사용하여
 * 자원봉사 게시판 정보를 처리합니다.
 * 
 */
public interface VolunteerMapper {

    /**
     * 자원봉사 게시판 목록을 조회하는 메서드.
     * 
     * 이 메서드는 자원봉사 게시판의 모든 항목을 리스트로 조회하여 반환합니다.
     * 
     * 
     * @return {@link VolunteerBoardDTO} 객체들의 리스트
     */
    public List<VolunteerBoardDTO> list();

    /**
     * 자원봉사 게시판에 새 항목을 추가하는 메서드.
     * 
     * 이 메서드는 새로운 자원봉사 게시글을 추가합니다.
     * 
     * 
     * @param dto 자원봉사 게시글 정보가 담긴 {@link VolunteerBoardDTO} 객체
     * @return 추가된 행의 수 (1이 성공, 0이 실패)
     */
    public int add(VolunteerBoardDTO dto);

    /**
     * 자원봉사 게시판에서 특정 게시글을 조회하는 메서드.
     * 
     * 주어진 게시글 번호(`seq`)를 기준으로 게시글 정보를 조회하여 반환합니다.
     * 
     * 
     * @param seq 조회할 게시글의 고유 번호
     * @return 해당 게시글의 {@link VolunteerBoardDTO} 객체
     */
    VolunteerBoardDTO get(String seq);

    /**
     * 자원봉사 게시판의 게시글을 수정하는 메서드.
     * 
     * 주어진 {@link VolunteerBoardDTO} 객체를 사용하여 기존의 자원봉사 게시글 정보를 수정합니다.
     * 
     * 
     * @param dto 수정할 자원봉사 게시글 정보가 담긴 {@link VolunteerBoardDTO} 객체
     * @return 수정된 행의 수 (1이 성공, 0이 실패)
     */
    public int edit(VolunteerBoardDTO dto);

    /**
     * 자원봉사 게시판에서 게시글을 삭제하는 메서드.
     * 
     * 주어진 {@link VolunteerBoardDTO} 객체를 기준으로 자원봉사 게시글을 삭제합니다.
     * 
     * 
     * @param dto 삭제할 자원봉사 게시글 정보가 담긴 {@link VolunteerBoardDTO} 객체
     * @return 삭제된 행의 수 (1이 성공, 0이 실패)
     */
    public int del(VolunteerBoardDTO dto);
}
