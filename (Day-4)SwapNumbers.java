import java.util.Scanner;
public class SwapNumbers {  
    public static void main(String[] args){  
       int temp;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b : ");  
       int x = sc.nextInt();  
       int y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +" "+ y);
       temp = x;  
       x = y;  
       y = temp;  
       System.out.println("After swapping: "+x +" "+ y);  
       System.out.println( );  
    }    
}  