package ö����;

public class Season {
	//��final����Season��Ϊ���ɱ�����
	private final String name;
	private final String desc;
	public static final Season SPRING=new Season("����","̤��");
	public static final Season SUMMER=new Season("����","��");
	public static final Season FALL=new Season("����","����Ҷ");
	public static final Season WINNER=new Season("����","��");
	public static Season getSeason(int seasonNum){
		switch(seasonNum){
		case 1:
			return SPRING;
		case 2:
			return SUMMER;
		case 3:
			return FALL;
		case 4:
			return WINNER;
		default:
			return null;
		}
	}
	//�������������private����Ȩ��
		private Season (String name,String desc)
		{
			this.name=name;
			this.desc= desc;
		}
		public String getName() {
			return this.name;
		}
		public String getDesc() {
			return this.desc;
		}
		
	}


