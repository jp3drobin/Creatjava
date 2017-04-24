package 闭包和回调;
public class TeachableProgrammer  extends Programmer{
					public TeachableProgrammer(){}
					public TeachableProgrammer(String name){
						super(name);
					}
					//教师工作由TeachableProgrammer类定义
					private void teach(){
						System.out.println(getName()+"教师在讲台讲课");
					}
					private class Closure implements Teachable{
						/*
						 * 非静态内部类回调外部类实现work方法，非静态内部类引用的
                            作用仅仅是向客户提供一个回调外部类的途径
						 */
						@Override
						public void work() {
								teach();					
						}
					}
					//返回一个非静态内部类引用，允许外部类通过该非静态内部类引用回调外部类的方法
					public Teachable  getCallbackReference(){
						return new Closure();
					}
}
