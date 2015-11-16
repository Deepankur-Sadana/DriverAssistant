package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by igorkhomenko on 1/13/15.
 */
public class ChatTimeUtils {
    public final static long ONE_SECOND = 1000;
    public final static long SECONDS = 60;

    public final static long ONE_MINUTE = ONE_SECOND * 60;
    public final static long MINUTES = 60;

    public final static long ONE_HOUR = ONE_MINUTE * 60;
    public final static long HOURS = 24;

    public final static long ONE_DAY = ONE_HOUR * 24;

    private ChatTimeUtils() {
    }

    /**
     * converts time (in milliseconds) to human-readable format
     *  "<w> days, <x> hours, <y> minutes and (z) seconds"
     */
    public static String millisToLongDHMS(long duration) {
        if(duration > 0) {
            duration = new Date().getTime() - duration;
        }
        if(duration < 0){
            duration = 0;
        }

        StringBuffer res = new StringBuffer();
        long temp = 0;
        if (duration >= ONE_SECOND) {
            temp = duration / ONE_DAY;
            if (temp > 0) {
                duration -= temp * ONE_DAY;
                res.append(temp).append(" day").append(temp > 1 ? "s" : "")
                        .append(duration >= ONE_MINUTE ? ", " : "");
            }

            temp = duration / ONE_HOUR;
            if (temp > 0) {
                duration -= temp * ONE_HOUR;
                res.append(temp).append(" hour").append(temp > 1 ? "s" : "")
                        .append(duration >= ONE_MINUTE ? ", " : "");
            }

            temp = duration / ONE_MINUTE;
            if (temp > 0) {
                duration -= temp * ONE_MINUTE;
                res.append(temp).append(" minute").append(temp > 1 ? "s" : "");
            }

            if (!res.toString().equals("") && duration >= ONE_SECOND) {
                res.append(" and ");
            }

            temp = duration / ONE_SECOND;
            if (temp > 0) {
                res.append(temp).append(" second").append(temp > 1 ? "s" : "");
            }
            res.append(" ago");
            return res.toString();
        } else {
            return "0 second ago";
        }
    }

    public static String convertToChatTime(long milliseconds){
        String chatTime=new String();

        Date date=new Date(milliseconds);
        long oneDay=24*60*1000;

        Calendar todayMidnight= Calendar.getInstance();
        todayMidnight.set(Calendar.HOUR_OF_DAY, 0);
        todayMidnight.set(Calendar.MINUTE, 0);
        todayMidnight.set(Calendar.SECOND, 0);
        todayMidnight.set(Calendar.MILLISECOND, 0);

        long midnightMillis=todayMidnight.getTime().getTime();

        if(milliseconds>midnightMillis){
            //Today, so just display time in 12 hours.
            SimpleDateFormat formatter=new SimpleDateFormat("hh:mm aa");
            chatTime=formatter.format(date);
        }else if(milliseconds<midnightMillis && milliseconds>(midnightMillis-oneDay)){
            //Yesterday
            SimpleDateFormat formatter=new SimpleDateFormat("hh:mm aa");
            chatTime="Yesterday "+formatter.format(date);
        }else if(milliseconds<(midnightMillis-oneDay)&& milliseconds>(midnightMillis-oneDay*365)){
            //Even older
            SimpleDateFormat formatter=new SimpleDateFormat("d MMM, hh:mm aa");
            chatTime=formatter.format(date);
        }
        else{
            //Even older
            SimpleDateFormat formatter=new SimpleDateFormat("d MMM yy, hh:mm aa");
            chatTime=formatter.format(date);
        }

        return chatTime;
    }
}
