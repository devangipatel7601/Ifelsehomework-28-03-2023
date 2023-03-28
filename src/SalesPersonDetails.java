import java.util.Scanner;

public class SalesPersonDetails {
    String sellername,salesid;
    int salesamount,basicsalary,comm;
    Scanner scanner=new Scanner(System.in);  //calling Scanner Object

    void Commission(){
        System.out.println("Enter Sales ID");
        salesid= scanner.nextLine();

        System.out.println("Enter Seller's Name");
        sellername= scanner.nextLine();

        System.out.println("Enter Sales Amount");
        salesamount= scanner.nextInt();

        System.out.println("Enter Basic Salary");
        basicsalary= scanner.nextInt();

        System.out.println("Commission: ");


        //using nested if else method with Relational Operators
        if (salesamount>=50000)
        {
            System.out.println(salesamount*35/100);

        } else if (salesamount>=30000  && salesamount<50000)
        {
            System.out.println(salesamount*20/100);

        } else if (salesamount>=20000 && salesamount<30000)
        {
            System.out.println(salesamount*10/100);

        } else if (salesamount>=10000 && salesamount<20000)
        {
            System.out.println(salesamount*5/100);

        } else
        {
            System.out.println(10000*2/100);

        }


    }



    public static void main(String[] args) {

        //creating class object to call non-static method into static area
        SalesPersonDetails salesPersonDetails=new SalesPersonDetails();

        //calling method using class object
        salesPersonDetails.Commission();
    }

    }



