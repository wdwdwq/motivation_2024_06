package org.example;

import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }
    public void run() {
        System.out.println("== motivation ==");
       while (true) {
           System.out.print("명령어)");
           String cmd = sc.nextLine().trim();

           if(cmd.length() == 0) {
               System.out.println("없는 명령어야");
               continue;
           }
           else if (cmd.equals("exit")) {
               System.out.println("== motivation exit ==");
               break;
           }

           if(cmd.equals("add")) {
               System.out.printf("motivation: ");
               String motivation = sc.nextLine();
               System.out.printf("source : ");
               String source = sc.nextLine();
               System.out.println("~번 motivation이 등록 되었습니니다");
           }
       }


    }
}
