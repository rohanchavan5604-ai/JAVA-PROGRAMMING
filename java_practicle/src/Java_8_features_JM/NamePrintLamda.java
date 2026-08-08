package Java_8_features_JM;

// Functional Interface
// यात फक्त ONE abstract method आहे.
interface name32 {

    // दोन String parameters घेते
    // काहीही return करत नाही → void
    void name(String F, String L);
}

public class NamePrintLamda {

    public static void main(String[] args) {

        // =====================================================
        // WAY 1: Normal Lambda
        // =====================================================
        
        name32 n = (F, L) -> System.out.println(F + " " + L);

        n.name("Rohan", "Chavan");

        // Output:
        // Rohan Chavan


        // =====================================================
        // WAY 2: Lambda with parameter types
        // =====================================================
        
        name32 n2 = (String F, String L) ->
                System.out.println(F + " " + L);

        n2.name("Rohan", "Chavan");

        // Output:
        // Rohan Chavan

        /*
         * Parameter types explicitly लिहू शकतो:
         *
         * (String F, String L)
         *
         * पण Lambda मध्ये compiler ला types already माहिती असतात,
         * म्हणून normally आपण types लिहीत नाही.
         */


        // =====================================================
        // WAY 3: Lambda with curly braces
        // =====================================================

        name32 n3 = (F, L) -> {
            System.out.println(F + " " + L);
        };

        n3.name("Rohan", "Chavan");

        /*
         * { } तेव्हा useful असतात जेव्हा Lambda मध्ये
         * multiple statements असतात.
         */


        // =====================================================
        // WAY 4: Lambda with multiple statements
        // =====================================================

        name32 n4 = (F, L) -> {

            String fullName = F + " " + L;

            System.out.println("Full Name : " + fullName);
        };

        n4.name("Rohan", "Chavan");

        // Output:
        // Full Name : Rohan Chavan


        // =====================================================
        // WAY 5: Lambda मध्ये parameters ची छोटी names
        // =====================================================

        name32 n5 = (first, last) ->
                System.out.println(first + " " + last);

        n5.name("Rohan", "Chavan");

        /*
         * F आणि L ही compulsory names नाहीत.
         *
         * आपण:
         * F, L
         * first, last
         * fname, lname
         *
         * कोणतीही valid variable names वापरू शकतो.
         */


        // =====================================================
        // WAY 6: Direct Lambda call using variable
        // =====================================================

        name32 n6 = (F, L) -> {
            System.out.println("First Name : " + F);
            System.out.println("Last Name  : " + L);
        };

        n6.name("Rohan", "Chavan");
    }
}