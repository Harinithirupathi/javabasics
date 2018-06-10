package com.types;

import java.io.IOException;

public class RuntimeEx {
	
public static void main(String[] args) 
{
Runtime runtime=Runtime.getRuntime();
int pro=runtime.availableProcessors();
System.out.println(pro);
try {
	runtime.exec("notepad");
} catch (IOException e) {
	
	e.printStackTrace();
}
}
}
