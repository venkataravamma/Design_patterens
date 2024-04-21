package com.pattern.creational.abstractFactory;

import com.pattern.creational.factory.Computer;

public class ComputerFactory {
	
 public static Computer getComputer(ComputerAbstractFactory factory) {
	 return factory.creatComputer();
 }
}
