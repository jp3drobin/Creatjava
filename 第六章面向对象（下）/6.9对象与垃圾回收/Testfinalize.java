public class Testfinalize
{
	private static Testfinalize tf=null;
	public void info()
	{
		System.out.println("测试资源清理的finalize方法");
	}
	public static void main(String[] args) throws Exception{
		//创建对象并进入去活状态
		new Testfinalize();
		//通知系统进行资源回收
		System.gc();
		//强制垃圾回收机制调用去活状态的finalize方法
		Runtime.getRuntime().runFinalization();
		//System.runFinalization();
		tf.info();
	}
	public void finalize()
	{
		//让tf引用到试图回收的去活对象，去活对象重新激活
		tf=this;

	}
}