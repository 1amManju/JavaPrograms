
package Encapsulation;

class Facebook
{
	private int phoneNo=72345;

	public int getphoneNo() 
	{
		return phoneNo;
	}

	public void setphoneNo(int phoneNo)
	{
		this.phoneNo=phoneNo;
	}
}

public class Customer 
{
	public static void main(String[] args) 
	{
		Facebook f=new Facebook();
		System.out.println(f.getphoneNo());
		f.setphoneNo(97432);
		System.out.println(f.getphoneNo());
		
	}

}
