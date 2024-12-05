package com.test.pet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 동물 병원 정보를 담는 DTO (Data Transfer Object) 클래스입니다.
 * 이 클래스는 동물 병원의 세부 정보를 표현합니다.
 * 
 *  
 */
@Getter
@Setter
public class AnimalHospitalDTO {

    /**
     * 동물 병원의 고유 ID
     */
    private String seq;

    /**
     * 병원의 위치 ID
     */
    private String seqLocation;

    /**
     * 병원의 지도 위치 ID
     */
    private String seqMap;

    /**
     * 병원의 주소
     */
    private String address;

    /**
     * 병원의 이름
     */
    private String name;

    /**
     * 병원의 전화번호
     */
    private String telephone;

    /**
     * 병원의 운영 시간
     */
    private String hour;

    /**
     * 병원의 위도 (지도에서의 위치)
     */
    private String latitude;

    /**
     * 병원의 경도 (지도에서의 위치)
     */
    private String longitude;
}
