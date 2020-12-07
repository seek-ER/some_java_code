package com.xys.demo3;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss.SSS a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        System.out.println("The Runner start to initialize ..."+sdf.format(date));
    }
}