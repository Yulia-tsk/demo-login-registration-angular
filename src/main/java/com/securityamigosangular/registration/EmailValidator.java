package com.securityamigosangular.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service

public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //regex to test
        return true;
    }
}
