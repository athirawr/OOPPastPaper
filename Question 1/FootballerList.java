import java.util.ArrayList;

public class FootballerList {
    private ArrayList<Footballer> footballers = new ArrayList<>();
    public void addFootballer(Footballer fb) {
        footballers.add(fb);
    }
    public void display() {
        for (int i=0; i<footballers.size(); i++) {
            System.out.println("Footballer name:" + footballers.get(i).getName());
            System.out.println("Total Goal:" + footballers.get(i).getNumGoals());
        }
    }

}
