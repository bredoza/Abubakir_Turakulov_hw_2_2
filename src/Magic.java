public class Magic extends Character implements Printable {
    private int intelligence;

    public Magic(String name, int health, int intelligence) {
        super(name, health);
        this.intelligence = intelligence;
    }

    @Override
    public void print() {
        System.out.println("Character: " + getName() + ", Health: " + getHealth() + ", Intelligence: " + intelligence);
    }
}
