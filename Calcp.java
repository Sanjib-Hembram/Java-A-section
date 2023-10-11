class A
{
    int p,q,r,s;
    void add(int a,int b)
    {
        p=a+b;
    }
    void subtract(int a,int b)
    {
        q=a-b;
    }
    void multi(int a,int b)
    {
        r=a*b;
    }
    void divi(int a,int b)
    {
        if(b==0)
        s=-1;
        else
        s=a/b;
    }
    void display()
    {
        System.out.printf("The addition is %d\n",p);
        System.out.printf("The subtraction is %d\n",q);
        System.out.printf("The multiplication is %d\n",r);
        if(s==-1)
        System.out.printf("undefined");
        else
        System.out.printf("The division is %d\n",s);
    }
}
class Calcp
{
    public static void main(String [] args)
    {
        A obj=new A();
        obj.add(20,3);
        obj.subtract(20,3);
        obj.multi(20,3);
        obj.divi(20,3);
        obj.display();
    }
}