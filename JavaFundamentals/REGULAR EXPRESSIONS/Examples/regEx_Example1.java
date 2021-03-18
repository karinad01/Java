package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx_Example1 {

    private Pattern pattern;

    private Matcher matcher;

    //declare string pattern for username

    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    public regEx_Example1(){
    pattern = Pattern.compile(USERNAME_PATTERN);
    }

    public boolean validateUserName(final String username){
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
