package singleton;

/**
 * Singleton implementation using the Lazy approach.
 * <p>
 * The instance is created only when requested, avoiding unnecessary memory
 * allocation.
 * <p>
 * ⚠️ This implementation is <b>not thread-safe</b> and may cause issues in a
 * multithreaded environment. Consider using synchronization or a better
 * alternative like the Lazy Holder approach.
 * 
 * @author Augusto.Winkler
 */
public class LazySingleton {

	// Instance is created only when requested
	private static LazySingleton INSTANCE;

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private LazySingleton() {
		// Prevents instantiation outside this class
	}

	public static LazySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazySingleton();
		}
		return INSTANCE;
	}
}
