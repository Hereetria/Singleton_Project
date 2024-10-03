public class BillPughOrderService {
    public void createOrder(String orderDetails) {
        BillPughLogger logger = BillPughLogger.getInstance();
        logger.log("Order created: " + orderDetails);
    }
}
