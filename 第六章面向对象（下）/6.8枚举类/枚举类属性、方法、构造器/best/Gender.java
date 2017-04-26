public enum Gender{
	//枚举值必须调用对应的构造器来创建
	//等同于public static final Gender MALE=new Gender("男");
	//等同于public static final Gender MALE=new Gender("女");
	MALE("男"),FEMALE("女");
	private String name;
	//枚举类的构造器只能使用private修饰
	private setName(Stirng name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

}