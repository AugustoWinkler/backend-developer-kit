package facade;

import facade.sub1.CrmService;
import facade.sub2.CepAPI;

/**
 * Facade class that simplifies the customer migration process.
 * <p>
 * It hides the complexity of interacting with the CRM system and the CEP API,
 * allowing clients to simply call the {@link #migrateCustomer(String, String)} method.
 * 
 * @author Augusto.Winkler
 */
public class Facade {

    /**
     * Migrates a customer by retrieving information from the CepAPI and saving it
     * to the CRM system.
     * <p>
     * The Facade coordinates the interaction between {@link CepAPI} and 
     * {@link CrmService} subsystems to simplify the migration process.
     * 
     * @param name The name of the customer to be migrated.
     * @param cep The customer's CEP (postal code) used to retrieve city and state.
     */
    public void migrateCustomer(String name, String cep) {
        String city = CepAPI.getInstance().recoverCity(cep);
        String state = CepAPI.getInstance().recoverState(cep);
        CrmService.saveCustomer(name, cep, city, state);
    }
}
