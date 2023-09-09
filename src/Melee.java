public class Melee extends Character implements Printable {
    private int strength;

    public Melee(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    @Override
    public void print() {
        System.out.println("Character: " + getName() + ", Health: " + getHealth() + ", Strength: " + strength);
    }
}
