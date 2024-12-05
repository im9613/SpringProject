package com.test.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.mapper.AdoptionApplicationMapper;
import com.test.pet.model.AdoptionApplication;

/**
 * 입양 신청서 서비스 클래스.
 * 
 * 이 클래스는 입양 신청서 관련 기능을 제공하며, 신청서를 저장하는 메서드를 포함합니다.
 * {@link AdoptionApplicationMapper}와 연동하여 입양 신청서 데이터를 처리합니다.
 * 
 */
@Service
public class AdoptionApplicationService {

    private final AdoptionApplicationMapper adoptionApplicationMapper;

    /**
     * 생성자 주입 방식으로 {@link AdoptionApplicationMapper}를 주입받습니다.
     * @param adoptionApplicationMapper {@link AdoptionApplicationMapper} 객체
     */
    @Autowired
    public AdoptionApplicationService(AdoptionApplicationMapper adoptionApplicationMapper) {
        this.adoptionApplicationMapper = adoptionApplicationMapper;
    }

    /**
     * 입양 신청서를 저장하는 메서드.
     * 
     * 이 메서드는 {@link AdoptionApplication} 객체를 받아서 데이터베이스에 저장합니다.
     * 
     * @param application 저장할 입양 신청서 객체
     */
    public void saveAdoptionApplication(AdoptionApplication application) {
        adoptionApplicationMapper.insertAdoptionApplication(application);
    }
}
