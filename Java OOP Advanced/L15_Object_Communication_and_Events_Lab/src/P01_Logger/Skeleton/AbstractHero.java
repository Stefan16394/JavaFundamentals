package P01_Logger.Skeleton;

import P01_Logger.Handler;
import P01_Logger.LogType;

public abstract class AbstractHero implements Attacker {

    private static final String TARGET_NULL_MESSAGE = "Target null";
    private static final String NO_TARGET_MESSAGE = "%s has no target";
    private static final String TARGET_DEAD_MESSAGE = "%s is dead";
    private static final String SET_TARGET_MESSAGE = "%s targets %s";

    private String id;
    private int dmg;
    private Target target;
    private Handler handler;

    public AbstractHero(String id, int dmg, Handler handler) {
        this.id = id;
        this.dmg = dmg;
        this.handler=handler;
    }

    public void setTarget(Target target) {
        if (target == null) {
            this.handler.handle(LogType.ERROR,TARGET_NULL_MESSAGE);
        } else {
            this.target = target;
            this.handler.handle(LogType.TARGET,String.format(SET_TARGET_MESSAGE,this,target));
        }
    }

    public final void attack() {
        if (this.target == null) {
            this.handler.handle(LogType.TARGET,NO_TARGET_MESSAGE);
        } else if (this.target.isDead()) {
            this.handler.handle(LogType.TARGET,String.format(TARGET_DEAD_MESSAGE,target));
        } else {
            this.executeClassSpecificAttack(this.target, this.dmg,this.handler);
        }
    }

    @Override
    public String toString() {
        return this.id;
    }

    protected abstract void executeClassSpecificAttack(Target target, int dmg, Handler handler);
}
