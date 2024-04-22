package com.patteren.creational.builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
        //without any inconsistent state or arguments management issues
		Computer comp1 = new Computer.ComputerBuilder("500 GB", "2.4 GB").setGraphicsCardEnabled(false)
				.setBluetoothEnabled(true).bulid();
		Computer comp2 = new Computer.ComputerBuilder("500 GB", "2 GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(false).bulid();
		
		System.out.println(comp1);
		System.out.println(comp2);
		
	}
}
