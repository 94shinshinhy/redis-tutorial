package com.example.demo.redis;

import lombok.Data;

@Data
public class RedisReqDto {
    private String key;
    private String value;
}
