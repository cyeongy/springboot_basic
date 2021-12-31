package com.example.springboot_basic.web.dto;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class HelloResponseDtoTest {
    @Test
    public void test_lombok_function(){
        //given
        String name = "Test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
//        assertEquals(name, dto.getName());
//        assertEquals(amount, dto.getAmount());

    }

}