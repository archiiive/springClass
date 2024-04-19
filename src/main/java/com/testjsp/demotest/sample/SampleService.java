package com.testjsp.demotest.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor
public class SampleService {

    //@Autowired  //의존성을 주입해준다. <- 1,
    @Qualifier("event")
    private final SampleDAO sampleDAO;    //
    //final로 지정하고 RequiredArgsConstructor 지정 생성자 주입이 일어난 것 <- 2

    //@Autowired
//    public  void  setSampleDAO(SampleDAO sampleDAO1) {
//        this.sampleDAO = sampleDAO1;
//    }



}
