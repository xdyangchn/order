package com.spring.yxd.order.repository;

import com.spring.yxd.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 杨贤达
 * 2018/6/16 16:50
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
