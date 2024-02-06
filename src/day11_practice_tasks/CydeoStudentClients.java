package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Polina Vergasova", 28,5205462, 'A',33,12);
        System.out.println(cydeoStudent1);

        cydeoStudent1.study();
        cydeoStudent1.attendClass();
        cydeoStudent1.printSchoolName();
        cydeoStudent1.printProgLanguage();

    }

}
