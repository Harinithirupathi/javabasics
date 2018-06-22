import java.util.Scanner;

public class codes {
	public static void main(String []args)
    { 
              Scanner sc=new Scanner(System.in);
              String s=sc.nextLine( ).toUpperCase( );
              String s1[]=s.split(" ");
              String s2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
              String s3=" ";
              String s4=" ";
              int x,y;
              int m,p;
              for(int i=0;i<s1.length;i++)
       {
              s3=s1[i];
             int n=s3.length( );
             if(n%2==0)
{
             m=n/2;
          }
             else
            {
            m=(n/2)+1;
             }
            int a[ ]=new int[m];
            for(int j=0;j<n;j++)
           {
            if(j==n-1)
              {  
            x=s2.indexOf(s3.charAt(j))+1;
            a[j]=x;      
              }
             else
              {
               x=s2.indexOf(s3.charAt(j))+1;
               y=s2.indexOf(s3.charAt(n-1))+1;
                n--;
               int q=Math.abs(x-y);
               a[j]=q;
             }
             }
             int t=0;
             for(int k=0;k<m;k++)
             {
              t=t+a[k];
                }
              s4=s4+t;
              }
              System.out.print(s4);
}

}
