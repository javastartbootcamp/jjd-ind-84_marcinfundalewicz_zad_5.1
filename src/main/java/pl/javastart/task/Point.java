package pl.javastart.task;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void print() {
        System.out.printf("Punkt (%d, %d)", x, y);
    }

    void printQuarter(String quarter) {
        System.out.printf(" leży w %s ćwiartce układu współrzędnych", quarter);
    }
}
