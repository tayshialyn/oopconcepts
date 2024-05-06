package abstractclass.language;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String guest = "";
        String selected = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        guest = scanner.nextLine();

        System.out.println("Please enter your native abstractclass.language");
        selected = scanner.nextLine().trim().toLowerCase();

        Spanish spanish = new Spanish();
        Japanese japanese = new Japanese();

//        if (selected == "Japanese")
//            japanese.greeting(guest);
//        else if (selected == "Spanish")
//            spanish.greeting(guest);
//        else
//            System.out.println("Hello, " + guest);

        if(selected.equals("spanish")) {
            spanish.greeting(guest);
            spanish.welcomeUser(guest);
        }
        else if(selected.equals("japanese")) {
            japanese.greeting(guest);
            japanese.welcomeUser(guest);
        }
        else {
            System.out.println("Hello, " + guest);
        }

    }
}

