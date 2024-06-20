package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {
    @Bean
    public MemberDTO memberGenerator(){
    return new MemberDTO(1L, "shrimp wonton");
    }

    @Bean
    public BoardDTO boardGenerator(){
        BoardDTO board = new BoardDTO();
        board.setId(1L);
        board.setTitle("오노추 해주세요");
        board.setContent("오늘 운동할 떄 들을 노래 추천 해주세요");
        board.setWriter(memberGenerator());
        return board;
    }
}
