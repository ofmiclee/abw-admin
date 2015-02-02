package com.allbuywine.admin.bean.enums;

/**
 * Created by MicLee on 1/27/15.
 */
public interface Regular
{
    /**
     * 验证数字
     */
    String NUMBER = "^[0-9]*$";

    /**
     * 手机号码格式
     */
    String MOBILE = "^1[34578]\\d{9}$";

    /**
     * IP地址正则表达式
     * ((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\
     * d|[01]?\\d?\\d))
     */
    String IPADDRESS = "((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))";

    /**
     * Email正则表达式=^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$
     */
    String EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    /**
     * Double正则表达式 ^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$
     */
    String DOUBLE = "^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|\\d*)$";

    /**
     * 价格正则表达式 (正数不能为零、最多有3有小数，如果第一位为0则下一位必须为小数点)
     */
    String PRICE = "^[+]?(([1-9]\\d*[.]?)|(0.))(\\d{0,3})?$";

    /**
     * 时间正则表达式
     */
    String DATE = "\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}";

    /**
     * 不包含非法字符
     */
    String DO_NOT_HAVE_ILLEGAL = "[^&\\\\<>'\"]+";

    /**
     * 不包含非法字符和空格
     */
    String DO_NOT_HAVE_ILLEGAL_SPECVAL = "^[^\\&<>\\\\]*$";
}
