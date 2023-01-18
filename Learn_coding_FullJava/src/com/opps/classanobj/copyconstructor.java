package com.opps.classanobj;

public class copyconstructor {
	int a;
	String b;
	copyconstructor() {
		 a = 10;
	     b = "prasadch22";
	
	}
	copyconstructor(copyconstructor ref)
	{
		a = ref.a;
		b = ref.b;
	
	System.out.println(a+" "+b);
	
	}
	
	
	
	public static void main(String[] args) {

		copyconstructor ob=new copyconstructor();
		copyconstructor ob1=new copyconstructor(ob);
		
	}

}
