package factory;

public class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("Archer is shooting an arrow!");
    }
}
