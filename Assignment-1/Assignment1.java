public class Assignment1 {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println("Original String : " + str);
        System.out.println("Identity Hash   : " + System.identityHashCode(str));

        for (int i = 1; i <= 3; i++) {

            str = str + " Java";

            System.out.println("\nAfter Concatenation " + i);
            System.out.println("String          : " + str);
            System.out.println("Identity Hash   : " + System.identityHashCode(str));
        }
    }
}