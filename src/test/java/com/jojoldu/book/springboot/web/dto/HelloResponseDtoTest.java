package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertEquals(dto.getName(), name); // assertThat 사용 지양이라 assertEquals 사용
        assertEquals(dto.getAmount(), amount);
    }

}