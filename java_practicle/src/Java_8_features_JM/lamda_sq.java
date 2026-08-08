package Java_8_features_JM;

// Functional Interface:
// ज्या interface मध्ये फक्त ONE abstract method असतो,
// त्याला Functional Interface म्हणतात.
interface addition23 {

    // Abstract method
    // दोन int values घेते.
    // काही return करत नाही, म्हणून return type = void.
    void add(int a, int b);

    // जर method int return करत असेल तर:
    // int add(int a, int b);
}

public class lamda_sq {

    public static void main(String[] args) {

        /*
         * Lambda Expression:
         *
         * (a, b) -> System.out.println(a + b)
         *
         * (a, b)  = method चे parameters
         * ->      = Lambda operator
         * right side = method ची implementation / body
         *
         * Lambda expression वापरून आपण
         * Functional Interface च्या abstract method ची
         * implementation देतो.
         */

        addition23 ad = (a, b) -> System.out.println(a + b);

        // Lambda मधून add() method call
        ad.add(45, 45);

        // Output:
        // 90


        /*
         * ------------------------------------------------
         * CASE 2: जर add() method ने value RETURN केली
         * ------------------------------------------------
         *
         * Interface मध्ये:
         *
         * int add(int a, int b);
         *
         * Lambda:
         *
         * addition23 ad = (a, b) -> a + b;
         *
         * इथे {} आणि return लिहिण्याची गरज नाही,
         * कारण ही single expression आहे.
         */

        // addition23 ad = (a, b) -> a + b;

        // Lambda ने return केलेली value result मध्ये store केली.
        // int result = ad.add(45, 45);

        // Result print केला.
        // System.out.println("Addition : " + result);

        // Output:
        // Addition : 90
    }
}