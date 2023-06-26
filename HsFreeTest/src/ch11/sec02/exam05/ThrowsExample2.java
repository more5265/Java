package ch11.sec02.exam05;

import java.security.KeyStore.CallbackHandlerProtection;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception{
		findClass();
		
	}

	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lnag.String2");
	}
}
