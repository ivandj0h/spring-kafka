package com.ivandjoh.springkafka.controller;

import com.ivandjoh.springkafka.dtos.Home;
import com.ivandjoh.springkafka.services.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@Slf4j
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private HomeService homeService;

        @RequestMapping("/home")
        public ResponseEntity<Home> home() {

            log.info("Home controller was Hit");
            return homeService.home();
        }
}
