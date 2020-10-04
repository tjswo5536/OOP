import java.util.*;

// An exploration of basic input and output.
class BasicIO {

    // Reads and processes string input.
    public static void main(String[] args) {
    	Scanner stdin = new Scanner(System.in);
          
        // get first input
        System.out.print("Enter your name: ");
        String name = stdin.nextLine();
        System.out.print("Enter yout age: ");
        int years = stdin.nextInt();
        System.out.print("Enter yout height: ");
        int height = stdin.nextInt();

        // display output on console
        System.out.println("your name is " + name);
        System.out.println("Your age is " + years);
        System.out.println(years * 365);
        System.out.printf("%tY년 %<tB %<te일 현재 %s(%d)의 키는 %dcm입니다.", new Date(), name, years, height);

    } // method main

} // class BASIC_IO