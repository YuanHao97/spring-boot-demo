package com.example.demo.service;


import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class BaseService {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BaseService.class);
    public BaseService() {
        log.info("BaseService init");
    }
}
