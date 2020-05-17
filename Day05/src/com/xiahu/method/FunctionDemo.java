package com.xiahu.method;

/*
 * 求两个数的和
 */
public class FunctionDemo {

	/*
	 * 方法：完成特定功能的代码块。
	 * 
	 * 注意：在很多语言里面有函数的定义，而在Java中函数被称为方法。
	 * 
	 * 方法格式： 修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) { 
	 *    方法体语句; 
	 *    return 返回值; 
	 * } 
	 * 详细解释：
	 *    修饰符：目前就用 public static。
	 *        后面我们再详细的讲解其他的修饰符。 
	 *    返回值类型：就是功能结果的数据类型。
	 *    方法名：符合命名规则即可。方便我们的调用。
	 *    参数： 
	 *        实际参数：就是实际参与运算的。 
	 *        形式参数；就是方法定义上的，用于接收实际参数的。
	 *    参数类型：就是参数的数据类型 参数名：就是变量名 
	 *    方法体语句：就是完成功能的代码。 
	 *    return：结束方法的。
	 *    返回值：就是功能的结果，由return带给调用者。
	 * 
	 * 要想写好一个方法，就必须明确两个东西： A:返回值类型 结果的数据类型 B:参数列表 你要传递几个参数，以及每个参数的数据类型
	 * 
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int sum = sum(x, y);
		System.out.println(sum);
	}

	public static int sum(int x, int y) {
		return x + y;
	}

}
