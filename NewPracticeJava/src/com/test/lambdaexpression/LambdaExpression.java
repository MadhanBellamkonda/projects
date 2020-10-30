package com.test.lambdaexpression;

public class LambdaExpression {

	int a;
	int b = 9;

	public int sum() {

		return a + b;
	}

	public int add() {

		return a + b;
	}

	public int result() {

		return new LambdaExpression().add();
	}
	public static void main(String[] args) {
		LambdaExpression e = new  LambdaExpression();
		
		System.out.println(e.sum()+e.result()+e.add());
				
				
	}

}
