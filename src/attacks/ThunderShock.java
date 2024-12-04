package attacks;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    public String describe() {
        return "uses Thunder Shock";
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).condition(Status.PARALYZE));
    }
}
