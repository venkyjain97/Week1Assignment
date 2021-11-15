public class FarenheitToCelsius{  
   public static void main (String[] args){
        float Fahrenheit, Celsius;  
        Scanner sc = new Scanner(System.in);
          Fahrenheit = sc.nextInt();  
          Celsius  = ((Fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  
      }
    }  