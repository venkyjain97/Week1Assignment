import java.util.Scanner;
public class SumOfNumberTillN{  
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
int sum = 0;
int n=sc.nextInt(); 
for(int i=1;i<=n;++i){  
sum = sum + i;  
}  
   System.out.println("Sum of n Numbers is = " + sum);  
 }  
}  