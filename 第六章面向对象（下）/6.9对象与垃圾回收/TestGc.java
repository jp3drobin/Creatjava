public class TestGc
{
	private double height;
	public static void main(String[] args) {
		for (int i=0;i<4 ;i++ ) {
			new TestGc();
			// 强制执行垃圾回收系统
			//System.gc()
			Runtime.getRuntime().gc();
		}
	}
	public void finalize()
	{
		System.out.println("系统正在清理TestGc对象的资源");
	}
}