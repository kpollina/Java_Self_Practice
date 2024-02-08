package day13_practice_tasks.student_task;

public class Student {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else {
            System.err.println("The name must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age> 0){
            this.age = age;
        }else{
            System.err.println("The age must be greater than zero.");
            System.exit(1);
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender != null && !gender.trim().isEmpty()){
            this.gender = gender;
        }else {
            System.err.println("The gender must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public Student(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
