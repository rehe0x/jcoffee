package com.jcoffee.database.order.mapper;

import com.jcoffee.database.order.entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
   public List<Order> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public void insert(Order order) throws Exception;
   public Order query(Integer id) throws Exception;
   public Order queryByOrderNumber(String orderNumber) throws Exception;
   public Integer update(Order order)throws Exception;
}
