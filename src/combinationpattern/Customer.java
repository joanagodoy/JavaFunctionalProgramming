package combinationpattern;

import java.time.LocalDate;

public class Customer {

    private String name;
    private String phoneNumer;
    private String email;
    private LocalDate birth;

    public Customer(String name, String phoneNumer, String email, LocalDate birth) {
        this.name = name;
        this.phoneNumer = phoneNumer;
        this.email = email;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirth() {
        return birth;
    }
}
