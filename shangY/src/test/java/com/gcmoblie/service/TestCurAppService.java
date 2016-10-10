package com.gcmoblie.service;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext*.xml" })
public class TestCurAppService {
    private static final Logger logger = Logger.getLogger(TestCurAppService.class);


    
    
    @Test
    public void curAccountForInvest() {
    }
}
