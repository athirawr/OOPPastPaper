public class Footballer {

    private String name;
    private int numGoals;

    public Footballer(String name){
        this.name = name;
    }

    public void addGoal(int num){
        numGoals += num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumGoals() {
        return numGoals;
    }

    public void setNumGoals(int numGoals) {
        this.numGoals = numGoals;
    }
}
