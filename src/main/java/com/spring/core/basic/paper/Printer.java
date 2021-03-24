package com.spring.core.basic.paper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {

    //생성자 주입
    //@Autowired
    public Printer(Paper paper) {
        //this.paper = paper;
    }

    //수정자 주입(setter 주입)
    /*@Autowired
    public void setPaper(Paper paper) {
        this.paper = paper;
    }*/

    //필드 주입
    @Autowired
    private Paper paper;


    //용지 출력 기능
    public void printPaper() {
        System.out.println("========= 출력 내용 ========");
        for (String data : paper.datas) {
            System.out.println("# " + data);
        }
    }
}
