import javax.sound.midi.SysexMessage;

public class LessonTwo {
    public static void main(String[] args) {
        //Concatenation in Java
        int i = 6;
        System.out.println("value of i is " + i);

        //Assignment Operator - copy the value of one variable to another
        int k = 10;
        int j = 15;
//        int k = 10;
//        int j = 15;
//
//        k = j;
//        k = j * 2;
//        k = k + k;
//        k = k + 1;

        //Assignment Operators Puzzles:
        int number = 5;
        number = number + 1;
        System.out.println(number++);

        //Conditionals in Java
        if (i > 5)
            System.out.println("i is greater than 5");

        int number1 = 5;
        int number2 = 7;

        if (number1 > number2)
            System.out.println("number1 is greater than number2");
        else
            System.out.println("number2 is greater than number1");

        //Exercise #1
        int a = 1;
        int b = 2;
        int c = 5;
        int d = 9;

        if (a + b > c + d)
            System.out.println("a + b is greater than c + d");
        else
            System.out.println("c + d is greater than a + b");

        //Exercise #2
        int angle1 = 45;
        int angle2 = 46;
        int angle3 = 90;

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Your angles will create a triangle.");
        } else {
            System.out.println("Your angles will not create a triangle.");
        }

        //Exercise #3

        int isEven = 6;
        if (isEven % 2 == 0) {
            System.out.println("Your number is even.");
        } else
            System.out.println("Your number is odd.");

        //Multiplication Table Exercise: for loop

        for (int p = 1; p <= 10; p++){
           System.out.printf("%d * %d = %d", 5, p, 5*p).println();
        }

        for (int p = 10; p >=0; p--){
            System.out.printf("%d", p).println();
        }

        for (int p = 1; p <= 10; p++){
            System.out.printf("%d", p * p).println();
        }

        for (int p = 1; p <= 10; p++) {
            if (p % 2 == 0) {
                System.out.printf("%d", p * p).println();
            }
        }

        for (int p = 1; p <= 10; p++) {
            if (p % 2 == 1) {
                System.out.printf("%d", p * p).println();
            }
        }
    }
}
