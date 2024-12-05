package com.test.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.dao.AnimalHospitalDAO;
import com.test.pet.dto.AnimalHospitalDTO;

/**
 * HospitalService 클래스는 동물 병원과 관련된 서비스 로직을 처리하는 서비스 클래스입니다.
 * AnimalHospitalDAO를 통해 동물 병원에 관련된 데이터를 가져오거나 처리하는 역할을 합니다.
 */
@Service
public class HospitalService {

    /**
     * AnimalHospitalDAO 객체
     * AnimalHospitalDAO를 사용하여 동물 병원 데이터를 처리합니다.
     */
    private final AnimalHospitalDAO animalHospitalDAO;

    /**
     * 생성자
     * HospitalService 클래스의 생성자로, AnimalHospitalDAO 객체를 주입받습니다.
     * @param animalHospitalDAO AnimalHospitalDAO 객체
     */
    @Autowired
    public HospitalService(AnimalHospitalDAO animalHospitalDAO) {
        this.animalHospitalDAO = animalHospitalDAO;
    }

    /**
     * 동물 병원 목록을 반환하는 메소드
     * AnimalHospitalDAO를 사용하여 동물 병원 데이터를 가져오고, 이를 리스트 형태로 반환합니다.
     * @return 동물 병원 목록을 담은 리스트
     */
    public List<AnimalHospitalDTO> getAnimalHospitals() {
        // AnimalHospitalDAO의 getHospital 메소드를 호출하여 동물 병원 목록을 가져옵니다.
        return animalHospitalDAO.getHospital();  
    }
}
