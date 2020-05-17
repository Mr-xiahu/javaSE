package com.xiahu.BigInteger;

import java.math.BigInteger;

/**
 * @author Administrator
 *  public BigInteger add(BigInteger val):加
 *  public BigInteger subtract(BigInteger val):减
 *  public BigInteger multiply(BigInteger val):乘
 *  public BigInteger divide(BigInteger val):除
 *  public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
 */
public class BigIntegerDemo2 {
	public static void main(String[] args) {
		BigInteger bg=new BigInteger("101");
		BigInteger bg2=new BigInteger("50");
		
		//public BigInteger add(BigInteger val):加
		BigInteger bg3=bg.add(bg2);
		System.out.println(bg3);
		System.out.println("------------");
		
		//public BigInteger subtract(BigInteger val):减
		BigInteger bg4=bg.subtract(bg2);
		System.out.println(bg4);
		System.out.println("------------");
		
		// public BigInteger multiply(BigInteger val):乘
		BigInteger bg5=bg.multiply(bg2);
		System.out.println(bg5);
		System.out.println("------------");
		
		//public BigInteger divide(BigInteger val):除
		BigInteger bg6=bg.divide(bg2);
		System.out.println(bg6);
		System.out.println("------------");
		
		//public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
		BigInteger[] bigs=bg.divideAndRemainder(bg2);
		System.out.println("商:"+bigs[0]);
		System.out.println("余数:"+bigs[1]);
		
	}

}
