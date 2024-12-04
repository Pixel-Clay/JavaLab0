package pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;


public class Eevee extends Pokemon {
    public Eevee(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(55, 55, 50, 45, 65, 55);
        this.setMove(new SandAttack(), new QuickAttack(), new Facade());
    }
}