package exercise_2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = scanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2/i);
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}
