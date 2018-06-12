package com.types;

public class StableProgram {
	   public int findPassword(int input1, int input2, int input3, int input4, int input5) {

           int a[]= {input1,input2,input3,input4,input5};

           int i=0;

           int sum=0;

           for(i=0;i<a.length;i++) {

           int b[]=new int[10];

                         int number=a[i];
           int result=countCheck(b,a,i);

       System.out.println("result "+result);

                                       if(result != 0)

                                       {

                                       sum=sum+number;     
                                       }
}

                         return sum;

}

public int countCheck(int[] b,int[] a,int i) {

           int n;

           while(a[i]!=0)

           {
               n=a[i]%10;
                         b[n]=b[n]+1;
                        a[i]=a[i]/10;    

           }

           int big=b[0];

           int value=0,value1=0;

for( i=1;i<b.length;i++)

{

                         if(b[i]>big)

                          {

                         big=b[i];

                          }
           }

System.out.println(big);

for( i=0;i<b.length;i++)

{

           if(big==b[i] || b[i]==0)

           {

                         value++;

           }else

           {

                         value1++;

           }

}
return value1;
}
public static void main(String[] args) {

           StableProgram find=new StableProgram();

           int result=find.findPassword(565,78,9899,467,989);

           //System.out.println(result);

}
}
