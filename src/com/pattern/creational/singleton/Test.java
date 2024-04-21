package com.pattern.creational.singleton;

public class Test {
	public static void main(String[] args) {
		System.out.println("===EagerInitializedSingleton===");
		EagerInitializedSingleton e1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton e2 = EagerInitializedSingleton.getInstance();
		System.out.println(e1 == e2);
		System.out.println(e1.hashCode() + " " + e2.hashCode()); e1 = EagerInitializedSingleton.getInstance();
		
		System.out.println();
		System.out.println("===StaticBlockSingleton===");
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		

		System.out.println();
		System.out.println("===LazyInitializedSingleton===");
		LazyInitializedSingleton l1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton l2 = LazyInitializedSingleton.getInstance();
		System.out.println(l1 == l2);
		System.out.println(l1.hashCode() + " " + l2.hashCode());
		
		System.out.println();
		System.out.println("===DoubleCheckLockThreadSafe===");
		DoubleCheckLockThreadSafe d1 = DoubleCheckLockThreadSafe.getInstance();
		DoubleCheckLockThreadSafe d2 = DoubleCheckLockThreadSafe.getInstance();
	    System.out.println(d1 == d2);
		System.out.println(d1.hashCode() + " " + d2.hashCode());
		
		System.out.println();
		System.out.println("===BillPughSingleton===");
		BillPughSingleton b1 = BillPughSingleton.getInstance();
		BillPughSingleton b2 = BillPughSingleton.getInstance();
	    System.out.println(b1 == b2);
		System.out.println(b1.hashCode() + " " + b2.hashCode());
		
		System.out.println();
		System.out.println("===SerializedSingleton===");
		SerializedSingleton sr1 = SerializedSingleton.getInstance();
		SerializedSingleton sr2 = SerializedSingleton.getInstance();
	    System.out.println(sr1 == sr2);
		System.out.println(sr1.hashCode() + " " + sr2.hashCode());

	}
}
