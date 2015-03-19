
public class BankApp {
	public static void main(String[] args){
		//...登录
		//开设一个账户
		Account acc = new Account();
		//1.存入500 元
		acc.save(500.0);
		//2.取出100 元
		// 检查
		acc.depoit(100.0);
		//3.显示存取款的明细（操作类型，操作金额，操作时间，余额）
		acc.history();
	}
}