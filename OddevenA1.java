import java.util.Scanner;
class A
{
    void display()
    {
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number%2==0)
    System.out.printf("The number %d is even",number);
    else
    System.out.printf("The number %d is odd",number);
    }
}
class OddevenA1
{
    public static void main(String [] args)
    {
        A obj=new A();
        obj.display();
        
    }
}