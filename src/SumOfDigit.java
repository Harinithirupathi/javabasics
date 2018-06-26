
import java.io.*;
	import java.util.*;

	public class SumOfDigit {
		public static void main(String args[]) {
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the integer");
				int input1=scanner.nextInt();
					int sum=0,inputCopy=0;
					inputCopy=Math.abs(input1);
					do{
					while(inputCopy>0){
						
						int r=inputCopy%10;
						sum=sum+r;
						inputCopy=inputCopy/10;
					}inputCopy=sum;
						sum=0;
					}while(inputCopy>9);
					if(input1<0) {
	System.out.println("Sum of all digits:"+-inputCopy);
					}
					else
						System.out.println("Sum of all digits"+"="+inputCopy);
				}
			
		}


