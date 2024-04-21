package com.pattern.creational.abstractFactory;

import com.pattern.creational.factory.Computer;
import com.pattern.creational.factory.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer creatComputer() {

		return new PC(ram, hdd, cpu);
	}

}
