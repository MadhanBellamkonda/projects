package com.test.lambdaexpression;

interface FunInterface {

	void proc1();

	void proc2();

}
interface Sub extends FunInterface {
	void proc3();
}

class Dec implements Sub {
	public void proc1() {
		System.out.println("react");

	}

	public void proc2() {
		System.out.println("java");

	}

	public void proc3() {
		System.out.println("python");

	}
}

public class Mainclass {
public static void main(String[] args) {
	Dec d= new Dec();
	d.proc1();
	d.proc2();
	d.proc3();
}
}
