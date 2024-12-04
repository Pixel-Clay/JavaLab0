package pokemon;

import attacks.*;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level) {
        super(name, level);
        this.setType();
        this.setStats(65, 90, 50, 85, 45, 55);
        this.addMove(new StunSpore());
    }
}
