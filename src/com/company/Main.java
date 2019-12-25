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

        while (!listOfChatMembers.isEmpty()){
            printTimeOfTheMessage();
            chatAction (listOfChatMembers);
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

    private static void chatAction (ArrayList<String> listOfChatMembers) {
        Random rand = new Random();
        String activeMember = listOfChatMembers.get(rand.nextInt(listOfChatMembers.size()));
        System.out.print(activeMember);


        int actionNumber = 0;
        do {
            Scanner action = new Scanner(System.in);
            actionNumber = action.nextInt();
        }
        while (actionNumber != 1 && actionNumber != 2);

        if (actionNumber == 1) {
            printMessage();
        }

        if (actionNumber == 2) {
            listOfChatMembers.remove(activeMember);


            if (listOfChatMembers.isEmpty()) {
                System.out.println("End of chat");
            }
        }
    }
}





