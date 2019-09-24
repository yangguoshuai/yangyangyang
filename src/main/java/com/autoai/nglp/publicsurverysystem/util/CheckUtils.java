package com.autoai.nglp.publicsurverysystem.util;

import com.github.pagehelper.StringUtil;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author LR
 */
public class CheckUtils {
    private CheckUtils(){}

    /**
     * 正整数
     */
    private static final String CHECK_INT_PATTERN   = "[0-9]*";

    /**
     * 正则匹配表达式
     */
    private static final  Pattern PATTERN = Pattern.compile(".*[0-9]+.*");

    /**
     * 判断数字是否为非负整数
     *
     * @param num 参数
     * @return true、false
     */
    public  static  boolean intValid(Integer num) {
        String str = String.valueOf(num);
        Pattern pattern = Pattern.compile(CHECK_INT_PATTERN);
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }

    /**
     * 验证参数是否为空
     *
     * @param params 参数
     */
    public static String validate(String... params) {
        String message = null;
        for (String param : params) {
            if (StringUtil.isEmpty(param) || "null".equals(param)) {
                message = "参数不合法!";
                break;
            }
        }
        return message;
    }

    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str 参数
     * @return true、false
     */
    public static boolean isNumeric(String str){
        Matcher isNum = PATTERN.matcher(str);
        return isNum.matches();
    }

    /**
     * 字符串处理
     * @param word 参数
     * @return 处理后的参数
     */
    public static String processWord(String word){
        //去前后空格,大写转小写
        word = word.trim().toLowerCase();

        //去掉所有的特殊字符
        word = word.replaceAll( "[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]" , "");

        return word;
    }

    /**
     * 是否含有中文数字
     * @param str 参数
     * @return true、false
     */
    public static Boolean isCHNumber(String str){
        String regEx = ".*[一二三四五六七八九十]+.*";

        Pattern compile = Pattern.compile(regEx);

        Matcher matcher = compile.matcher(str);

        return matcher.find();
    }

    /**
     * 是否含有大写字母
     */
    public static Boolean isUpper(String str){
        String regEx = ".*[A-Z]+.*";

        Pattern compile = Pattern.compile(regEx);

        Matcher matcher = compile.matcher(str);

        return matcher.find();
    }

    /**
     * 是否含有小写字母
     */
    public static Boolean isLower(String str){
        String regEx = ".*[a-z]+.*";
        Pattern compile = Pattern.compile(regEx);

        Matcher matcher = compile.matcher(str);

        return matcher.find();
    }

    /**
     * 数据处理
     */
    public static String processData(String str){
        if(StringUtils.isEmpty(str)){
            return str;
        }

        //去空格
        str = str.trim();

        return str;
    }
}
