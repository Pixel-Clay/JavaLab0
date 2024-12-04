import pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Eevee("Joe", 1);
        Pokemon p2 = new Comfey("Bidone", 1);
        Pokemon p3 = new Jolteon("Rogan", 1);
        Pokemon p4 = new Bellsprout("Soda", 1);
        Pokemon p5 = new Weepinbell("Андрей", 1);
        Pokemon p6 = new Victreebel("Стас", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}