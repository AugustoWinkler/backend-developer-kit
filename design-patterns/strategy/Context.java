package strategy;

/**
 * Context class that maintains a reference to a {@link Behavior} instance.
 * <p>
 * This allows dynamic changes of movement behavior at runtime.
 * 
 * @author Augusto.Winkler
 */
public class Context {

	private Behavior strategy;

	/**
	 * Executes the movement using the selected strategy.
	 */
	public void move() {
		if (strategy == null) {
			System.out.println("No movement strategy set!");
		} else {
			strategy.move();
		}
	}

	/**
	 * Sets the movement strategy dynamically.
	 *
	 * @param strategy The movement behavior to apply.
	 */
	public void setStrategy(Behavior strategy) {
		this.strategy = strategy;
	}
}
