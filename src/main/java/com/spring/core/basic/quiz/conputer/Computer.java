package com.spring.core.basic.quiz.conputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;


    //@Autowired
    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    @Autowired
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Autowired
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Autowired
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void computerInfo() {
        System.out.println("========== 컴퓨터 정보 ==========");
        monitor.info();
        mouse.info();
        keyboard.info();
    }
}
