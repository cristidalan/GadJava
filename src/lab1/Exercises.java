package lab1;

import static java.util.Arrays.copyOfRange;

public class Exercises {
    public void arrays(){
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo,0, 7);
        System.out.println(copyTo);
    }
    public void arrays2(){
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = copyOfRange(copyFrom, 2, 9);

        System.out.println(copyTo);
    }
}
