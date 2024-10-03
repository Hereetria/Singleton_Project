public class EnumUserService {
    public void createUser(String username) {
        EnumLogger logger = EnumLogger.INSTANCE;
        logger.log("User created: " + username);
    }
}
