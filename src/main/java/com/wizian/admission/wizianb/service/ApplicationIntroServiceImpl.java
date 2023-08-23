package com.wizian.admission.wizianb.service;

import com.wizian.admission.wizianb.domain.ApplicationIntroduce;
import com.wizian.admission.wizianb.repository.ApplicationIntroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class ApplicationIntroServiceImpl implements ApplicationIntroService{

    private final ApplicationIntroRepository applicationIntroRepository;


    /*자소서 문항 찾아오기*/
    @Override
    public List<ApplicationIntroduce> findItem(String rcrtNo) {
        return applicationIntroRepository.findItem(rcrtNo);
    }
}