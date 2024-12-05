package com.test.pet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 지도 위치 정보를 담는 DTO (Data Transfer Object) 클래스입니다.
 * 이 클래스는 특정 위치의 위도(latitude)와 경도(longitude) 값을 포함합니다.
 * 
 *  
 */
@Getter
@Setter
public class MapDTO {

    /**
     * 위치 정보의 고유 ID
     */
    private String seq;

    /**
     * 위치의 위도 값
     * 지도 상에서 해당 위치의 북쪽/남쪽 좌표를 나타냅니다.
     */
    private String latitude;

    /**
     * 위치의 경도 값
     * 지도 상에서 해당 위치의 동쪽/서쪽 좌표를 나타냅니다.
     */
    private String longitude;
}
