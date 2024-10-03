import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BillPughUserService userService = new BillPughUserService();
        BillPughOrderService orderService = new BillPughOrderService();

        userService.createUser("Okan");
        orderService.createOrder("Order for Okan");

        BillPughLogger logger = BillPughLogger.getInstance();
        System.out.println(logger);

        userService.createUser("Ali");
        orderService.createOrder("Order for Ali");

        System.out.println(logger);

        userService.createUser("Veli");
        orderService.createOrder("Order for Veli");

        System.out.println(logger);

        System.out.println("   -----------------   ");

        EnumUserService eUserService = new EnumUserService();
        EnumOrderService eOrderService = new EnumOrderService();

        userService.createUser("Okan");
        orderService.createOrder("Order for Okan");

        EnumLogger eLogger = EnumLogger.INSTANCE;
        System.out.println(logger);

        userService.createUser("Ali");
        orderService.createOrder("Order for Ali");

        System.out.println(logger);

        userService.createUser("Veli");
        orderService.createOrder("Order for Veli");

        System.out.println(logger);
    }
}
