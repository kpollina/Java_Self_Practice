package day13_practice_tasks.student_task;

public class StudentClients {
    public static void main(String[] args) {

        Student student1 = new Student("Polina Vergasova", 28, "female");
        System.out.println(student1);

        System.out.println("--------------------------------------------------------------------");

        CollegeStudent collegeStudent = new CollegeStudent("Marina Pavlova",33,
                "female","ID 267777", "medicine",'B',"UPenn");
        System.out.println(collegeStudent);
        collegeStudent.study();

        System.out.println("--------------------------------------------------------------------");

        GraduateStudent graduateStudent = new GraduateStudent("Maxim Ch",32,"male","ID 34556","Programming",
                'A',"Cydeo");
        System.out.println(graduateStudent);
        graduateStudent.study();

        System.out.println("--------------------------------------------------------------------");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Lily Balt",20,"female","ID 6758","Cooking",
                'A',"Gordon Ramsey School");

        System.out.println(undergraduateStudent);
        undergraduateStudent.study();

        System.out.println("--------------------------------------------------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("John",25,"male","ID 75483920","SDET",
                'B',"Cydeo",33,12,"JAVA");
        System.out.println(cydeoStudent);
        cydeoStudent.study();

    }
}

/*
Student Task Requirements:
1. Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.

2. Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).

3. Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.

   3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.

4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.

 */