package jp.co.goalist.training;

import java.util.Calendar;

public class Training {

	public static void main(String[] args) {

		 Calendar calendar = Calendar.getInstance();

		    int todayMonth = calendar.get(Calendar.MONTH) + 1;
		    int todayDay = calendar.get(Calendar.DATE);

		System.out.println("今日は"+ todayMonth +"月"+todayDay +"日です。");
	}

}
