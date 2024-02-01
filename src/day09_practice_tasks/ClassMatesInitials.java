package day09_practice_tasks;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classMates = {"Alice Johnson",
                "Bob Smith",
                "Charlie Brown",
                "David Clark",
                "Eva Martinez",
                "Frank Miller",
                "Grace Lee",
                "Hank Williams",
                "Ivy Anderson",
                "Jack Taylor"
        };

        for (String fullName:classMates) {

            System.out.println((fullName.substring(0, 1) + "."
                    + fullName.substring(fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2) + "."));
        }
    }
}
/*
Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */