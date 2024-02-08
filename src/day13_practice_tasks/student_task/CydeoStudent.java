package day13_practice_tasks.student_task;

public class CydeoStudent extends CollegeStudent {

    private int batchNumber;
    private int  groupNumber;
    private String programmingLanguage;


    public CydeoStudent(String name, int age, String gender, String studentId,
                        String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber> 0){
            this.batchNumber = batchNumber;
        }else{
            System.err.println("The batch number must be greater than zero.");
            System.exit(1);
        }
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber> 0){
            this.groupNumber = groupNumber;
        }else{
            System.err.println("The group number must be greater than zero.");
            System.exit(1);
        }

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if(programmingLanguage != null && !programmingLanguage.trim().isEmpty()){
            this.programmingLanguage = programmingLanguage;
        }else {
            System.err.println("The programming language must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
