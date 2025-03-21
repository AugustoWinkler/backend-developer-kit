package singleton;

/**
 * Singleton implementation using the Eager approach.
 * <p>
 * The instance is created at class loading time, ensuring availability whenever
 * requested without additional checks.
 * <p>
 * ⚠️ Since the instance is created beforehand, it may waste resources if never
 * used.
 *
 * @author Augusto.Winkler
 */

public class EagerSingleton {
	// Single instance created eagerly
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private EagerSingleton() {
		// Prevents instantiation outside this class
	}

	/**
	 * Returns the unique instance of {@code EagerSingleton}.
	 *
	 * @return The singleton instance.
	 */
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
