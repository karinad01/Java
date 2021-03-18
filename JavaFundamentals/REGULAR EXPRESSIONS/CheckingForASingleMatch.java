package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingForASingleMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String listOfNames = scan.nextLine();
        String regex = "\\b(?<firstName>[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+)\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(listOfNames);

        while (matcher.find()) {
            System.out.print(matcher.group("firstName") + " "+matcher.group("lastName")+ " ");
        }
    }
}
