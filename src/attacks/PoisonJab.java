package attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    @Override
    public String describe() {
        return "uses Poison Jab";
    }

    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.3).condition(Status.POISON));
    }
}
