package facade.sub2;

/**
 * Simulates a CEP API that retrieves city and state information from a postal code.
 * <p>
 * This class acts as another subsystem, interacting with the `Facade` to provide
 * city and state information based on the given postal code.
 * 
 * @author Augusto.Winkler
 */
public class CepAPI {

    private static CepAPI api = new CepAPI();

    // Private constructor to prevent instantiation.
    private CepAPI() {
        super();
    }

    /**
     * Provides the instance of the CepAPI singleton.
     * 
     * @return The instance of CepAPI.
     */
    public static CepAPI getInstance() {
        return api;
    }

    /**
     * Recovers the city information for the given postal code (CEP).
     * 
     * @param cep The postal code (CEP).
     * @return The city associated with the given postal code.
     */
    public String recoverCity(String cep) {
        return "City";
    }

    /**
     * Recovers the state information for the given postal code (CEP).
     * 
     * @param cep The postal code (CEP).
     * @return The state associated with the given postal code.
     */
    public String recoverState(String cep) {
        return "State";
    }
}
