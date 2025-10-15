class FoodOrder implements Runnable {
    private String orderName;

    FoodOrder(String orderName) {
        this.orderName = orderName;
    }

    public void run() {
        System.out.println(orderName + " - Order received.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(orderName + " - Order processed successfully!");
    }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) {
        Thread order1 = new Thread(new FoodOrder("Order #101"));
        Thread order2 = new Thread(new FoodOrder("Order #102"));
        Thread order3 = new Thread(new FoodOrder("Order #103"));

        order1.start();
        order2.start();
        order3.start();
    }
}

