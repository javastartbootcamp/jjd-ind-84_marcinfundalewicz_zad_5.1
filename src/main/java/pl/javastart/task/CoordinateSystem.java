package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    public void run(Scanner scanner) {
        Point point = loadPoint(scanner);
        point.print();
        whichQuarter(point);
    }

    private Point loadPoint(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        return new Point(x, y);
    }

    public void whichQuarter(Point point) {
        int x = point.getX();
        int y = point.getY();
        if (x > 0 && y > 0) {
            point.printQuarter("I");
        } else if (x < 0 && y > 0) {
            point.printQuarter("II");
        } else if (x < 0 && y < 0) {
            point.printQuarter("III");
        } else if (x > 0 && y < 0) {
            point.printQuarter("IV");
        } else if (x == 0 && y == 0) {
            System.out.print(" leży na środku układu współrzędnych");
        } else if (x == 0 && (y > 0 || y < 0)) {
            System.out.print(" leży na osi Y");
        } else if (y == 0 && (x > 0 || x < 0)) {
            System.out.print(" leży na osi X");
        }
    }
}
