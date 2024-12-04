package pokemon;

import ru.ifmo.se.pokemon.Type;
import attacks.*;


public class Jolteon extends Eevee {
    public Jolteon(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(65, 65, 60, 110, 95, 130);
        this.addMove(new ThunderShock());
    }
}
