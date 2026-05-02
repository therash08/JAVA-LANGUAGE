abstract class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void showRole();
}

interface Leader {
    void leadMovement(String movement);
}

class Activist extends Person implements Leader {
    private int movementsLed;
    public Activist(String name) {
        super(name);
        movementsLed = 0;
    }
    @Override
    public void showRole() {
        System.out.println(getName() + " is an Activist.");
    }
    @Override
    public void leadMovement(String movement) {
        movementsLed++;
        System.out.println(getName() + " was leading: " + movement);
    }
    public int getMovementsLed() {
        return movementsLed;
    }
}

public class OsmanHadiTest {
    public static void main(String[] args) {
        Person hadi = new Activist("Osman Hadi");

        hadi.showRole();
        ((Activist)hadi).leadMovement("July Mass Uprising");
        ((Activist)hadi).leadMovement("Cultural Movement against autocracy");
        ((Activist)hadi).leadMovement("Anti-hegemonic Movement");

        System.out.println("Total movements led by Osman Hadi: " + 
        ((Activist)hadi).getMovementsLed());
    }
}