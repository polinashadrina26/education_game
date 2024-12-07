package factories;
import factory.Difficulty;
public abstract class AbstractFactory<T> {
    public abstract T generate(Difficulty difficulty);
}
