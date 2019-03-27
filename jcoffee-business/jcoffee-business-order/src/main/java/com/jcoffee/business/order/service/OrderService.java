package com.jcoffee.business.order.service;

import com.jcoffee.database.order.entity.Order;

import java.util.List;
import java.util.Map;


public interface OrderService {
   public List<Order> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public Map<String, String> add(Order order) throws Exception;
   public Order query(Integer id) throws Exception;
   /**
    * 根据订单编号查询订单
    * @param orderNumber 订单编号
    * @return
    * @throws Exception
    */
   public Order queryByOrderNumber(String orderNumber) throws Exception;
   /**
    * 修改交易状态
    * @param order
    * @throws Exception
    */
   public String updatePayState(Order order)throws Exception;

   public void update(Order order)throws Exception;



   public  void updateOrder(Integer orderId);

}


