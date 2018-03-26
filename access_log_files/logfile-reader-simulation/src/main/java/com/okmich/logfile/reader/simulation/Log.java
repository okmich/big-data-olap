/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okmich.logfile.reader.simulation;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author michael.enudi
 */
public class Log {

    private static Pattern LOG_PATTERN = Pattern.compile(
            "(.+?)\\s(.+?)\\s(.+?)\\s\\[(.+?)\\s(.+?)\\]\\s\"(.+?)\\s(.+?)\\s(.+?)\"\\s(.+?)\\s(.+?)");

    private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MMM/yyyy:kk:mm:ss");
    private static Calendar cal = Calendar.getInstance();
    private static DateFormatSymbols dfs = new DateFormatSymbols();

    private String ip;
    private String userId;
    private String principal;
    private int year;
    private int month;
    private String monthName;
    private int dayofMonth;
    private String dayNameOfWeek;
    private int hour;
    private int minute;
    private String gmtOffset;
    private String method;
    private String url;
    private String statusCode;
    private String size;
    private String version;
    private long ts;

    public Log() {
    }

    public static Log fromLogEntry(String logEntry) {
        Matcher matcher = LOG_PATTERN.matcher(logEntry);
        if (!matcher.matches()) {
            System.err.println("Bad log entry (or problem with RE?):");
            System.err.println(logEntry);
            return null;
        }
        Log log = new Log();
        log.ip = matcher.group(1);
        log.userId = matcher.group(2);
        log.principal = matcher.group(3);
        log.gmtOffset = "GMT" + matcher.group(5);
        log.method = matcher.group(6);
        log.url = matcher.group(7);
        log.version = matcher.group(8);
        log.statusCode = matcher.group(9);
        log.size = matcher.group(10);

        try {
            String dateTime = matcher.group(4);
            cal.setTime(DATE_FORMAT.parse(dateTime));

            log.year = cal.get(Calendar.YEAR);
            log.dayNameOfWeek = getDayForInt(cal.get(Calendar.DAY_OF_WEEK));
            log.dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
            log.hour = cal.get(Calendar.HOUR_OF_DAY);
            log.minute = cal.get(Calendar.MINUTE);
            log.month = cal.get(Calendar.MONTH);
            log.monthName = getMonthForInt(cal.get(Calendar.MONTH));
            log.ts = cal.getTimeInMillis();
        } catch (Exception e) {
        }
        return log;
    }

    static String getMonthForInt(int m) {
        String month = "invalid";
        String[] months = dfs.getMonths();
        if (m >= 0 && m <= 11) {
            month = months[m];
        }
        return month;
    }

    static String getDayForInt(int d) {
        String day = "invalid";
        String[] days = dfs.getWeekdays();
        if (d >= 1 && d <= 7) {
            day = days[d];
        }
        return day;
    }
}
