package com.lang;

public class Encoding {
	static String s=" ";
    static String s1=" ";
    static String s2=" ";
    static int count=1;
    static String input1,input2,input3;
    public static void Encoder(String x,String y,String z)
    {
        show1(x);
        show1(y);
        show1(z);
        show2(x);
        show2(y);
        show2(z);
        show(x);
        show(y);
        show(z);
    }
    public static void show(String a) {
    if(((a.length()-2)%3)==0)
    {  
        for(int j=0;j<a.length();j++)
        {
            if(count%3==0)
            {
          	 s+=" ";
               s+=a.charAt(j);
               s+=" ";
           }
            else
            {
                s+=a.charAt(j);
            }
            count++;
        }
	        System.out.println(s);
	     	String[] S=s.split("\\s");
	     	input1=S[1];
	     	input2=S[2];
	     	input3=S[3];
	     	
       }
  }
   static int count1=1;
    static String i4,i5,i6;
    public static void show1(String b) 
    { 
            if((b.length()%2)==0)
    	     {
    	         for(int i=0;i<b.length();i++)
    	         {
    	             if(count1%2==0)
    	             {
    	                 s1+=" ";
    	                 s1+=b.charAt(i);
    	             }
    	             else
    	             {
    	                 s1+=b.charAt(i);
    	             }
    	             count1++;
    	         }
    	        System.out.println(s1);
    	     	String[] S1=s1.split("\\s");
    	     	i4=S1[1];
    	     	i5=S1[2];
    	     	i6=S1[3];
             }
    }
static int count2=1;
static String j7,j8,j9;
public static void show2(String c) 
{  
    if((c.length()%3)==0)
    {
    for(int input=0;input<c.length();input++)
    {
    if(count2%3==0)
    {
    s2+=c.charAt(input);
    s2+=" ";
    }
    else
    {
    s2+=c.charAt(input);
    }
    count2++;
    }
    System.out.println(s2);
     	String S2[]=s2.split("\\s");
     	j7=S2[1];
     	j8=S2[2];
	    j9=S2[3];
    }
}

	
public static void main(String[] args) {
MainEncoder m=new MainEncoder();
m.Encoder("John","Johny","Jarardhan");
String o1=input1+i4+j7;
String o2=input2+i5+j8;
String o3=input3+i6+j9;
System.out.println("output1="+o1);
System.out.println("output2="+o2);
System.out.println("output3="+o3);
}





    }


