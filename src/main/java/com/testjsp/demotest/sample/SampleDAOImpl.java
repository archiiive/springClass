package com.testjsp.demotest.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository //<- 실제 불러와질 객체
@Qualifier("normal")
public class SampleDAOImpl implements SampleDAO {



}
