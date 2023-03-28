import java.util.Scanner;

public class CityNames {
    //Input alphabet between a and f to print city name accordingly
    Scanner scanner=new Scanner(System.in);  //defining object c


    void Cities()
    {
        System.out.println("Enter Lowercase Alphabet:");
       String City=scanner.nextLine();    //storing city in variable using scanner object

        //nested if else method using string equals method

        if (City.equals("a"))
        {
            System.out.println("Ahmedabad");

        } else if (City.equals("b"))
        {
            System.out.println("Bengaluru");

        } else if (City.equals("c"))
        {
            System.out.println("Chennai");

        } else if (City.equals("d"))
        {
            System.out.println("Delhi");

        } else if (City.equals("e"))
        {
            System.out.println("Ellore");

        } else if (City.equals("f"))
        {
            System.out.println("Ferozabad");

        } else
        {
            System.out.println("Alphabet is invalid");

        }


        }

    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        CityNames cityNames= new CityNames();

        //calling method using class object
        cityNames.Cities();
    }

    }


