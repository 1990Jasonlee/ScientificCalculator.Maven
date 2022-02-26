package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter requested operation [+ for addition] " +
                "[- for subtraction] [* for multiplication] [/ for division] [sq for square] " +
                "[sqrt for square root] [exp for exponents] [1/N for inverse number] [-N for inverse sign]");
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");
        //Double e = Console.getDoubleInput2("Enter a double");

        Console.println("The user input %s as the operation", s);
        //Console.println("The user input %f as a integer", i);
        //Console.println("The user input %s as the first number", d);
        //Console.println("The user input %s as the second number", e);

        double d = 0;
        double e = 0;
        double result = 0;

            switch (s) {
                case"+":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.addition(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"-":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.subtraction(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"*":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.multiplication(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"/":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.divison(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"sq":
                    d = Console.getDoubleInput( "Enter first number:");
                    result = operation.square(d);
                    Console.println(Double.toString(result));
                    break;
                case"sqrt":
                    d = Console.getDoubleInput( "Enter first number:");
                    result = operation.squareRoot(d);
                    Console.println(Double.toString(result));
                    break;
                case"exp":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput( "Enter second number:");
                    result = operation.exponents(d,e);
                    Console.println(Double.toString(result));
                    break;
                case"1/N":
                    d = Console.getDoubleInput( "Enter first number:");
                    result = operation.inverseNumber(d);
                    Console.println(Double.toString(result));
                    break;
                case"-N":
                    d = Console.getDoubleInput( "Enter first number:");
                    result = operation.inverseSign(d);
                    Console.println(Double.toString(result));
                    break;
                default:
                    Console.println("Please pick a valid command");
                    break;
            }
        }
    }