package 枚举类;

public class TestSeason {
	
	public TestSeason(Season s){
		System.out.println(s.getName()+"这真是一个"+s.getDesc()+"的季节");
	}
	public static void main(String[] args) {
		//直接使用Season的FALL常量代表Season对象
		new TestSeason(Season.FALL);
	}

}
