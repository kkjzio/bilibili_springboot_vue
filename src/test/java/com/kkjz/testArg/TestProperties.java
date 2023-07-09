package com.kkjz.testArg;

import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author kkjz
 * @create 2023-07-07 11:09
 */


public class TestProperties {

    @Test
    public void test1(){
        Properties properties = new Properties();

        try {
            // 通过字符流读取
            InputStream in =this.getClass().getClassLoader().getResourceAsStream("slidePic.properties");
            properties.load(new InputStreamReader(in, "UTF-8"));

            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.out.println(key + " = " + value);
            }

            // 设置首页滑条显示的大头图和介绍 videoID，desc,slidePic

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
