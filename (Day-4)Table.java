import java.util.Scanner;
public class Table{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int n = sc.nextInt();
	for(int i=1;i<=10;i++){
		int prod = n*i;
		System.out.println(n + "*" + i+ "=" + prod);		
	}
   }
  }