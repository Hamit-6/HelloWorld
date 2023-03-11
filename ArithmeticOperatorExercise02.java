public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		
		//1.理解需求；
		//2.思路分析
		//3.走代码
		int days = 59;
		int weeks = days / 7 ;
		int leftDays = days % 7 ;
		System.out.println(days + "天 合"+ weeks + "星期"  + leftDays + "天");
		
		
		double huaShi = 234.5;
		double sheShi = 5.0/9*(huaShi-100);
		System.out.println("华氏温度=" + huaShi + "摄氏温度=" + sheShi);
		
	}
}
