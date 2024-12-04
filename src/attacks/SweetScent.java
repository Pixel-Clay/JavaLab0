package attacks;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    public SweetScent() {
        this.type = Type.NORMAL;
        this.accuracy = 100;
    }

    @Override
    public String describe() {
        return "uses Sweet Scent";
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.EVASION, -1);
    }
}
