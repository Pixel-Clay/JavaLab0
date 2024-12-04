package attacks;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {
    public StunSpore() {
        this.type = Type.GRASS;
        this.accuracy = 75;
    }

    public String describe() {
        return "uses Stun Spore";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.PARALYZE));
    }
}
