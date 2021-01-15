public class BbcMath {

    public static void main(String[] args) {

        int i = 10; // Wenn du nichts angibst, ist 10 ein Integer
        long l = 10; // Durch das kleine "l", wird die 10 zu einem Long
        float f = 10f; // Durch das kleine "f", wird die 10 zum Float
        double d = 10d; // Durch das kleine "d", wird die 10 zu einem Double

        // Aufgaben zu Methodenüberladung:
        // Schreibe die Methode "add" viermal. Verwende immer den Methodennamen "add" und Methodenüberladung.

        System.out.println("Add mit Integer: " + add(i,i));
        System.out.println("Add mit Long: " + add(l, l));
        System.out.println("Add mit Float: " + add(f, f));
        System.out.println("Add mit Double: " + add(d, d));

        // Extra
        System.out.println("Ist 7 gerade? " + isEven(7));
        System.out.println("Ist 8 gerade? " + isEven(8));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static String isEven(int num) {
        if(num % 2 == 0) {
            return "ja";
        }
        else {
            return "nein";
        }
    }
}
