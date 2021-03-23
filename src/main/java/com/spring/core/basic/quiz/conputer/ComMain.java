package com.spring.core.basic.quiz.conputer;

import com.spring.core.basic.config.QuizConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComMain {

    /*
        1. config 패키지에 QuizConfig라는 설정 클래스를 만든 후
           Computer, Keyboard, Mouse, Monitor 빈을 각각 등록한 뒤
        2. 설정 파일에서 Computer 빈을 취득하여
        3. ComputerInfo() 메서드를 호출하여 정상작동하게 하세요.
     */

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(QuizConfig.class);

        Computer computer = context.getBean(Computer.class);
        computer.computerInfo();
    }
}
