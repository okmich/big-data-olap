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
    private int eventYear;
    private int eventMonth;
    private int weekOfMonth;
    private String eventQuarter;
    private String monthName;
    private int dayofMonth;
    private String dayNameOfWeek;
    private int eventHour;
    private int eventMinute;
    private String gmtOffset;
    private String method;
    private String url;
    private String statusCode;
    private long size;
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
        log.size = parseSize(matcher.group(10));

        try {
            String dateTime = matcher.group(4);
            cal.setTime(DATE_FORMAT.parse(dateTime));

            log.eventYear = cal.get(Calendar.YEAR);
            log.eventQuarter = deriveQuarter(cal.get(Calendar.MONTH));
            log.weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
            log.dayNameOfWeek = getDayForInt(cal.get(Calendar.DAY_OF_WEEK));
            log.dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
            log.dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
            log.eventHour = cal.get(Calendar.HOUR_OF_DAY);
            log.eventMinute = cal.get(Calendar.MINUTE);
            log.eventMonth = cal.get(Calendar.MONTH);
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

    static long parseSize(String sz) {
        try {
            return Long.parseLong(sz);
        } catch (NumberFormatException ex) {
            return 0l;
        }
    }

    private static String deriveQuarter(int get) {
        switch (get) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                return "Q1";
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                return "Q2";
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                return "Q3";
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                return "Q4";
            default:
                return "";

        }
    }

}
