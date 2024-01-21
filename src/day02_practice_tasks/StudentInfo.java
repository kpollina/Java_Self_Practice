package m10_variables_data_types;

public class StudentInfo {

    public static void main(String[] args) {

        String studentName;
        String age;
        String gender;
        String schoolName;
        String studentId;
        String gradeLevel;
        String gpa;

        studentName = "Josh Steven";
        age = "22";
        gender = "Male";
        gpa = "2.8";
        schoolName = "MIT";
        gradeLevel = "Undergraduate";
        studentId = "A125";

        System.out.println("The student's name is " + studentName +
                "\n" + "Gender is " + gender + "\nAge is " + age +
                " years old" + "\nThe school's name is " + schoolName
        + "\nGrade level is " + gradeLevel + "\n" + studentName + "'s GPA is " + gpa);
    }
}
