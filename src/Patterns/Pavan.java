package Patterns;

public class Pavan 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=7;i++)
		{
			for (int j=1;j<=31;j++)
			{
				if(((j==1||j==25||j==31)&&(i<=7))||((i==1)&&(j==2||j==7||j==11||j==17||j==21))||((i==2)&&(j==3||j==6||j==8||j==11||j==17||j==20||j==22||j==26))||((i==3)&&(j==3||j==6||j==8||j==12||j==16||j==20||j==22||j==27))||((i==4)&&(j==2||j==5||j==6||j==7||j==8||j==9||j==12||j==16||j==19||j==20||j==21||j==22||j==23||j==28))||((i==5)&&(j==5||j==9||j==13||j==15||j==19||j==23||j==29))||((i==6)&&(j==4||j==10||j==13||j==15||j==18||j==24||j==30))||((i==7)&&(j==4||j==10||j==14||j==18||j==24)))
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
