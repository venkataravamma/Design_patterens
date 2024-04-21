package com.pattern.creational.singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton eager = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
		System.out.println("constructor called");
	}

	public static EagerInitializedSingleton getInstance() {
		return eager;
	}

}
