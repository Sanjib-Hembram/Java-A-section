import java.util.Scanner;
class A
{
    int number,count;
    void display()
    {
    System.out.println("Enter the number ");
    Scanner sc=new Scanner(System.in);
    number=sc.nextInt();
    for(int i=2;i<=number;i++)
    {
        count=0;
        for (int j=1;j<=i;j++)
        {
            if(i%j==0)
             count=count+1;
        }
        if(count==2)
        System.out.println(i);
    }
    }
    
}
class Allprime
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.display();
    }
}