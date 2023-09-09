public class Distance extends Character implements Printable {
    private int dexterity;

    public Distance(String name, int health, int dexterity) {
        super(name, health);
        this.dexterity = dexterity;
    }

    @Override
    public void print() {
        System.out.println("Character: " + getName() + ", Health: " + getHealth() + ", Dexterity: " + dexterity);
    }
}
