// package Lab13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static int AddSubInput() {
        Scanner c = new Scanner(System.in);
        do {
            int a;
            try {

                System.out.println("Enter  Number : ");
                a = c.nextInt();
                if (a < 0) {
                    throw new ArithmeticException();
                }
                return a;
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Please Enter positive Numbers");
            } catch (InputMismatchException e) {

                System.out.println(e);
                System.out.println("Please Enter Integar Values");
            }
        } while (true);
    }

    public static int MulDivInput() {
        Scanner c = new Scanner(System.in);
        do {
            int a;
            try {

                System.out.println("Enter  Number : ");
                a = c.nextInt();
                if (a == 0) {
                    throw new ArithmeticException();
                }
                return a;
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Please Enter A non Zero Numbers");
            } catch (InputMismatchException e) {

                System.out.println(e);
                System.out.println("Please Enter Integar Values");
            }
        } while (true);
    }

    public static int Add() {
        int a, b;
        // boolean end = true;
        a = AddSubInput();
        b = AddSubInput();
        return a + b;

    }

    public static int Subtract() {
        int a, b;
        // boolean end = true;
        a = AddSubInput();
        b = AddSubInput();
        return a - b;

    }

    public static int Multiply() {
        int a, b;
        // boolean end = true;
        a = AddSubInput();
        b = AddSubInput();
        return a * b;

    }

    public static int Divide() {
        int a, b;
        a = AddSubInput();
        b = AddSubInput();
        return a / b;

    }

    public static void main(String Args[]) {

        System.out.println("ADDITION METHOD :::::::::");
        System.out.print("Result : " + Add());
        System.out.println("SUBTRACTION METHOD :::::::::");
        System.out.print("Result : " + Subtract());
        System.out.println("MULTIPLY METHOD :::::::::");
        System.out.print("Result : " + Multiply());
        System.out.println("DIVIDE METHOD :::::::::");
        System.out.print("Result : " + Divide());

    }

}
