import java.util.function.Consumer;

public class _Consumer {//Represents an operation that accepts a single input and returns no result

    public static void main(String[] args) {
        greetCustomer("Customer");
        greetCustomer("Customer2");
        greetCustomerConsumer.accept("Customer");
    }

    static void greetCustomer(String customer){
        System.out.println("Hello " + customer);
    }

    static Consumer<String> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer);
}
