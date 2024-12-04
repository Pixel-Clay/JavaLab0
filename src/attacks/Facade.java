package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    public String describe() {
        return "uses attacks.Facade";
    }

    @Override
    public void applySelfEffects(Pokemon p) {
        Status curr = p.getCondition();
        if (curr == Status.BURN || curr == Status.PARALYZE || curr == Status.POISON) {
            this.power = 140;
        } else {
            this.power = 70;
        }
    }
}
