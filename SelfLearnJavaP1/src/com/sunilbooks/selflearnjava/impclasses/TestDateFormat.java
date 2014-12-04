package com.sunilbooks.selflearnjava.impclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Test date format
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestDateFormat {
	public static void main(String[] args) throws Exception {

		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		String strDate = format1.format(today);
		System.out.println("Format#1 :" + strDate);

		SimpleDateFormat format2 = new SimpleDateFormat("MMM dd,yyyy");
		strDate = format2.format(today);
		System.out.println("Format#2 :" + strDate);

		SimpleDateFormat format3 = new SimpleDateFormat("30.06.09");
		strDate = format3.format(today);
		System.out.println("Format#3 :" + strDate);

		SimpleDateFormat format4 = new SimpleDateFormat(
				"yyyy.MM.dd G 'at' hh:mm:ss z");
		strDate = format4.format(today);
		System.out.println("Format#4 :" + strDate);

		SimpleDateFormat format5 = new SimpleDateFormat("EEE, MMM d, ''yy");
		strDate = format5.format(today);
		System.out.println("Format#5 :" + strDate);

		SimpleDateFormat format6 = new SimpleDateFormat("H:mm:ss:SSS");
		strDate = format6.format(today);
		System.out.println("Format#6 :" + strDate);

		SimpleDateFormat format7 = new SimpleDateFormat(
				"yyyy.MMMMM.dd GGG hh:mm aaa");
		strDate = format7.format(today);
		System.out.println("Format#7 :" + strDate);

		// Parse String to Date
		Date parsedDate = format1.parse("15/08/1947");
		System.out.println("Parsed Date :" + parsedDate);

	}
}
