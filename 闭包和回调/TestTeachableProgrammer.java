package �հ��ͻص�;
public class TestTeachableProgrammer {

	public static void main(String[] args) {
		TeachableProgrammer tp=new TeachableProgrammer();
		//ֱ�ӵ���TeachableProgrammer�̳й����ķ���
		tp.work();
		//�������Closure��Work������ʵ�ʻص�TeachableProgrammer��Teach����
		tp.getCallbackReference().work();
	}

}
