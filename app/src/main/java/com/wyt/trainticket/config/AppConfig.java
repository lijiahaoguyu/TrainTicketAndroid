package com.wyt.trainticket.config;

/**
 * Created by cookie on 2017/3/16 0016.
 * <p>
 * 设置，接口
 */
public class AppConfig {
    /*
    https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2017-03-18&leftTicketDTO.from_station=VAP&leftTicketDTO.to_station=NKH&purpose_codes=ADULT
     */

    /**
     * 12306api地址
     */
    public static final String APIURL = "https://kyfw.12306.cn/otn/leftTicket/query";

    /**
     * 出发时间参数
     */
    public static final String DATE = "leftTicketDTO.train_date";

    /**
     * 出发站参数
     */
    public static final String FROM = "leftTicketDTO.from_station";

    /**
     * 终点站参数
     */
    public static final String TO = "leftTicketDTO.to_station";

    /**
     * 车票类型 ADULT-成人，0X00-学生
     */
    public static final String TYPE = "purpose_codes";

    /**
     * 成人
     */
    public static final String ADULT = "ADULT";

    /**
     * 学生
     */
    public static final String STUDENT = "0X00";

    /**
     * 全部
     */
    public static final int MODEL_ALL = 0;

    /**
     * G/D/C
     */
    public static final int MODEL_GDC = 1;

    /**
     * Z字头
     */
    public static final int MODEL_Z = 2;

    /**
     * T字头
     */
    public static final int MODEL_T = 3;

    /**
     * K字头
     */
    public static final int MODEL_K = 4;

    /**
     * 其他
     */
    public static final int MODEL_OTHER = 5;


    /**
     * 座次席别
     */
    public static final String SWZ = "商务座";
    public static final String YDZ = "一等座";
    public static final String EDZ = "二等座";
    public static final String YZ = "硬座";
    public static final String YW = "硬卧";
    public static final String WZ = "无座";

    /**
     * 订单状态
     */
    public static final int ORDER_NOW = 0;
    public static final int ORDER_OLD = 1;
}