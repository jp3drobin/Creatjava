import java.util.*;
public class TestIterator
{
	public static void main(String[] args) {
		Collection books=new HashSet();
		books.add("guoguo");
		books.add("java");
		books.add("php");
		//获取books集合对应迭代器
		Iterator it=(Iterator)books.iterator();
		while(it.hasNext())
		{
			String book=(String)it.next();
			System.out.println(book);
			if(books.equals("java"))
			{
				//从集合删除上一次next方法返回的元素
				it.remove();
			}
			book="测试字符串";
		}
		System.out.println(books);

	}
}

//使用Iterator过程中，不能修改元素，不然会发生异常