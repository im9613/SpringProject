package com.test.pet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 보호소 정보와 해당 보호소의 지도 위치 정보를 결합한 DTO (Data Transfer Object) 클래스입니다.
 * 이 클래스는 보호소 정보와 지도 위치 정보를 함께 전달하기 위해 사용됩니다.
 * 
 *  
 */
@Getter
@Setter
public class ShelterMapDTO {

    /**
     * 보호소 정보
     * ShelterDTO 객체로, 보호소의 세부 정보를 포함합니다.
     */
    private ShelterDTO shelterDTO;

    /**
     * 보호소의 지도 위치 정보
     * MapDTO 객체로, 보호소의 위치를 지도상의 좌표(위도, 경도)로 표현합니다.
     */
    private MapDTO mapDTO;
}
