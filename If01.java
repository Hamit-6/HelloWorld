import java.util.Scanner;//表示把java.util这个包下面的Scanner这个类给导入进去
public class If01 {
	public static void main(String[] args) {
		
		
		Scanner myScanner = new Scanner(System.in);
		
		
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你的年龄大于18，要对自己负责");
		}
		
		System.out.println("程序继续...");
		
	}	
}