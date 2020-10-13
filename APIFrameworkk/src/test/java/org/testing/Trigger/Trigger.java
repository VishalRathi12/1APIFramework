package org.testing.Trigger;

import java.io.IOException;

import org.testing.Testscripts.TC1;
import org.testing.Testscripts.TC2;
import org.testing.Testscripts.TC3;

public class Trigger {
	
	public static void main(String[] args) throws IOException {
		
		TC1 obj = new TC1();
		obj.testcase1();
		
		
		TC2 obj2 = new TC2();
		obj2.testcase2();
		
		TC3 obj3 = new TC3();
		obj3.testcase3();
		
		
	}

}
