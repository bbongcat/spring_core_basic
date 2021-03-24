package com.spring.core.basic.singleton;

import com.spring.core.basic.config.AppConfig;
import com.spring.core.basic.config.TestConfig;
import com.spring.core.basic.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너 테스트")
    void pureContainer() {

        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }

    @Test
    @DisplayName("스프링 컨테이너를 통한 싱글톤 테스트")
    void springContainer() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean(MemberService.class);
        MemberService memberService2 = ac.getBean(MemberService.class);

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }

    @Test
    @DisplayName("")
    void statefulTest() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //첫번째 사용자가 statefulService1로 주문
        statefulService1.order("김철수", 10000);

        //두번째 사용자가 statefulService2로 주문
        statefulService2.order("박영희", 20000);

        //첫번째 사용자가 주문 금액 조회
        System.out.println("1번 사용자 주문 금액 = " + statefulService1.getPrice());

        //두번째 사용자가 주문 금액 조회
        System.out.println("2번 사용자 주문 금액 = " + statefulService2.getPrice());

        //박영희의 주문으로 인해 주문 금액이 둘 다 20000원이 됨
        //주문 가격 등의 변동 정보는 Bean 등록 클래스에 저장해 싱글톤 등록하지 말고 도메인 클래스에 저장해둘 것

    }
}
