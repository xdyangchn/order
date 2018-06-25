package com.spring.yxd.order.service;

import com.spring.yxd.order.dto.OrderDTO;

/**
 * Created by 杨贤达
 * 2018/6/16 17:43
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
