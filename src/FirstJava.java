import java.util.Scanner;

/**
 * Created by {Hafsa} on {09/10/2015.}
 */
class FirstJava {
    public static void main(String [] args) {

        System.out.println("Hello, People.");
        System.out.println("Welcome to Java.");


        System.out.println("Let's demonstrate a simple calculation.");

        int answer;
        answer = 2+2 ;
        System.out.println("2 plus 2 is " + answer );

        char a, b;
        a = 'A';
        System.out.println(a);
        b = 'B';
        System.out.println(b);
        a = b;
        System.out.println(a);

        int n, c;
        System.out.println("Enter an integer to print it's multiplication table: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of "+ n +" is :-");

        for ( c = 1 ; c <= 10 ; c++ )
            System.out.println(n+" * "+c+" = "+(n * c));
    }
}









