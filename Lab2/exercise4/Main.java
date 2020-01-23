import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int line;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 100: ");
        line = in.nextLine();
        
        if (line > 50) {
            System.out.println("pass");
        }
        if  (line < 50) {
            System.out.println("fail");
        }
       if (line > 100 || line < 0) {
           System.out.println("Error");
       }
      
   
   
   
   
   
    }
}
