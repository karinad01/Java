package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx_Example2 {
    private Pattern pattern;

    private Matcher matcher;

    private static final String EMAIL_PATTERN =
            "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public regEx_Example2(){
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validateMail(final String checkedMail){
        matcher = pattern.matcher(checkedMail);
        return matcher.matches();
    }

}
