import java.util.Scanner;
class S
{
    int number,count=0;
    void display()
    {
    System.out.println("Enter the number ");
    Scanner sc=new Scanner(System.in);
    number=sc.nextInt();
    for(int i=2;i<number;i++)
    {
        if(number%i==0)
        count=count+1;
    }
    if (count==0)
    {
        System.out.printf("The number %d is prime ",number);
    }
    else
    {
        System.out.printf("The number %d is not prime",number);
    }
    }
}
class Prime1
{
public static void main(String [] args)
{
    S obj=new S();
    obj.display();
}
}