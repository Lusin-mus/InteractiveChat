package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.temporal.TemporalQueries.localDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type count of chat members");
        Scanner input = new Scanner(System.in);
        int membersCount = input.nextInt();
        ArrayList<String> listOfChatMembers = new ArrayList<>(membersCount);
        for (int i = 1; i <= membersCount; i++) {
            listOfChatMembers.add("member" + i + " name: ");
        }

        while (true) {
            printTimeOfTheMessage();
            printName(listOfChatMembers);
            if (listOfChatMembers.isEmpty()) {
                return;
            }
        }
    }

    private static void printTimeOfTheMessage() {
        LocalDateTime dateT = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDate = dateT.format(formatDate);
        System.out.print(formattedDate + "(date) ");
    }

    private static void printMessage() {
        Scanner member = new Scanner(System.in);
        System.out.print("text: ");
        String memberText = member.nextLine();
    }

    private static void printName(ArrayList<String> listOfChatMembers) {
        Random rand = new Random();
        String randomString = listOfChatMembers.get(rand.nextInt(listOfChatMembers.size()));
        System.out.print(randomString);

        int actionNumber = 0;
        do {
            Scanner action = new Scanner(System.in);
            actionNumber = action.nextInt();
        }
        while (actionNumber != 1 && actionNumber != 2);

        if (actionNumber == 1) {
            printMessage();
        }
        if (!(listOfChatMembers.isEmpty()) && actionNumber == 2) {
            listOfChatMembers.remove(randomString);
        }

        if (listOfChatMembers.isEmpty()) {
            System.out.println("End of chat");
        }
    }
}





