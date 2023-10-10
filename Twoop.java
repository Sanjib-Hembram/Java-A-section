import java.util.Scanner;
class A
{
    int a,b;
    void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first numbers ");
        a=sc.nextInt();
        System.out.println("Enter the second numbers ");
        b=sc.nextInt();
        if(a<b)
        {
            a=a^b;
            b=a^b;
            a=a^b;
        }
        System.out.printf("%d + %d = %d \n",a,b,a+b);
        System.out.printf("%d - %d = %d \n",a,b,a-b);
        System.out.printf("%d * %d = %d \n",a,b,a*b);
        if(b==0)
        System.out.printf("Undefined");
        else
        System.out.printf("%d / %d = %d \n",a,b,a/b);
    }
}
class Twoop
{
    public static void main(String [] args)
    {
        A obj=new A();
        obj.display();
    }
}