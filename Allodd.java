import java.util.Scanner;
class A
{
    void display()
    {
    int i=1;
    System.out.printf("Enter the number\n");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    while( i!=number)
    {
        if(i%2==1)
        System.out.println(i);
        i+=1;
    }
    }
}
class Allodd
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.display();
    }
}