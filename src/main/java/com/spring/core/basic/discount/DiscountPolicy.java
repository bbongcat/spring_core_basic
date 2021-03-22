package com.spring.core.basic.discount;

import com.spring.core.basic.member.Member;

public interface DiscountPolicy {


    /**
     * 할인정책 별 할인액 계산 기능
     * @param member - 할인 대상 회원
     * @param price - 구매 금액
     * @return 할인 금액
     */

    int discount(Member member, int price);
}
