
public class BankApp {
	public static void main(String[] args){
		//...��¼
		//����һ���˻�
		Account acc = new Account();
		//1.����500 Ԫ
		acc.save(500.0);
		//2.ȡ��100 Ԫ
		// ���
		acc.depoit(100.0);
		//3.��ʾ��ȡ�����ϸ���������ͣ�����������ʱ�䣬��
		acc.history();
	}
}