package com.test.pet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 동물 병원과 해당 병원의 지도 위치 정보를 담는 DTO (Data Transfer Object) 클래스입니다.
 * 이 클래스는 동물 병원 정보와 지도 정보를 결합하여 전달하는 역할을 합니다.
 * 
 *  
 */
@Getter
@Setter
public class HospitalMapDTO {

    /**
     * 동물 병원의 정보
     * AnimalHospitalDTO 객체로, 병원의 세부 정보를 포함합니다.
     */
    private AnimalHospitalDTO animalHospitalDTO;

    /**
     * 동물 병원의 지도 위치 정보
     * MapDTO 객체로, 병원의 위치를 지도상의 좌표(위도, 경도)로 표현합니다.
     */
    private MapDTO mapDTO;
}
