package pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;


public class Comfey extends Pokemon {
    public Comfey(String name, int level) {
        super(name, level);
        this.setType(Type.FAIRY);
        this.setStats(51, 52, 90, 81, 110, 100);
        this.setMove(new SweetKiss(), new DazzlingGleam(), new Facade(), new Confide());
    }
}
