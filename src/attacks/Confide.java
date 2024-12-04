package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Confide extends StatusMove {
    public Confide() {
        this.type = Type.NORMAL;
    }
    @Override
    public String describe() {
        return "uses attacks.Confide";
    }
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    public boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}
