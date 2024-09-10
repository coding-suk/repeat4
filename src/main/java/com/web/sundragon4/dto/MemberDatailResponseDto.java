package com.web.sundragon4.dto;

import lombok.Getter;

@Getter
public class MemberDatailResponseDto {

    private final Long id;
    private final String name;

    public MemberDatailResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
