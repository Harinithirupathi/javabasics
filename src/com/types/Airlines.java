package com.types;

public class Airlines {
		boolean f[]=new boolean[11];
	
		public void start()
		{
			while(true) {
		       MakeReservation();
			            }
		}
		public void firstclass()
		        {
				for(int k=1;k<=5;k++)
				{
				if(f[k]==false)
				{
					f[k]=true;
					System.out.println("successful");
					System.out.println("seat no="+k);
					break;
				}
				else if(f[5]==true)
				{   if(f[10]==true)
				    {
					System.out.println("flight was full");
					System.out.println("next flight leaves in 3hours");
					System.exit(0);
				    }
				    else
				    {
					System.out.println("firstclass not availale try secondclass");
					System.out.println("if yes type-1 else type-0");
				int count;
					if(count==1)
					{
						secondclass();
				
					}
					else
					{
						System.out.println("next flight leaves in 3hours");
					
					}
					}
				}
		        }
				}


			public void secondclass() {
				for(int k=6;k<=10;k++)
				{
				    if(f[k]==false)
				    {
					 f[k]=true;
					System.out.println("successful");
					System.out.println("seat no="+k);
					break;
					}
				    else if(f[10]==true)
					{   if(f[5]==true)
					    {
						System.out.println("flight was full");
						System.out.println("next flight leaves in 3hours");
						System.exit(0);
					    }
					    else
					    {
						System.out.println("firstclass not availale try secondclass");
						System.out.println("if yes type-1 else type-0");
					    }
					{
						
					int count=0;
					
						if(count==1)
						{
							firstclass();
				
						}
						else
						{
							System.out.println("next flight leaves in 3hours");
							
						}
						}
					}
				}
				
			                           }
		public void MakeReservation()
		{
		   System.out.println("first class type-1 or second class type-2");
		  int type = 0;
		  
		   if(type==1)
		   {   
			   firstclass();
		   }
		   else if(type==2)
		   {
			   secondclass();
		   }
		   
		}
	public static void main(String a[])
	{
		Airlines t=new Airlines();
		t.start();
		t.MakeReservation();
	}
	



}



		