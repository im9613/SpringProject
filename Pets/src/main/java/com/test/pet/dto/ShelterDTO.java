package com.test.pet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 보호소 정보를 담는 DTO (Data Transfer Object) 클래스입니다.
 * 이 클래스는 보호소의 세부 정보를 표현하며, 위치와 관련된 정보를 포함합니다.
 * 
 *  
 */
@Getter
@Setter
public class ShelterDTO {

    /**
     * 보호소의 고유 ID
     */
    private String seq;

    /**
     * 보호소의 위치 ID
     * 보호소가 위치한 장소의 고유 식별자
     */
    private String seqLoacation;

    /**
     * 보호소의 지도 위치 ID
     * 보호소가 위치한 곳의 지도 좌표를 나타내는 고유 ID
     */
    private String seqMap;

    /**
     * 보호소의 이름
     */
    private String name;

    /**
     * 보호소의 전화번호
     */
    private String telephone;

    /**
     * 보호소의 주소
     */
    private String address;

    /**
     * 보호소의 웹사이트 주소
     */
    private String webaddress;

    /**
     * 보호소의 위도
     * 지도 상에서 보호소의 북쪽/남쪽 위치를 나타내는 값
     */
    private String latitude;

    /**
     * 보호소의 경도
     * 지도 상에서 보호소의 동쪽/서쪽 위치를 나타내는 값
     */
    private String longitude;
}
