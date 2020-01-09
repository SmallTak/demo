package com.autoinput.sqlser;

import com.alibaba.fastjson.JSONObject;
import com.autoinput.sqlser.utils.JsonHttpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Random;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-09 14:20
 */
@Service
public class RandomIpTest {

    @Value("${AK}")
    private String AK;
    String str = "PLu1mKO7CIniVy1kXqWaNOp6wbp2EN58";

    public String getRandomIp() {
// ip范围
        int[][] range = {{607649792, 608174079},// 36.56.0.0-36.63.255.255
                {1038614528, 1039007743},// 61.232.0.0-61.237.255.255
                {1783627776, 1784676351},// 106.80.0.0-106.95.255.255
                {2035023872, 2035154943},// 121.76.0.0-121.77.255.255
                {2078801920, 2079064063},// 123.232.0.0-123.235.255.255
                {-1950089216, -1948778497},// 139.196.0.0-139.215.255.255
                {-1425539072, -1425014785},// 171.8.0.0-171.15.255.255
                {-1236271104, -1235419137},// 182.80.0.0-182.92.255.255
                {-770113536, -768606209},// 210.25.0.0-210.47.255.255
                {-569376768, -564133889}, // 222.16.0.0-222.95.255.255
        };

        Random rdint = new Random();
        int index = rdint.nextInt(10);
        String ip = num2ip(range[index][0] + new Random().nextInt(range[index][1] - range[index][0]));
        return ip;

    }

    /*
     * 将十进制转换成ip地址
     */
    public static String num2ip(int ip) {
        int[] b = new int[4];
        String x = "";

        b[0] = (int) ((ip >> 24) & 0xff);
        b[1] = (int) ((ip >> 16) & 0xff);
        b[2] = (int) ((ip >> 8) & 0xff);
        b[3] = (int) (ip & 0xff);
        x = Integer.toString(b[0]) + "." + Integer.toString(b[1]) + "." + Integer.toString(b[2]) + "." + Integer.toString(b[3]);

        return x;
    }

    @Test
    public void test() throws IOException {
        System.out.println(AK);
        String url = "http://api.map.baidu.com/location/ip?ak=" + str + "&ip=" + getRandomIp() + "&coor=bd09ll%20//HTTP";
       JSONObject jsonObject = JsonHttpService.readJsonFromUrl(url);
        //这里只取出了两个参数，根据自己需求去获取
        JSONObject obj = (JSONObject) ((JSONObject) jsonObject.get("content")).get("address_detail");
        String province = obj.getString("province");
        System.out.println(province);

        JSONObject obj2 = (JSONObject) ((JSONObject) jsonObject.get("content")).get("address_detail");
        String address = obj2.getString("city");
        System.out.println(address);
    }


    @Test
    public void t(){

        String str = "http://dmfw.mca.gov.cn/service.html?subject=2";
        String sub = str.substring(36);
        System.out.println(str.substring(36));
        System.out.println(sub.substring(0,6));
        System.out.println(str.substring(0,35));

//        int iRandom = (int)( 1 + Math.random()*10);
//        for (int i = 0; i < 50; i ++){
//            //System.out.println(1 + Math.random()*10);
//            System.out.println(new Random().nextInt(10));
//        }

    }
}
