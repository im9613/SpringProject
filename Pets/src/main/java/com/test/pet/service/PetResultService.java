package com.test.pet.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.mapper.PetResultMapper;
import com.test.pet.model.PetResult;

/**
 * PetResultService 클래스는 반려동물 결과와 관련된 서비스 로직을 처리하는 클래스입니다.
 * PetResultMapper를 사용하여 반려동물의 결과를 조회하고, 특정 점수에 맞는 결과를 랜덤으로 반환합니다.
 */
@Service
public class PetResultService {

    /**
     * PetResultMapper 객체
     * PetResultMapper를 통해 데이터베이스에서 반려동물의 결과를 조회합니다.
     */
    @Autowired
    private PetResultMapper petResultMapper;

    /**
     * 총 점수에 해당하는 반려동물 결과를 랜덤하게 반환하는 메소드
     * @param totalScore 사용자가 입력한 총 점수
     * @return 해당 점수에 맞는 랜덤 반려동물 결과
     */
    public PetResult getRandomResultByScore(int totalScore) {
        // totalScore에 맞는 반려동물 결과를 데이터베이스에서 조회
        List<PetResult> results = petResultMapper.findResultsByScore(totalScore);
        
        // 결과가 존재하고, 비어있지 않다면 랜덤하게 하나의 결과를 반환
        if (results != null && !results.isEmpty()) {
            Random random = new Random();
            return results.get(random.nextInt(results.size()));
        }
        
        // 결과가 없으면 null을 반환
        return null;
    }
}
