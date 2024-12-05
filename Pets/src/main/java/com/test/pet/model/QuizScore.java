package com.test.pet.model;

import lombok.Data;

/**
 * QuizScore 클래스는 퀴즈 결과 점수를 저장하는 모델 클래스입니다.
 * 사용자가 퀴즈를 통해 얻은 점수를 필드별로 저장하며, 총점을 계산하는 메서드를 제공합니다.
 * 이 클래스는 Lombok의 @Data 어노테이션을 사용하여 getter, setter, toString 등을 자동으로 생성합니다.
 */
@Data
public class QuizScore {

    /**
     * 각 질문에 대한 점수
     * q1부터 q10까지 각 퀴즈 항목에 대한 점수를 저장합니다.
     */
    private int q1;
    private int q2;
    private int q3;
    private int q4;
    private int q5;
    private int q6;
    private int q7;
    private int q8;
    private int q9;
    private int q10;

    /**
     * 퀴즈의 총점을 계산하는 메서드
     * @return 총점 (q1부터 q10까지의 합)
     */
    public int getTotalScore() {
        return q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10;
    }
}
