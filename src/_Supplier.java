import java.util.List;
import java.util.function.Supplier;

public class _Supplier {//Represents a supplier of results

    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionSUrluplier.get());
        System.out.println(getListDBConnectionSUrluplier.get());
    }

    static String getDBConnection(){
        return "jbcd://localhost:3306";
    }

    static Supplier<String> getDBConnectionSUrluplier = ()
            -> "jbcd://localhost:3306";

    static Supplier<List<String>> getListDBConnectionSUrluplier = ()
            -> List.of(
                    "jbcd://localhost:3306",
                    "jbcd://localhost:3307");
}
