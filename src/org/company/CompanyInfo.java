package org.company;

public class CompanyInfo {
	public void companyName(String name , int id , char block ) {
		System.out.println("name is "+name);
		System.out.println("id is "+id);
		System.out.println("block is "+block);
	}
	public static void main(String[] args) {
		CompanyInfo ci=new CompanyInfo();
		ci.companyName("ram", 123, 'a');
		
	}

}
