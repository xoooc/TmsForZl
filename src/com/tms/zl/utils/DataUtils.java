package com.tms.zl.utils;

import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * Created by Administrator on 14-1-12.
 */
public class DataUtils {
    public static <E> String wrapJsonDataForDataGrid(List<E> list) {
        int total = list.size();
        return "{\"total\":" + total + ", \"rows\":" + JSON.toJSONString(list) + "}";

    }
}
