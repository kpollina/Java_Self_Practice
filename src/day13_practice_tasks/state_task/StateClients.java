package day13_practice_tasks.state_task;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Richmond","VA",
                "Democratic","Glenn Youngkin","Mark Warner",226604 );

        System.out.println(virginia);

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        California california = new California("Sacramento","CA",
                "Democratic","Gavin Newsom","Laphonza Butler",525041 );

        System.out.println(california);

        System.out.println("--------------------------------------------------------------------------------------------------------------");

        Texas texas = new Texas("Austin","TX",
                "Republican","Greg Abbott ","Ted Cruz",964177  );

        System.out.println(texas);

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        Florida florida = new Florida("Tallahassee","FL",
                "Republican","Ron DeSantis","Rick Scott",197102  );

        System.out.println(florida);




    }
}

/*
State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.

3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.
 */
