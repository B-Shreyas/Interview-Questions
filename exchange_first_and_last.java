import java.util.*;
class exchange_first_and_last
{
 public static void main(String args[])
 {
     int n,c=0,fd=0,ld,m;
     Scanner K=new Scanner(System.in);
     System.out.println("Enter a number");
     n=K.nextInt();
     ld=n%10;
     m=n;
     while(n>0)
     {
         c++;
         fd=n%10;
         n=n/10;
        }
        m=m-ld+fd;
        ld=ld*(int)Math.pow(10,c-1);
        fd=fd*(int)Math.pow(10,c-1);
        m=m-fd+ld;
        System.out.println(m);
    }
}