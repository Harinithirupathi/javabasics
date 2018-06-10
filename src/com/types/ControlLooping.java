package com.types;

public class ControlLooping {
	 public static void main(String[] args) {
			  int i=10;
			    int result= i<20 ? 20:10;
			  
			   switch ("one") {
			case "one":
				System.out.println("One");
				break;
		case "two":
			   System.out.println("Two");
				break;
		case "three":
			  System.out.println("Three");
			break;

		default:
				 System.out.println("Default");
				break;
			}
			   while(i<20) {
				   System.out.println(i); 
			   i++;
			   }
			   do {
				   System.out.println("do while "+i);
			   }while(i<15);
		int j;
		  for(i=20,j=27;i<j;i++,j--)
			  
		  {
			  if(i==22) 
			  {
				  continue;
			  }
			  if(i==23)
				  break;
			  System.out.println("for "+i);
			  
			  System.out.println("for "+j);
			 
		  }
		 outer: for(i=29;i<30;i++)
		           {
		inner:	  for(j=25;j<30;j++) {
				     if(j==28)
				     {
				    	 continue inner;
				     }
		          if(j==29)
		            {
			           continue outer;
		             }
		             System.out.println("i= "+i+" j= "+j);
		  }
		           }
		  }
		  }


