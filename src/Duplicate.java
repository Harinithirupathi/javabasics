import java.io.*;
import java.util.*;
public class Duplicate {
public void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine().toLowerCase();
	String s1[]=s.split(" ");
	int n=s1.length;
	int cnt = 0;
	int flag=0;
	String s3=" ";
	int i,j;
	for( i=0;i<n;i++) {
		s3=" ";
	}
		for( j=i+1;j<n;j++) {
			if(s1[i].equals(s1[j])&&(!s3.equals(s1[j]))){
				s3=s1[j];
				cnt++;
			}
			
	
System.out.print(cnt);
}
}
}

