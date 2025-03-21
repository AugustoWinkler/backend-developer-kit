package facade.sub1;

/**
 * Simulates a CRM system where customer data is saved.
 * <p>
 * This class acts as one of the subsystems, performing operations on the customer data
 * such as saving customer information into the CRM system.
 * 
 * @author Augusto.Winkler
 */
public class CrmService {

    // Private constructor to prevent instantiation.
    private CrmService() {
        super();
    }

    /**
     * Saves customer information into the CRM system.
     * <p>
     * The CRM system receives the customer's details and saves them.
     * 
     * @param name The name of the customer to be saved.
     * @param cep The customer's postal code.
     * @param state The customer's state.
     * @param city The customer's city.
     */
    public static void saveCustomer(String name, String cep, String state, String city) {
        System.out.println("Customer Saved on CRM System..");
        System.out.println("Name: " + name);
        System.out.println("CEP: " + cep);
        System.out.println("State: " + state);
        System.out.println("City: " + city);
    }
}
