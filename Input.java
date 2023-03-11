import java.util.Scanner;//表示把java.util这个包下面的Scanner这个类给导入进去
public class Input {
	public static void main(String[] args) {
		//第一步导入Scanner类所在的包=>java.until
		//第二步 创建Scanner对象
		
		Scanner myScanner = new Scanner(System.in);
		//第三步 接受用户的输入
		System.out.println("请输入名字");
		String name = myScanner.next();
		
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();
		
		System.out.println("人的信息如下：");
		System.out.println("名字=" + name + "年龄=" + age + "薪水=" + sal);
	}
}