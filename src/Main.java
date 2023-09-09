public class Main {
    public static void main(String[] args) {
        Printable[] characters = new Printable[3];

        characters[0] = createObject("Melee");
        characters[1] = createObject("Magic");
        characters[2] = createObject("Distance");

        for (Printable character : characters) {
            character.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Melee":
                return new Melee("Warrior", 50, 5);
            case "Magic":
                return new Magic("Mage", 20, 5);
            case "Distance":
                return new Distance("Archer", 35, 5);
            default:
                throw new IllegalArgumentException("Unknown class: " + className);
        }
    }
}
