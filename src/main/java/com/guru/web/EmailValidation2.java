package com.guru.web;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation2{
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("javaTpoint@domain.co.in");  
        emails.add("javaTpoint@domain.com");  
        emails.add("javaT-point#@domain.co.in");  
        emails.add("javaT_point@domain.com");  
        emails.add("javaTpoint@domaincom");  
        //Add invalid emails in list  
        emails.add
                ("@yahoo.com");
        emails.add("12javaTpoint#domain.com");  
        //Regular Expression   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list
        EmailValidator em=new EmailValidator();
        System.out.println(em.test("aa@aa.com"));

        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  