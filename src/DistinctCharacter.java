

	import java.util.Scanner;

	public class DistinctCharacter {
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			int count = 0;
			System.out.println("enter the string:");
			String s1 = scanner.nextLine();
			String s2 = s1.toLowerCase();
			String s3[] = s2.split(" ");
			String s4 = " ";
			for (int k = 0; k < s3.length; k++) {
				s4 = s4 + s3[k];
			}
			System.out.println(s4.trim());
			String s5 = s4.trim();
			for (int i = 0; i < s5.length(); i++) {
				for (int j = 0; j < s5.length(); j++) {
					if (s5.charAt(i) == s5.charAt(j)) {
						count++;
					}
				}
				if (count == 1) {
					System.out.print(s5.charAt(i));
					count=0;
				}
				else if(count>1) {
					count=0;
				}
				
			}
		}

	}

