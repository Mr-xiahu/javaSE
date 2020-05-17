package com.xiahu.Finally;
/*
 * finally:被finally控制的语句体一定会执行
 * 注意：如果在执行到finally之前jvm退出了，就不能执行了。
 * 
 * A:格式
 * 		try...catch...finally...
 * B:用于释放资源，在IO流操作和数据库操作中会见到
 * 
 * 
 * 
 * 
 * 面试题：
 * 1:final,finally和finalize的区别
 * final：最终的意思，可以修饰类，成员变量，成员方法
 * 		修饰类，类不能被继承
 * 		修饰变量，变量是常量
 * 		修饰方法，方法不能被重写
 * finally：是异常处理的一部分，用于释放资源。
 * 		一般来说，代码肯定会执行，特殊情况：在执行到finally之前jvm退出了
 * finalize：是Object类的一个方法，用于垃圾回收
 * 
 * 2:如果catch里面有return语句，请问finally里面的代码还会执行吗?
 *   如果会，请问是在return前，还是return后。
 * 	   会。前。
 * 
 * 	 准确的说，应该是在中间。
 * 
 * 3:try...catch...finally的格式变形
 * 		A:try...catch...finally
 * 		B:try...catch
 * 		C:try...catch...catch...
 * 		D:try...catch...catch...finally
 * 		E:try...finally
 * 			这种做法的目前是为了释放资源。
 */
public class FinallyDemo {

}
