public class ArithmeticOperator {
	public static void main(String[] args) {
		
		System.out.println(10 / 4);//数学是2.5，但java中显示是2.因为取了整数部分
		double d = 10 / 4;
		System.out.println(d);//先计算出2，然后赋给double 所以是2.0
		System.out.println(10.0 / 4);//10.0就变成了double 所以点后面的数被保留了
		
		
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);//%的运算逻辑=> -10 % 3 =-10 - （-10）/3 * 3
		                            // 10 % -3 = 10 - 10/(-3） * 3
		System.out.println(-10 % -3);
		
		
		int i =10 ;
		i++;//自增 等价于 i = i + 1
		++i;//自增 等价于 i = i + 1  把前面的11再加1
		System.out.println("i=" + i);
		
		//作为表达式使用
		int j = 8;
		int k = ++j;
		System.out.println("k=" + k+"\n"+"j=" +j);
		int H = j++;
		System.out.println("H=" + H + "j="+j);
	}
}