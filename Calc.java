import java.util.Scanner;
class A
{
    int a,b,add,subtract,multiply,division;

    void t(){
    System.out.println("Enter the first number ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    System.out.println("Enter the second number ");
    b=sc.nextInt();
    if(a<b)
    {
    a=a^b;
    b=a^b;
    a=a^b;
    }
    }
  void add()
  {
     add=a+b;
  }
  void subtract()
{
   subtract=a-b;
}
void multiply()
{
   multiply=a*b;
}
void division()
{
    if(b!=0)
   division=a/b;
}
void display()
{
    System.out.println("The addition is "+ add);
    System.out.println("The subtraction is "+ subtract);
    System.out.println("The multiplication is "+ multiply);
    if(b==0)
       System.out.printf("Undefined");
    else
       System.out.println("The division is "+ division);
}


}
class Calc
{
    public static void main(String[] args)
    {
        A r=new A();
        r.t();
        r.add();
        r.subtract();
        r.multiply();
        r.division();
        r.display();
    }
}