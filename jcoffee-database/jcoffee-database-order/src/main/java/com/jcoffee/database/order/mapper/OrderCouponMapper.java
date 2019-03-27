package com.jcoffee.database.order.mapper;

import com.jcoffee.database.order.entity.OrderCoupon;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public interface OrderCouponMapper {
   public List<OrderCoupon> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public void insert(OrderCoupon orderCoupon) throws Exception;
   public OrderCoupon query(Integer id) throws Exception;
   /**
    * 通过消费劵编号获取消费劵信息
    * @param consumerCoupon
    * @return
    * @throws Exception
    */
   public OrderCoupon queryOrderCouponByConsumerCoupon(@Param("consumerCoupon") String consumerCoupon) throws Exception;
   public Integer update(OrderCoupon orderCoupon)throws Exception;

   /**
    * 修改提现状态
    * @param parentOpenid
    * @param take 修改值
    * @return
    * @throws Exception
    */
   public Integer updateTakeState(@Param("parentOpenid") String parentOpenid,
                                  @Param("take") Integer take, @Param("whereTake") Integer whereTake)throws Exception;

   /**
    * 查询可提现金额
    * @param parentOpenid 达人openid
    * @param openid 本人openid
    * @param take 1.查看当前收益  2.大于1的总收益
    * @return
    * @throws Exception
    */
   public BigDecimal countAlreadyMoney(@Param("parentOpenid") String parentOpenid
           , @Param("openid") String openid, @Param("take") Integer take)throws Exception;

   /**
    * 批量插入消费劵码信息
    *@param list
    *@return
    *@throws Exception
    */
   public Integer batchAdd(List<OrderCoupon> list)throws Exception;
}
