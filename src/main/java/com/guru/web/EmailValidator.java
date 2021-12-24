package com.guru.web;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class EmailValidator implements Predicate<String> {

    private static final Predicate<String> IS_EMAIL_VALID = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$")
            .asPredicate();

    @Override
    public boolean test(String email) {
        return IS_EMAIL_VALID.test(email);
    }
}
