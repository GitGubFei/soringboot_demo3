package com.iefei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Springboot08SsmpApplicationTests {
    @Test
    void testJdbcTemp(@Autowired JdbcTemplate jdbcTemplate){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from tb_book");
        System.out.println(maps);
    }
}
