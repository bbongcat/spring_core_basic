package com.spring.core.basic.quiz.conputer;

public class Computer {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void computerInfo() {
        System.out.println("========== 컴퓨터 정보 ==========");
        monitor.info();
        mouse.info();
        keyboard.info();
    }
}
