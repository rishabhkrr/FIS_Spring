package com.fis.lambda;



import java.rmi.server.Operation;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		CalculatorImpl c=new CalculatorImpl();
		System.out.println(c.operate(1, 2));
		
		//Anonymous class name
		Calculator cal1= new Calculator() {
			
			public int operate(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		System.out.println(cal1.operate(10,120));
		
		
		
		//Lambda function
		
		Calculator cal2=(a,b)->a+b;
		Calculator cal3=(int a,int b)->a+b;
		Calculator cal4=(a,b)->{return a+b;};
		Calculator cal5=(int a,int b)->{return a+b;};
		
		System.out.println(cal2.operate(200,300));
		System.out.println(cal3.operate(30,40 ));
		System.out.println(cal4.operate(50,60));
		System.out.println(cal5.operate(10,10));
		
		
		
		

	}

}
