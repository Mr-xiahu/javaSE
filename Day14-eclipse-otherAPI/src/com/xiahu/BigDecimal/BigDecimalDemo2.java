package com.xiahu.BigDecimal;

import java.math.BigDecimal;

/**
 * @author Administrator
 * 构造方法：
 * 	 public BigDecimal(String val)
 * 
 * 成员方法：
 *   public BigDecimal add(BigDecimal augend)
 *   public BigDecimal subtract(BigDecimal subtrahend)
 *   public BigDecimal multiply(BigDecimal multiplicand)
 *   public BigDecimal divide(BigDecimal divisor)
 *   public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
 */
public class BigDecimalDemo2 {
	public static void main(String[] args) {
//		System.out.println(0.09 + 0.01);
//		System.out.println(1.0 - 0.32);
//		System.out.println(1.015 * 100);
//		System.out.println(1.301 / 100);
		
	    //public BigDecimal add(BigDecimal augend)
		BigDecimal bd1=new BigDecimal("0.09");
		BigDecimal bd2=new BigDecimal("0.01");
		System.out.println("add:"+bd1.add(bd2));
		
		//public BigDecimal subtract(BigDecimal subtrahend)
		System.out.println("subtract:"+bd1.subtract(bd2));
		
		//public BigDecimal multiply(BigDecimal multiplicand)
		System.out.println("multiply:"+bd1.multiply(bd2));
		
		//public BigDecimal divide(BigDecimal divisor)
		System.out.println("divide:"+bd1.divide(bd2));
		
		//public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
		System.out.println("divide:"+ bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP));
	}

}
