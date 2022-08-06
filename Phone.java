package org.phone;

public class Phone {
	private void phoneInfo(String name) {
		System.out.println("phoneInfo :" + name);
		}

	private void phoneInfo(int rate) {
		System.out.println("phoneInfo :" + rate);
	}
	
	private void phoneInfo(float imeiNo) {
		System.out.println("imeiNo:" + imeiNo);
	}
	public static void main(String[] args) {
		Phone p  = new Phone();
		p.phoneInfo("samsung Galaxy");
		p.phoneInfo(50000);
		p.phoneInfo(2344554676f);

	}

}
