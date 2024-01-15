import java.util.function.Function;

public class _Function {//accesps one argument and produces a result

    public static void main(String[] args) {
        System.out.println(incrementByOne(2));
        System.out.println(incrementByOneFunction.apply(2));
        System.out.println(incrementByOneFunction.andThen(testBiggerThanZero).apply(2));
    }

    static int incrementByOne(int number){
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction = number ->
        number + 1;

    static Function<Integer, Boolean> testBiggerThanZero = number ->
        number > 0;
}
