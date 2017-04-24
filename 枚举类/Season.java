package 枚举类;

public class Season {
	//用final定义Season类为不可变属性
	private final String name;
	private final String desc;
	public static final Season SPRING=new Season("春天","踏青");
	public static final Season SUMMER=new Season("夏天","热");
	public static final Season FALL=new Season("秋天","看树叶");
	public static final Season WINNER=new Season("冬天","冷");
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
	//将构造器定义成private访问权限
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


