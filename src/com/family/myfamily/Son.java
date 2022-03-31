package com.family.myfamily;

public class Son 
{
	public static void main(String[] args) {
		Father f=new Father();
		//f.atm();
		f.car();
		f.bike();
		f.cycle();
	}

	@Override
	public String toString() {
		return "Son [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
