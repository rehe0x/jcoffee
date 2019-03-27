package com.jcoffee.business.order.service;

import com.jcoffee.database.order.entity.OrderCoupon;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public interface OrderCouponService {
   public List<OrderCoupon> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public void add(OrderCoupon orderCoupon) throws Exception;
   public OrderCoupon query(Integer id) throws Exception;

   /**
    * 查询可提现金额
    * @param parentOpenid
    * @return
    * @throws Exception
    */
   public BigDecimal countAlreadyMoney(String parentOpenid, String openid)throws Exception;



   /**
    * 通过消费劵编号获取消费劵信息
    * @param consumerCoupon
    * @return
    * @throws Exception
    */
   public OrderCoupon queryOrderCouponByConsumerCoupon(String consumerCoupon) throws Exception;
}


