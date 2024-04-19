package com.testjsp.demotest.sample;


import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2     //로그처리
@ExtendWith(SpringExtension.class) //Spring 동작-
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml") //설정정보위치
public class SampleTests {

    @Autowired  //의존성 주입 이걸 사용하지 않으면 의존성 주입이 일어나지 않는다.
    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testService1() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testConnection() throws Exception{
        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);

        connection.close();
    }

    @Test
    public void testSqlSessionFactory() throws Exception{

        log.info(sqlSessionFactory);
        Assertions.assertNotNull(sqlSessionFactory);
    }




}
