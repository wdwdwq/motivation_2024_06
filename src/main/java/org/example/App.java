package org.example;

import org.example.System.SystemController;
import org.example.motivation.controller.MotivationController;

public class App {

    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController();


        while (true) {
            System.out.print("command) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("Enter the command");
                continue;
            }

            if (cmd.equals("add")) {
                motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();
            } else if (cmd.startsWith("delete")) {
                // parsing

                String[] cmdBits = cmd.split(" ");

                motivationController.delete();
                System.out.println(cmd);
            }else{
                System.out.println("This command cannot be used");
            }
        }
    }
}