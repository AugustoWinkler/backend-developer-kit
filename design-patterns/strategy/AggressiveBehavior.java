package strategy;

/**
 * Concrete strategy that implements aggressive movement behavior.
 * <p>
 * The entity moves in an assertive and hostile manner.
 * 
 * @author Augusto.Winkler
 */
public class AggressiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Moving Aggressively...");
    }
}
