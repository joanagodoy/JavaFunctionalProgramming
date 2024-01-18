package combinationpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Joana",
                "0989384343",
                "jo",
                LocalDate.of(2000,12,01)
        );

        //System.out.println(new CustomerValidationService().isValid(customer));

        //combinator pattern

        CustomerRegistrationValidator.ValidationResult result =
                CustomerRegistrationValidator.isEmailValid()
                        .and(CustomerRegistrationValidator.isPhoneNumberValid())
                        .and(CustomerRegistrationValidator.isAdult())
                        .apply(customer);

        System.out.println(result);

    }
}
