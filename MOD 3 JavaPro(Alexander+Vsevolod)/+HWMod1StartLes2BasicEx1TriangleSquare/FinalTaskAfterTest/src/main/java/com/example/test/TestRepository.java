package com.example.test;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    public int add(int a, int b) {
        return a + b;
    }
}
