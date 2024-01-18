package combinationpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS :
                ValidationResult.EMAIL_INVALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumer().startsWith("+0") ?
                ValidationResult.SUCCESS :
                ValidationResult.PHONE_INVALID;
    }

    static CustomerRegistrationValidator isAdult(){
        return customer -> Period.between(customer.getBirth(), LocalDate.now()).getYears() > 16 ?
                ValidationResult.SUCCESS :
                ValidationResult.IS_NOT_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_INVALID,
        EMAIL_INVALID,
        IS_NOT_ADULT
    }
}
