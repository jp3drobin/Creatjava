import java.util.*;
public class Testcollection
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合的元素个数为:"+c.size());
		c.remove(6);
		System.out.println("c集合的元素个数为:"+c.size());
		System.out.println("C集合的是否包含孙悟空字符串"+c.contains("孙悟空"));
		c.add("J2EE");
		System.out.println("c集合的元素:"+c);
		Collection books= new HashSet();
		books.add("j2EE");
		books.add("isgood");
		System.out.println("C集合是否完全包含books集合"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("C元素集合"+c);
		c.clear();
		System.out.println("C元素集合"+c);
		books.retainAll(c);
		System.out.println("books元素集合"+books);
	}
}
//Collection:添加、删除返回集合的元素个数以及清空整个集合
//Collection重写了toString()方法