package lab1.challenge2;

public class FooBar {

    private static String contains(int num) {
        if (num == 0) {
            return "";
        }
        int x = num % 10;
        if (x == 3) {
            return contains(num / 10) + "Foo";
        }
        if (x == 5) {
            return contains(num / 10) + "Bar";
        }
        if (x == 7) {
            return contains(num / 10) + "Qix";
        }

        return "";
    }

    public static String fooBarQix(int num) {
        String toReturn = " ";
        if (num % 3 == 0) {
            toReturn = toReturn + "Foo";
        }
        if (num % 5 == 0) {
            toReturn += "Bar";
        }
        if (num % 5 == 0) {
            toReturn += "Qix";
        }
        toReturn += contains(num);

        if (toReturn.equals(""))
            return "" + num;
        return toReturn;
    }


    public static void main(String[] args) {
        for (int i = 0; i <= 53; i++) {
            System.out.println(i + " " + fooBarQix(i));
        }
    }
}
