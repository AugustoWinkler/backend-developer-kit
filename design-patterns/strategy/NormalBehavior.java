package strategy;

/**
 * Concrete strategy that implements normal movement behavior.
 * <p>
 * The entity moves in a neutral and balanced way.
 * 
 * @author Augusto.Winkler
 */
public class NormalBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Moving Normally...");
    }
}
