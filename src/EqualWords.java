import java.io.*;
import java.util.*;

public class EqualWords {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String [] s2=new String[s1.length];
		int cnt=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()%2==0) {
				s2[cnt]=s1[i];
				cnt++;
				
			}
			
		}
		for(int i=0;i<cnt;i++) {
			int l=0;
			int u=0;
			for(int j=0;j<s2[i].length();j++) {
				if(Character.isLowerCase(s2[i].charAt(j))==true)
					l++;
				else if(Character.isUpperCase(s2[i].charAt(j))==true)
					u++;
				
			}
			if(l==u) {
				System.out.print(s2[i]);
			}
		}
	}
}

