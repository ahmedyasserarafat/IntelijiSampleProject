package com.guru.web;


import org.junit.jupiter.api.*;

class EmailValidatorTest {

    private EmailValidator em=null;
    @BeforeEach
    void setUp() {
        em=new EmailValidator();
    }

    @AfterEach
    void tearDown() {
        em=null;
    }

    @DisplayName("Testing the Email Validator Test Method")
    @Test
    void test1() {
        Assertions.assertTrue(em.test("aa@aa.com"));
    }

    @DisplayName("Testing the Email Validator Test False Method")
    @Test
    void test2() {
        Assertions.assertFalse(em.test("aaa.com"));
    }

}