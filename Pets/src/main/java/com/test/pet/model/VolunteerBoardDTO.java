package com.test.pet.model;

import lombok.Data;

/**
 * VolunteerBoardDTO 클래스는 자원봉사 게시판에 대한 정보를 담는 데이터 전송 객체(DTO)입니다.
 * 자원봉사 모집 공고에 관련된 정보를 저장하는데 사용됩니다.
 * 이 클래스는 Lombok의 @Data 어노테이션을 사용하여 getter, setter, toString 등을 자동으로 생성합니다.
 */
@Data
public class VolunteerBoardDTO {

    /**
     * 게시글 번호
     * 자원봉사 게시글의 고유 식별자.
     */
    private String seq;

    /**
     * 보호소 회원 ID
     * 자원봉사 게시글을 등록한 보호소 회원의 ID.
     */
    private String idMemberShelter;

    /**
     * 관리자 ID
     * 자원봉사 게시글을 관리하는 관리자 ID.
     */
    private String idAdmin;

    /**
     * 제목
     * 자원봉사 게시글의 제목.
     */
    private String title;

    /**
     * 내용
     * 자원봉사 게시글의 상세 내용.
     */
    private String content;

    /**
     * 자원봉사 시작 날짜
     * 자원봉사가 시작되는 날짜.
     */
    private String dateVolunteerStart;

    /**
     * 자원봉사 종료 날짜
     * 자원봉사가 종료되는 날짜.
     */
    private String dateVolunteerEnd;

    /**
     * 모집 시작 날짜
     * 자원봉사 모집이 시작되는 날짜.
     */
    private String dateRecruitStart;

    /**
     * 모집 종료 날짜
     * 자원봉사 모집이 종료되는 날짜.
     */
    private String dateRecruitEnd;

    /**
     * 등록 날짜
     * 자원봉사 게시글이 등록된 날짜.
     */
    private String regdate;

    /**
     * 모집 인원 수
     * 자원봉사 모집 공고에서 모집하려는 인원 수.
     */
    private String numCount;

}
