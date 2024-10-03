public class EnumOrderService {
    public void createOrder(String orderDetails) {
        EnumLogger logger = EnumLogger.INSTANCE;
        logger.log("Order created: " + orderDetails);
    }
}
