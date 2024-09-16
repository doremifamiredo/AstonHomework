package ru.aston.lesson11;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char choise, ign;
        Menu menu = new Menu();
        for (; ; ) {
            do {
                menu.showMenu();
                choise = (char) System.in.read();
                do {
                    ign = (char) System.in.read();
                } while (ign != '\n');
            } while (!menu.isValid(choise));
            if (choise == 'q') break;
            System.out.println("\n");
            menu.helpOn(choise);
        }
    }
}
