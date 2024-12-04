package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class SweetKiss extends StatusMove {
    public SweetKiss() {
        this.type = Type.FAIRY;
        this.accuracy = 75;
    }

    public String describe() {
        return "uses Sweet Kiss";
    }


    public void applyOppEffects(Pokemon p) {
        p.confuse();
    }
}
