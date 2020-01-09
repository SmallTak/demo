package com.autoinput.sqlser.utils;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-09 15:42
 */

public class GetObject {

    public JSONObject getP(String url) throws IOException {
       return JsonHttpService.readJsonFromUrl(url);
    }

}
