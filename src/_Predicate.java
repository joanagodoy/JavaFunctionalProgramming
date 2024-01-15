import java.util.function.Predicate;

public class _Predicate {//Return boolean

    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isNumberValid("070000"));
        System.out.println(isNumberValid("000000"));

        System.out.println("With Predicate");
        System.out.println(isNumberValidPredicate.test("070000"));
        System.out.println(isNumberValidPredicate.test("000000"));


        System.out.println("With And");
        System.out.println("isNumberValid and ContainsNumber3 = " +
                isNumberValidPredicate.and(containsNumber3).test("070000"));
        System.out.println("isNumberValid and ContainsNumber3 = " +
                isNumberValidPredicate.and(containsNumber3).test("070300"));
        System.out.println("isNumberValid or ContainsNumber3 = " +
                isNumberValidPredicate.or(containsNumber3).test("070000"));

    }
    static Predicate<String> isNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07");

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static boolean isNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07");
    }
}
