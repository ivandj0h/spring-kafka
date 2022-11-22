package com.ivandjoh.springkafka.services.impl;

import com.ivandjoh.springkafka.dtos.Home;
import com.ivandjoh.springkafka.services.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public ResponseEntity<Home> home() {
        Home home = new Home();
        home.setCode(200);
        home.setMessage("Hello World");
        return ResponseEntity.ok(home);
    }

}
