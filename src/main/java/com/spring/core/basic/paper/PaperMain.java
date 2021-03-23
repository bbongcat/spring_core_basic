package com.spring.core.basic.paper;

import com.spring.core.basic.config.PrinterConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaperMain {

    public static void main(String[] args) {

        //스프링 컨테이너 객체 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(PrinterConfig.class);

        //컨테이너에서 스프링 빈을 취득
        Printer printer = context.getBean(Printer.class);

        printer.printPaper();
    }
}
