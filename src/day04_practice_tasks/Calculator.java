package day04_practice_tasks;

public class Calculator {
    public static void main(String[] args) {

        double n1 =10;
        double n2 = 20;

        char mathOperator = '+';

        switch (mathOperator){
            case '+':
                System.out.println((int)n1+(int)n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}

/*
Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30


 */

/*

 switch (operator) {

            case '+':
                System.out.println("Addition: " + (num1 + num2));

                break;

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid Operator");


        }


    }

 */