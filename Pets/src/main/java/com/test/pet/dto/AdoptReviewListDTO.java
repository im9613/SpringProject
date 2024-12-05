package com.test.pet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 입양 후기 정보를 담는 DTO (Data Transfer Object) 클래스입니다.
 * 이 클래스는 입양 후기의 세부 정보를 표현합니다.
 * 
 *  
 */
@Getter
@Setter
public class AdoptReviewListDTO {

    /**
     * 입양 후기 고유 ID
     */
    private String seq;

    /**
     * 후기 작성자의 회원 ID
     */
    private String idMember;

    /**
     * 후기 관리자 ID
     */
    private String idAdmin;

    /**
     * 입양된 동물의 고유 ID
     */
    private String seqPet;

    /**
     * 후기 제목
     */
    private String title;

    /**
     * 후기 내용
     */
    private String content;

    /**
     * 후기 이미지 URL
     */
    private String image;

    /**
     * 후기 등록 날짜
     */
    private String regdate;
}
