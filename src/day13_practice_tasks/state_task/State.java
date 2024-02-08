package day13_practice_tasks.state_task;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String Governor;
    private String senator;
    private int population;


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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation != null && !abbreviation.trim().isEmpty()){
            this.abbreviation = abbreviation;
        }else {
            System.err.println("The abbreviation must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {

        if(politicalParty != null && !politicalParty.trim().isEmpty()){
            this.politicalParty = politicalParty;
        }else {
            System.err.println("The political party must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor != null && !governor.trim().isEmpty()){
            Governor = governor;
        }else {
            System.err.println("The governor party must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator != null && !senator.trim().isEmpty()){
            this.senator = senator;
        }else {
            System.err.println("The senator party must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population> 0){
            this.population = population;
        }else{
            System.err.println("The population must be greater than zero.");
            System.exit(1);
        }
    }

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation); ;
        setAbbreviation(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
