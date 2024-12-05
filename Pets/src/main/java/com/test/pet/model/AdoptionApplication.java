package com.test.pet.model;

import lombok.Data;

/**
 * 입양 신청서 모델 클래스.
 * 이 클래스는 사용자가 입양 신청을 할 때 제출하는 신청서 정보를 담고 있습니다. 
 * 사용자가 제출한 개인정보와 설문 응답을 저장하는 필드들을 포함하고 있습니다.
 * 
 * Lombok 라이브러리의 @Data 어노테이션을 사용하여 getter, setter, toString, equals, hashCode 등을 자동 생성합니다.
 */
@Data
public class AdoptionApplication {

    /**
     * 신청자의 이름
     */
    private String name;

    /**
     * 신청자의 성별
     */
    private String gender;

    /**
     * 신청자의 나이
     */
    private String age;

    /**
     * 신청자의 전화번호
     */
    private String telephone;

    /**
     * 신청자의 이메일 주소
     */
    private String email;

    /**
     * 신청자가 전화를 받을 수 있는 시간
     */
    private String calltime;

    /**
     * 신청자의 거주 지역
     */
    private String region;

    /**
     * 신청자의 혼인 여부
     */
    private String maritalStatus;

    /**
     * 신청자의 직업
     */
    private String job;

    /**
     * 질문 1에 대한 답변
     */
    private String q1;

    /**
     * 질문 1에 대한 추가 메모
     */
    private String q1Memo;

    /**
     * 질문 2에 대한 답변
     */
    private String q2;

    /**
     * 질문 3 (성인) 에 대한 답변
     */
    private String q3Adult;

    /**
     * 질문 3 (미성년자) 에 대한 답변
     */
    private String q3Minor;

    /**
     * 질문 4에 대한 답변
     */
    private String q4;

    /**
     * 질문 5에 대한 답변
     */
    private String q5;

    /**
     * 질문 6에 대한 추가 메모
     */
    private String q6Memo;

    /**
     * 질문 7에 대한 답변
     */
    private String q7;

    /**
     * 질문 8에 대한 답변
     */
    private String q8;

    /**
     * 질문 9에 대한 답변
     */
    private String q9;

    /**
     * 질문 10에 대한 답변
     */
    private String q10;

    /**
     * 질문 11에 대한 답변
     */
    private String q11;

    /**
     * 질문 12에 대한 답변
     */
    private String q12;

    /**
     * 질문 13에 대한 답변
     */
    private String q13;

    /**
     * 입양 신청서의 정보를 문자열로 반환하는 메서드.
     * 이 메서드는 AdoptionApplication 객체의 모든 필드를 문자열 형태로 반환합니다.
     * 
     * @return AdoptionApplication 객체의 필드를 포함한 문자열
     */
    @Override
    public String toString() {
        return "AdoptionApplication{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", calltime='" + calltime + '\'' +
                ", region='" + region + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", job='" + job + '\'' +
                ", q1=" + q1 +
                ", q1Memo='" + q1Memo + '\'' +
                ", q2=" + q2 +
                ", q3Adult=" + q3Adult +
                ", q3Minor=" + q3Minor +
                ", q4=" + q4 +
                ", q5=" + q5 +
                ", q6Memo='" + q6Memo + '\'' +
                ", q7=" + q7 +
                ", q8='" + q8 + '\'' +
                ", q9='" + q9 + '\'' +
                ", q10='" + q10 + '\'' +
                ", q11=" + q11 +
                ", q12=" + q12 +
                ", q13='" + q13 + '\'' +
                '}';
    }
}
