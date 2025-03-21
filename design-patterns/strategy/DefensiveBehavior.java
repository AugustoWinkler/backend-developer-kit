package strategy;

/**
 * Concrete strategy that implements defensive movement behavior.
 * <p>
 * The entity moves cautiously to avoid danger.
 * 
 * @author Augusto.Winkler
 */
public class DefensiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Moving Defensively...");
    }
}
