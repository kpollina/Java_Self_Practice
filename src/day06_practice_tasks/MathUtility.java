package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {

        int result = calculate(10, 20, '+');
        System.out.println(result);

       double result1 = calculate(2.5 , '*', 3.0);
        System.out.println(result1);

        int result2= square(8);
        System.out.println(result2);

        double result3 = square(1.5);
        System.out.println(result3);

       int result4= cube(3);
        System.out.println(result4);

        double result5 = cube(2.5);
        System.out.println(result5);

    }


    public static int calculate (int num1, int num2, char operator){
        if(operator == '+'){
            return num1+num2;
        } else if (operator == '-') {
            return num1-num2;
        } else if (operator == '*') {
            return num1*num2;
        }else if (operator == '/'){
            return num1/num2;
        }else {
            return 0;
        }
    }

public static double calculate (double num1, char operator, double num2){
    if(operator == '+'){
        return num1+num2;
    } else if (operator == '-') {
        return num1-num2;
    } else if (operator == '*') {
        return num1*num2;
    }else if (operator == '/'){
        return num1/num2;
    }else {
        return 0;
    }
}


public static int square (int num){ //8

      int result2 =  calculate(num,num,'*');
      return result2;
}
public static double square (double num2){
        double result3 = calculate(num2, '*',num2);
        return result3;
}

public static int cube (int num){
        int result4 = square(num) * num;
        return result4;
}

public static double cube (double num){
        double result5 = square(num) * num;
        return result5;
}


}
