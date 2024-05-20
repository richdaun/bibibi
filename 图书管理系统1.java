package 课堂;
import java.util.*;
public class 图书管理系统1 {
          public static void main(String[] args) {
	     	String book[][]= {
				{"三国演义","罗贯中","11出版社","4400"},
				{"水浒传","施耐庵","22出版社","3300"},
				{"西游记","吴承恩","33出版社","2200"},
				{"红楼梦","曹雪芹","44出版社","1100"}};
				Scanner sc=new Scanner(System.in);
				System.out.println("输入作者：");
				String writer;
				writer=sc.next();
				for(int i=0;i<book.length;i++)
				{
					if(book[i][1].equals(writer)) {
					 System.out.println("你要查看的书的信息为");
					 System.out.println("书的名字:"+book[i][0]);
					 System.out.println("书的作者:"+book[i][1]);
				     System.out.println("书的出版社:"+book[i][2]);
					 System.out.println("书的ISBN号:"+book[i][3]);

					}
				}
			}
}
