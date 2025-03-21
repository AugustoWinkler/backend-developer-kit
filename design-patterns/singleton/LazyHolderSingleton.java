package singleton;

/**
 * Singleton implementation using the Lazy Holder approach.
 * <p>
 * This method leverages the Java ClassLoader mechanism to ensure thread safety
 * and lazy initialization without the need for synchronization.
 * <p>
 * ✅ Recommended approach for Singleton in Java due to efficiency and safety.
 * 
 * @author Augusto.Winkler
 */

public class LazyHolderSingleton {

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private LazyHolderSingleton() {
		// Prevents instantiation outside this class
	}

	/**
	 * Static inner class responsible for holding the singleton instance.
	 * <p>
	 * The instance is created only when the {@code getInstance()} method is first
	 * called.
	 */
	private static class InstanceHolder {
		private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
	}

	/**
	 * Returns the unique instance of {@code LazyHolderSingleton}.
	 * <p>
	 * This approach ensures <b>lazy initialization</b> and is <b>thread-safe</b>
	 * without requiring explicit synchronization.
	 *
	 * @return The singleton instance.
	 */
	public static LazyHolderSingleton getInstance() {
		return InstanceHolder.INSTANCE;
	}

}
