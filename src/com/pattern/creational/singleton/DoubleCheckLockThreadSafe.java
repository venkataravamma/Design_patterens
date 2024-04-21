package com.pattern.creational.singleton;

public class DoubleCheckLockThreadSafe {
 private static DoubleCheckLockThreadSafe instance;
 
  private DoubleCheckLockThreadSafe() {}
  
  public static synchronized DoubleCheckLockThreadSafe getInstance() {
	  if(instance ==null) {
		  synchronized (DoubleCheckLockThreadSafe.class) {
			if(instance==null) {
				instance =new DoubleCheckLockThreadSafe();
			}
		}
	  }
	  return instance;
  }
}
