import java.util.Scanner;
class Fabbiconni
{
  public static void main(String agrs[])
{
  int a=0,b=1,c,i,count=10;
  System.out.print(a+" "+b);
  
 for(i=2;i<count;++i)
{
  c=a+b;
  System.out.print(""+c);

  a=b;
  b=c;
}
}
}
