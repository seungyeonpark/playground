package mc.ys.lesson9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {
	public static final int FULL_INFO = 2;
	public static final int DATE_INFO = 0;
	public static final int TIME_INFO = 1;

	public String getDateInfo(int type) {
		String now = null;
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		now = sdf.format(new Date());
		String[] info = now.split(" ");
		
		if(type == 0) {
			now = info[0];
		} else if(type==1) {
			now = info[1];
		} 
		
		return now;
	}
}