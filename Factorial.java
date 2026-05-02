import java.util.*;
class Factorial
{
int fact=1;
double iterativeFact(int n)
{
if(n==0 || n==1)
{
return 1;
}
else
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
}
double recursiveFact(int n)
{
if(n==0 || n==1)
{
return 1;
}
else
{
return n*recursiveFact(n-1);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
Factorial f=new Factorial();
System.out.println(f.iterativeFact(n));
System.out.println(f.recursiveFact(n));
}
}
