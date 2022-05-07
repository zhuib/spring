package top.iaminlearn.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 把字符串转换日期
* */
public class StringToDateConverter implements Converter<String, Date> {

    /*
    * String source 传入进来的字符串
    * */
    @Override
    public Date convert(String source) {
        if(source == null){
            throw new RuntimeException("请输入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
//            把字符串转换成日期
           return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转化出现错误");
        }

    }
}
