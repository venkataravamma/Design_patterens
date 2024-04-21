package com.pattern.creational.abstractFactory;

import com.pattern.creational.factory.Computer;
import com.pattern.creational.factory.Server;

public class ServerFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;

	 public ServerFactory(String ram,String hdd,String cpu) {
		 this.ram=ram;
		 this.hdd=hdd;
		 this.cpu=cpu;
	 }
	 
	@Override
	public Computer creatComputer() {
		
		return new Server(ram,hdd,cpu);
	}

}
