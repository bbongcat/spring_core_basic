package com.spring.core.basic.config;

import com.spring.core.basic.quiz.conputer.Computer;
import com.spring.core.basic.quiz.conputer.Keyboard;
import com.spring.core.basic.quiz.conputer.Monitor;
import com.spring.core.basic.quiz.conputer.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.Key;

@Configuration
public class QuizConfig {

    @Bean
    public Computer Computer() {
        return new Computer(keyboard(), mouse(), monitor());
    }

    @Bean
    public Keyboard keyboard() {
        return new Keyboard();
    }

    @Bean
    public Mouse mouse() {
        return new Mouse();
    }

    @Bean
    public Monitor monitor() {
        return new Monitor();
    }



}
