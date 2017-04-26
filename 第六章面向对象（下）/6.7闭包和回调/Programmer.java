package 闭包和回调;
interface Teachable
{
	void work();
}
public class Programmer{
	private String name;
	public Programmer(){}
	public Programmer(String name){
		this.name=name;
	}
public String  getName(){
	return name;
}
public  void setName(String name){
		this.name=name;
}
public void work(){
	System.out.println(name+"灯下努力的敲键盘...");
}

}