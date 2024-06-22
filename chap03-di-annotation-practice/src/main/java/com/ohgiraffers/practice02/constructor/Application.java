package com.ohgiraffers.practice02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.practice02.constructor");

        MemberService memberService = context.getBean("memberService", MemberService.class);
        System.out.println(memberService.selectMember());
    }
}
