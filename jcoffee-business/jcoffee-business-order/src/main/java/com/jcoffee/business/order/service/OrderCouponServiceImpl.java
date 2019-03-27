package com.jcoffee.business.order.service;

import com.jcoffee.database.order.entity.OrderCoupon;
import com.jcoffee.database.order.mapper.OrderCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


@Transactional(rollbackFor = Exception.class)
@Service("orderCouponService")
public class OrderCouponServiceImpl implements OrderCouponService {

   @Autowired
   private OrderCouponMapper orderCouponMapper;

   @Autowired
   private OrderService orderService;
   @Override
   public OrderCoupon query(Integer id)  throws Exception{
       return orderCouponMapper.query(id);
   }

   @Override
   public List<OrderCoupon> queryList(Map<String, Object> config)  throws Exception{
       return orderCouponMapper.queryList(config);
   }

   /**
    * 查询团队提现金额现金额
    * @param parentOpenid
    * @return
    * @throws Exception
    */
   public BigDecimal countAlreadyMoney(String parentOpenid,String openid)throws Exception{
       return orderCouponMapper.countAlreadyMoney(parentOpenid,openid,3);
   }
   @Override
   public Integer queryCount(Map<String, Object> config)  throws Exception{
       return orderCouponMapper.queryCount(config);
   }

   @Override
   public void add(OrderCoupon orderCoupon) throws Exception {
       orderCouponMapper.insert(orderCoupon);
   }




   @Override
   public OrderCoupon queryOrderCouponByConsumerCoupon(String consumerCoupon)
           throws Exception {
       return orderCouponMapper.queryOrderCouponByConsumerCoupon(consumerCoupon);
   }
}
