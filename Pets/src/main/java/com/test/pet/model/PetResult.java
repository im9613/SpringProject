package com.test.pet.model;

import lombok.Data;

/**
 * PetResult 클래스는 애완동물 추천 결과를 저장하는 모델 클래스입니다.
 * 사용자의 퀴즈 결과에 따라 추천되는 애완동물에 대한 정보를 포함합니다.
 * 이 클래스는 Lombok의 @Data 어노테이션을 사용하여 getter, setter, toString 등을 자동으로 생성합니다.
 */
@Data
public class PetResult {

    /**
     * 추천 결과의 고유 식별자 (예: DB에서의 순번)
     */
    private String seq;

    /**
     * 추천 결과의 최소 점수 (범위 설정)
     */
    private String minScore;

    /**
     * 추천 결과의 최대 점수 (범위 설정)
     */
    private String maxScore;

    /**
     * 해당 점수 범위에 맞는 추천 결과
     * 예: "강아지", "고양이" 등
     */
    private String result;

    /**
     * 추천된 애완동물에 대한 상세 추천 사항
     * 예: "이 동물은 활발하고 친구가 많습니다."
     */
    private String recommended;
}
