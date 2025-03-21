package strategy;

/**
 * Strategy interface defining movement behavior.
 * <p>
 * Implementing classes must provide their own movement logic.
 * 
 * @author Augusto.Winkler
 */
public interface Behavior {

    /**
     * Defines how the entity should move.
     */
    void move();
}
