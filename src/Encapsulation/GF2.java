package Encapsulation;

class Laptop
{
	private String folder="GF1 ki Pic";

	public String getfolder()
	{
		return folder;
	}

	public void setfolder(String folder) 
	{
		this.folder=folder;
	}
}


public class GF2 
{
	public static void main(String[] args) {
		Laptop l=new Laptop();
		System.out.println(l.getfolder());
		l.setfolder("Habba Ide Baaa");
		System.out.println(l.getfolder());
	}
}
