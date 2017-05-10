package jp.co.goalist.training;

import java.util.Calendar;

public class Training {

	public static void main(String[] args) {

		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, 1);

		    int tomorrowMonth = cal.get(Calendar.MONTH) + 1;
		    int tomorrowDay = cal.get(Calendar.DATE);

		System.out.println("明日は"+ tomorrowMonth +"月"+tomorrowDay +"日です。");
	}

}
