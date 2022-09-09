package com.main.user;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var user = new User("jj", "ss", "ss", LocalDate.of(2022, 12, 2));
        System.out.println(user);
    }
}
