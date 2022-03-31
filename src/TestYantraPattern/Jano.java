package TestYantraPattern;

public class Jano 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=7;i++)
		{
			for (int j=1;j<=24;j++)
			{
				if(((j==13||j==19)&&(i<=7))||((i==1)&&(j<=5||j==9||j==21||j==22||j==23))||((i==2)&&(j==3||j==8||j==10||j==14||j==20||j==24))||((i==3)&&(j==3||j==8||j==10||j==15||j==20||j==24))||((i==4)&&(j==3||j==7||j==8||j==9||j==10||j==11||j==16||j==20||j==24))||((i==5)&&(j==1||j==3||j==7||j==11||j==17||j==20||j==24))||((i==6)&&(j==1||j==3||j==6||j==12||j==18||j==20||j==24))||((i==7)&&(j==2||j==6||j==12||j==21||j==22||j==23)))
						{
							System.out.print(" **");
						}
				else 
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
