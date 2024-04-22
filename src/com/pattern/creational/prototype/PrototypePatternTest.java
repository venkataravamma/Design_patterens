package com.pattern.creational.prototype;

import java.util.List;

public class PrototypePatternTest {
 public static void main(String[] args) throws CloneNotSupportedException {
	Employees emps=new Employees();
	emps.loadData();
	
	Employees emp1=(Employees) emps.clone();
	Employees emp2=(Employees) emps.clone();
	List<String> list=emp1.getEmpList();
	list.add("Venky");	
	List<String> list1=emp2.getEmpList();
	list1.remove("Lisa");
	System.out.println("emps List: "+emps.getEmpList());
	System.out.println("empsNew List: "+list);
	System.out.println("empsNew1 List: "+list1);
	
}
} 
