package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FService {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FService.class);
    @Autowired
    BaseService baseService;
    public FService() {
        log.info("FService init");
    }
}
