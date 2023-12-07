public class Bjorn {
    private int weight = 250;
    private boolean sleeping = false;
    public double width = 0.90;
    public double height = 1.5;
    public double depth = 1.1;
    private int food = 0;
    private int health = 10;
    public int damage = 2;

    public Bjorn() {

    }

    public Bjorn(int weight, boolean sleeping, int food) {
        this.weight = weight;
        this.sleeping = sleeping;
        this.food = food;
    }

    public void eat() {
        if (food > 0) {
            food--;
            health++;
        }
    }

    public void hunt() {
        food++;
    }

    public void run(int meters) {
        food -= meters;
    }

    public void fight(Bjorn bjorn) {
        food--;
        health -= bjorn.damage;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public void sleep() {
        sleeping = true;
    }

    @Override
    public String toString() {
        return "Bjorn{" +
                "health=" + health +
                ", food=" + food +
                ", damage=" + damage +
                ", sleeping=" + sleeping +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", weight=" + weight +
                '}';
    }
}
