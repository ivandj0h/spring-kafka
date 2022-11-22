package com.ivandjoh.springkafka.services;

import com.ivandjoh.springkafka.dtos.Home;
import org.springframework.http.ResponseEntity;

public interface HomeService {
    ResponseEntity<Home> home();
}
