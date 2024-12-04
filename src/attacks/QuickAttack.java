package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove {
    public QuickAttack() {
        super(Type.NORMAL, 40, 100);
        this.priority = 1;
    }

    @Override
    public String describe() {
        return "uses Quick Attack";
    }
}
