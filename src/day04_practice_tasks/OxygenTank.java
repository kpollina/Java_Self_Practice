package day04_practice_tasks;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenLevel = 75;
        String result;

        if (oxygenLevel >= 50 && oxygenLevel >= 90) {

        }
        if (oxygenLevel >= 90) {
            result = "Your tank is full";
        } else if (oxygenLevel >= 80) {
            result = "Still okay";
        } else if (oxygenLevel >= 70) {
            result = "Don't go too far";
        } else if (oxygenLevel >= 60) {
            result = "Start to head back";
        } else if (oxygenLevel >= 50) {
            result = "Be careful, you're at 50%";
        } else {
             result = "Invalid level";
    }
        System.out.println(result);


    }
}
