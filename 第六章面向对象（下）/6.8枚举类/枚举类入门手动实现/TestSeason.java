package ö����;

public class TestSeason {
	
	public TestSeason(Season s){
		System.out.println(s.getName()+"������һ��"+s.getDesc()+"�ļ���");
	}
	public static void main(String[] args) {
		//ֱ��ʹ��Season��FALL��������Season����
		new TestSeason(Season.FALL);
	}

}
