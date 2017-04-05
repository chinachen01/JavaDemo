package design.factory;

/**
 * Created by focus on 16/11/18.
 */
public abstract class AbsHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> klass);
}
