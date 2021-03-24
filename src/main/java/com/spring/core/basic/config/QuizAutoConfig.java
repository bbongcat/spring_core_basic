package com.spring.core.basic.config;

import com.spring.core.basic.quiz.conputer.Computer;
import com.spring.core.basic.quiz.conputer.Keyboard;
import com.spring.core.basic.quiz.conputer.Monitor;
import com.spring.core.basic.quiz.conputer.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.spring.core.basic.quiz")
public class QuizAutoConfig {



}
