package com.xiahu.BigInteger;

import java.math.BigInteger;

/**
 * @author Administrator
 *  public BigInteger add(BigInteger val):��
 *  public BigInteger subtract(BigInteger val):��
 *  public BigInteger multiply(BigInteger val):��
 *  public BigInteger divide(BigInteger val):��
 *  public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
 */
public class BigIntegerDemo2 {
	public static void main(String[] args) {
		BigInteger bg=new BigInteger("101");
		BigInteger bg2=new BigInteger("50");
		
		//public BigInteger add(BigInteger val):��
		BigInteger bg3=bg.add(bg2);
		System.out.println(bg3);
		System.out.println("------------");
		
		//public BigInteger subtract(BigInteger val):��
		BigInteger bg4=bg.subtract(bg2);
		System.out.println(bg4);
		System.out.println("------------");
		
		// public BigInteger multiply(BigInteger val):��
		BigInteger bg5=bg.multiply(bg2);
		System.out.println(bg5);
		System.out.println("------------");
		
		//public BigInteger divide(BigInteger val):��
		BigInteger bg6=bg.divide(bg2);
		System.out.println(bg6);
		System.out.println("------------");
		
		//public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
		BigInteger[] bigs=bg.divideAndRemainder(bg2);
		System.out.println("��:"+bigs[0]);
		System.out.println("����:"+bigs[1]);
		
	}

}
