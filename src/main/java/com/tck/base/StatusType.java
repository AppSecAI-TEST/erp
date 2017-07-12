package com.tck.base;

/**
 * Created by tck on 2017/7/12.
 */
public enum StatusType {

    ADD_SUCCESS("新增成功"),
    ADD_ERROR("新增失败"),
    SELECT_SUCCESS("新增查询成功"),
    WEB_ERROR("服务器异常");


    String value;

    StatusType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
