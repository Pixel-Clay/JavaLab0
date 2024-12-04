package pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50, 75, 35, 70, 30, 40);
        this.setMove(new PoisonJab(), new EnergyBall());
    }
}
