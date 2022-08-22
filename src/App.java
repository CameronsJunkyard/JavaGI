public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lets get started");

        for (int i = 1; i <= 100; i++) {
           if (i % 15 == 0) {
               System.out.println("FizzBuzz " + i);
           }
           else if (i % 5 == 0) {
               System.out.println("Fizz " + i);
           }
           else if (i % 3 == 0) {
               System.out.println("Buzz " + i);
           }
           else {
               System.out.println(i);
           }
            
           }
        }
    }
