import java .io.*;
import java .util.*;


public class EvenOdd {
	public static void main(String z[]) {
int evenCount=0;
int oddCount=0;
int input1 = 8;
int input2 = 9;
int input3 = 6;
int input4 = 9;
int input5 = 3;
int input6 = 0;
int array[]=new int[5];
array[0]=input1;
array[1]=input2;
array[2]=input3;
array[3]=input4;
array[4]=input5;
for(int i=0;i<array.length;i++)
{
	if(array[i]%2==0) {
		evenCount++;
		
	}
	else
	{
		oddCount++;
	}
}
if("even".equals(input6)) {
	System.out.println(evenCount);
}
else if("odd".equals(input6)) {
	System.out.println(oddCount);
}
	}
}
