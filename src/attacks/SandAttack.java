package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SandAttack extends StatusMove {
    public SandAttack() {
        this.type = Type.GROUND;
        this.accuracy = 100;
    }

    @Override
    public String describe() {
        return "uses Sand Attack";
    }

    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }

}
