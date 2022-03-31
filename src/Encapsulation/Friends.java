package Encapsulation;

class GF
{
	private String name="Dingi";

	public String getname() {
		return name;
	}

	public void setname(String name) 
	{
		this.name=name;
	}
}


public class Friends {
	public static void main(String[] args) {
		GF g=new GF();
		System.out.println(g.getname());
		g.setname("Na Helalla");
		System.out.println(g.getname());
	}
}
