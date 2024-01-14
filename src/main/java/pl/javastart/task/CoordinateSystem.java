package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    int x;
    int y;

    public void run(Scanner scanner) {
        System.out.println("Podaj X");
        x = scanner.nextInt();
        System.out.println("Podaj Y");
        y = scanner.nextInt();
        System.out.print("Punkt (" + x + "," + y + ")");
    }

    public void whichQuarter(Scanner scanner) {
        if (x > 0 && y > 0) {
            System.out.print(" leży w I ćwiartce układu współrzędnych");
        } else if (x < 0 && y > 0) {
            System.out.println(" leży w II ćwiartce układu współrzędnych");
        } else if (x < 0 && y < 0) {
            System.out.println(" leży w III ćwiartce układu współrzędnych");
        } else if (x > 0 && y < 0) {
            System.out.println(" leży w IV ćwiartce układu współrzędnych");
        } else if (x == 0 && y == 0) {
            System.out.println(" leży w centrum");
        } else if (x == 0 && (y > 0 || y < 0)) {
            System.out.println(" leży na osi Y");
        } else if (y == 0 && (x > 0 || x < 0)) {
            System.out.println(" leży na osi X");
        }
    }
}
