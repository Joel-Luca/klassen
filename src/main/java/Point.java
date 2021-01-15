public class Point {

    static int x;
    static int y;

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }

    static void setX(int x) {
        Point.x = x;
    }

    static void setY(int y) {
        Point.y = y;
    }

    static int getX() {
        return x;
    }

    static int getY() {
        return y;
    }
}

