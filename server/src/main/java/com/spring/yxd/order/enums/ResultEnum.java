package com.spring.yxd.order.enums;

import lombok.Getter;

/**
 * Created by 杨贤达
 * 2018/6/16 19:19
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
