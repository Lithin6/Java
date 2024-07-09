import java.util.*;
public class Conversion{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double Celcius, Kelvin, Fahrenheit;
        int choice;
        System.out.println("Choose the unit you want to convert :");
        System.out.println("1.Kelvin\n");
        System.out.println("2.Celcius\n");
        System.out.println("3.Fahrenheit\n");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the temperature in Kelvin:");
                Kelvin = sc.nextDouble();
                Celcius = (Kelvin - 273.15);
                Fahrenheit =(1.8 * (Kelvin - 273.15)+32.0);
                System.out.println("Celcius Temperature is :"+Celcius);
                System.out.println("Fahrenheit Temperature is :" +Fahrenheit);
                break;
            
            case 2:
                System.out.println("Enter the temperature in Celcius :");
                Celcius = sc.nextDouble();
                Kelvin = (Celcius + 273.15);
                Fahrenheit = (Celcius * 1.8)+32.0;
                System.out.println("Kelvin Temperature is :"+Kelvin);
                System.out.println("Fahrenheit Temperature is :"+Fahrenheit);
                break;
            
            case 3 :
                System.out.println("Enter the temperature in Fahrenheit :");
                Fahrenheit=sc.nextDouble();
                Kelvin = (Fahrenheit - 32.0) * 5/9 + 273.15;
                Celcius = (Fahrenheit - 32.0) * 5/9;
                System.out.println("Kelvin Temperature is :"+Kelvin);
                System.out.println("Celcius Temperature is :"+Celcius);
                break;

            default :
                System.out.println("Please! enter a valid value.");
                break;
        }
    }
}