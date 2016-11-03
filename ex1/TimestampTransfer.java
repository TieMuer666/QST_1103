package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")	//告诉编译器忽略指定的警告，不用在编译完成后出现警告信息。
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	//新创建一个输入的Scanner 对象，然后赋值给in。
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//对日期字符串进行解析和格式化输入
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	//对日期字符串进行解析和格式化输出
		while (scanner.hasNext()){	//要判断scanner当前是否有下个节点 有才执行
			String line = scanner.nextLine();	//使用nextLine方式接收字符串，赋值给line
			Date lineDate = null;	//初始化lineDate，类型为Date
			long lineTimestamp;	//定义lineTimestamp，为long类型
			try {
				lineDate = inputFormat.parse(line);	//将line的值赋给lineDate	
				lineTimestamp = lineDate.getTime();	//使用getTime()方法得到时间戳
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);	//输出合并后的：日期和时间戳
			} catch (ParseException e) {	//异常捕捉	
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
