package com.javaex.miniprogram1;

public class customerList {
	private String index;
	private String name;
    private String phoneNumber;
    private String companyNumber;

    public customerList(int count,String name, String phoneNumber, String companyNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyNumber = companyNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    @Override
    public String toString() {
    	return index +". "+ name +" "+phoneNumber +" "+companyNumber;
    }
}
