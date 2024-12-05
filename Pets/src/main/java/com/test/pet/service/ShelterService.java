package com.test.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.dao.ShelterDAO;
import com.test.pet.dto.ShelterDTO;

/**
 * ShelterService 클래스는 보호소와 관련된 서비스 로직을 처리하는 클래스입니다.
 * ShelterDAO를 사용하여 데이터베이스에서 보호소 정보를 조회하고 반환합니다.
 */
@Service
public class ShelterService {

    /**
     * ShelterDAO 객체
     * ShelterDAO를 통해 데이터베이스에서 보호소 정보를 조회합니다.
     */
    private final ShelterDAO shelterDAO;

    /**
     * ShelterService 생성자
     * @param shelterDAO ShelterDAO 객체를 주입받아 초기화합니다.
     */
    @Autowired
    public ShelterService(ShelterDAO shelterDAO) {
        this.shelterDAO = shelterDAO;
    }

    /**
     * 모든 보호소 목록을 반환하는 메소드
     * @return ShelterDTO 객체 리스트
     */
    public List<ShelterDTO> getShelters() {
        // ShelterDAO에서 보호소 목록을 가져옵니다.
        return shelterDAO.getshelter();
    }
}
