package java11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
	
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("6129113.720000000");
		BigDecimal b = new BigDecimal("37254920.42000000");
		
		System.out.println(a.divide(b,2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100D)).toString());
		
	}

}


class A{

final static void foo(){}
}

class B extends A{

final static void foo(){}
}