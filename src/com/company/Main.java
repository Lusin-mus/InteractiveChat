package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import static java.time.temporal.TemporalQueries.localDate;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int activeMembersCount=count;

        while (true) {

            Random rand = new Random();
            int min = 1;
            int max = 5;
            int random = rand.nextInt(max-min+1) + min;
            timeOfTheMessage();
            System.out.print("Member"+random+ " name:");

            int actionNumber=0;
            do {
                Scanner action = new Scanner(System.in);
                actionNumber = action.nextInt();
            }
            while (actionNumber != 1 && actionNumber!= 2);
            if (actionNumber == 1) {
                textMessage();
            }
            if (actionNumber == 2) {
                activeMembersCount--;

            }if (activeMembersCount == 0) {
                return;
            }
        }
    }

    private static void timeOfTheMessage() {
        LocalDateTime dateT = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDate = dateT.format(formatDate);
        System.out.print( formattedDate +"(date) ");
    }

    private static void textMessage() {
        Scanner member = new Scanner(System.in);
        System.out.print("text: ");
        String memberText = member.nextLine();
    }
}


