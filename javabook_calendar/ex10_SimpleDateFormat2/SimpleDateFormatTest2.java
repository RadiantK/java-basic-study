package ex10_SimpleDateFormat2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {

	public static void main(String[] args) {

		DateFormat df  = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date d = df.parse("2020�� 8�� 15��");
			System.out.println(df2.format(d));
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
