public class BillPughUserService {
    public void createUser(String username) {
        BillPughLogger logger = BillPughLogger.getInstance();

        logger.log("User created: " + username);
    }
}