package Questions;

/* Build a Logger class where only ONE instance can ever exist in the entire application. 
Any class that asks for the logger must get back the same instance. 
The logger should have a log(String message) method. */

public class Logger {
    public static Logger instance;

    private Logger() {
        System.out.println("Logger instance created");
    }

    public void log(String message) {
        System.out.println("[Log] " + message);
    }

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

}

class OrderService{
    public void placeOrder(String orderId){
        Logger logger = Logger.getInstance();
        logger.log("Order placed with id : " + orderId);
    }
}

class PaymentService{
    public void processPayment(String orderId){
        Logger logger = Logger.getInstance();
        logger.log("Payment processed for order id : " + orderId);
    }
}

class Main {
     public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        orderService.placeOrder("12345");
        paymentService.processPayment("12345");       
    } 
}
