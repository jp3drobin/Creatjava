package �հ��ͻص�;
public class TeachableProgrammer  extends Programmer{
					public TeachableProgrammer(){}
					public TeachableProgrammer(String name){
						super(name);
					}
					//��ʦ������TeachableProgrammer�ඨ��
					private void teach(){
						System.out.println(getName()+"��ʦ�ڽ�̨����");
					}
					private class Closure implements Teachable{
						/*
						 * �Ǿ�̬�ڲ���ص��ⲿ��ʵ��work�������Ǿ�̬�ڲ������õ�
                            ���ý�������ͻ��ṩһ���ص��ⲿ���;��
						 */
						@Override
						public void work() {
								teach();					
						}
					}
					//����һ���Ǿ�̬�ڲ������ã������ⲿ��ͨ���÷Ǿ�̬�ڲ������ûص��ⲿ��ķ���
					public Teachable  getCallbackReference(){
						return new Closure();
					}
}
