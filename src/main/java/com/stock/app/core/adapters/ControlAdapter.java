package com.stock.app.core.adapters;

import com.stock.app.core.results.Result;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlAdapter {
    Pattern pattern;
    Matcher matcher;

    public boolean checkEMail(String email){
        pattern = Pattern.compile("^(.+)@(.+)$");
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean checkCellPhone(String phone){
        pattern = Pattern
                .compile(
                    "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$"
                    + "| ((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}"
                    + "|^\\+\\d{10,12}"
                );
        matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean checkCellPhoneAndEmail(String phone,String email){
        return checkCellPhone(phone) && checkEMail(email);
    }
}
