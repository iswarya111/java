package org.company;

//Polymorphism
public class CompanyInfo {
	private void companyName(String name) {
		System.out.println("Company name is :" + name);

		}
private void companyName(int compId) {
	System.out.println("company ID is :" + compId);
}
private void companyName(float revenue) {
	System.out.println("company revenue is :" + revenue);
}
public static void main(String[] args) {
	CompanyInfo i = new CompanyInfo();
	i.companyName("Google");
	i.companyName(78453);
	i.companyName(500000f);
}
}
