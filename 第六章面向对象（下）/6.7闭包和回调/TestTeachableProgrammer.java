package 闭包和回调;
public class TestTeachableProgrammer {

	public static void main(String[] args) {
		TeachableProgrammer tp=new TeachableProgrammer();
		//直接调用TeachableProgrammer继承过来的方法
		tp.work();
		//表面调用Closure的Work方法，实际回调TeachableProgrammer的Teach方法
		tp.getCallbackReference().work();
	}

}
