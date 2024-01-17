import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null)
                .orElse("Null"));

        System.out.println(Optional.ofNullable("Hello")
                .orElse("Null"));

        System.out.println(Optional.ofNullable(null)
                .orElseGet(() -> new IllegalAccessException()));

        Optional.ofNullable(null)
                .ifPresent(value -> System.out.println(value));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to"),
                        () -> System.out.println("Cannot send email")
                );

    }
}
