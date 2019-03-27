package com.jcoffee.business.order.service;

import com.jcoffee.database.mall.mapper.CommodityMapper;
import com.jcoffee.database.order.entity.Order;
import com.jcoffee.database.order.mapper.OrderCouponMapper;
import com.jcoffee.database.order.mapper.OrderMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Transactional(rollbackFor = Exception.class)
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    private org.slf4j.Logger logger=LoggerFactory.getLogger(OrderServiceImpl.class);

   @Autowired
   private OrderMapper mapper;
   @Autowired
   private OrderCouponMapper orderCouponMapper;
   @Autowired
   private CommodityMapper commodityMapper;



   @Override
   public Order query(Integer id)  throws Exception{
       return mapper.query(id);
   }

   @Override
   public Order queryByOrderNumber(String orderNumber) throws Exception{
       return mapper.queryByOrderNumber(orderNumber);
   }

   @Override
   public List<Order> queryList(Map<String, Object> config)  throws Exception{
       return mapper.queryList(config);
   }

   @Override
   public Integer queryCount(Map<String, Object> config)  throws Exception{
       return mapper.queryCount(config);
   }

   /**
    * 修改交易状态
    * @param order
    * @throws Exception
    */
   public String updatePayState(Order order)throws Exception{
//       //修改商品已销数量
//       Commodity commodity = commodityMapper.query(order.getCommodityId());
//       commodity.setAlreadyPayNum(order.getPurchaseNum());
//       int cm = commodityMapper.update(commodity);
//       //判断是否修改成功并发下可能修改失败
//       if(cm != 1){
//           throw new ConcurrentException();
//       }
//       int size = order.getPurchaseNum();
//       order.setState(2);
//       order.setPaymentTime(new Date());
//       Integer rt = mapper.update(order);
//       //判断是否修改成功并发下可能修改失败
//       if(rt != 1){
//           throw new ConcurrentException();
//       }
//       String coupon ="";
//       //佣金比例
//       String commissionstr = order.getTalent() == 1 ?
//               commissionConfig.talent
//               :commissionConfig.ordinary;
//       //奖金比例
//       String bonusstr = commissionConfig.bonus;
//       //利润
//       BigDecimal bd = order.getPrice().subtract(order.getCostPrice());
//       //佣金
//       BigDecimal commission = bd.multiply(
//               new BigDecimal(commissionstr))
//               .setScale(0,BigDecimal.ROUND_DOWN);
//       //奖金
//       BigDecimal bonus = bd.multiply(
//               new BigDecimal(bonusstr))
//               .setScale(0,BigDecimal.ROUND_DOWN);
//       //上级预估收入
//       BigDecimal bdl = new BigDecimal(0);
//       //购买多张劵做批量操作
//       if(size > 1){
//           List<OrderCoupon> list = Collections.synchronizedList(new ArrayList<OrderCoupon>());
//           StringBuilder str = new StringBuilder();
//           for(int i = 0; i < size;i++){
//               String os = OrderCodeFactory.getQrCode(order.getId());
//               OrderCoupon orderCoupon = new OrderCoupon();
//               orderCoupon.setCommodityId(order.getCommodityId());
//               orderCoupon.setCommodityName(order.getCommodityName());
//               orderCoupon.setConsumerCoupon(os);
//               orderCoupon.setOrderId(order.getId());
//               orderCoupon.setOrderNumber(order.getOrderNumber());
//               orderCoupon.setOpenid(order.getOpenid());
//               orderCoupon.setPrice(order.getPrice());
//               orderCoupon.setParentOpenid(order.getParentOpenid());
//               orderCoupon.setShopsId(order.getShopsId());
//               orderCoupon.setCancelEndTime(order.getCancelEndTime());
//               orderCoupon.setListImg(order.getListImg());
//               orderCoupon.setRemark(order.getRemark());
//               orderCoupon.setCommission(commission);
//               orderCoupon.setBonus(bonus);
//               orderCoupon.setNickName(order.getNickName());
//               orderCoupon.setMobile(order.getMobile());
//               list.add(orderCoupon);
//               if(i < size){
//                   str.append(os);
//                   str.append(",");
//               }else{
//                   str.append(os);
//               }
//               bdl = bdl.add(commission).add(bonus);
//           }
//           coupon = str.toString();
//           orderCouponMapper.batchAdd(list);
//       }else{
//           coupon = OrderCodeFactory.getQrCode(order.getId());
//           OrderCoupon orderCoupon = new OrderCoupon();
//           orderCoupon.setCommodityId(order.getCommodityId());
//           orderCoupon.setCommodityName(order.getCommodityName());
//           orderCoupon.setConsumerCoupon(coupon);
//           orderCoupon.setOrderId(order.getId());
//           orderCoupon.setOrderNumber(order.getOrderNumber());
//           orderCoupon.setOpenid(order.getOpenid());
//           orderCoupon.setPrice(order.getPrice());
//           orderCoupon.setParentOpenid(order.getParentOpenid());
//           orderCoupon.setShopsId(order.getShopsId());
//           orderCoupon.setCancelEndTime(order.getCancelEndTime());
//           orderCoupon.setListImg(order.getListImg());
//           orderCoupon.setRemark(order.getRemark());
//           orderCoupon.setCommission(commission);
//           orderCoupon.setBonus(bonus);
//           orderCoupon.setNickName(order.getNickName());
//           orderCoupon.setMobile(order.getMobile());
//           orderCouponMapper.insert(orderCoupon);
//           bdl = bdl.add(commission).add(bonus);
//       }
//       if(order.getParentOpenid() != null && !order.getParentOpenid().equals("")){
//           AppUser appUser = appUserMapper.query(order.getParentOpenid());
//           if(appUser != null){
//               //增加预估金额
//               appUser.setYesMoney(appUser.getYesMoney().add(bdl));
//               appUserMapper.update(appUser);
//           }
//       }
//
//       this.updateWeixinPayBill(order.getOrderNumber());
       return null;
   }

   @Override
   public Map<String, String> add(Order order) throws Exception {
//       System.out.println("order=========="+order.toString());
//       //查询商品信息
//       Commodity commodity = commodityMapper.query(order.getCommodityId());
//       if(commodity.getAlreadyNum().intValue() >= commodity.getRestrictionsNum().intValue()){
//           throw new Exception("商品已售完");
//       }
//       if(order.getPurchaseNum().intValue() > commodity.getLimitNum().intValue()){
//           throw new Exception("超过限购数量");
//       }
//       Map<String, Object> param = new ConcurrentHashMap<String, Object>();
//       param.put("openid", order.getOpenid());
//       param.put("state", 0);
//       param.put("commodityId", order.getCommodityId());
//       Integer mynum = orderCouponMapper.queryCount(param);
//       //判断是否有未使用的消费劵
//       if((order.getPurchaseNum().intValue()+mynum.intValue()) > commodity.getLimitNum().intValue()){
//           throw new Exception("超过限购数量,请先使用后再购买。");
//       }
//       String orderNumber = OrderCodeFactory.getOrderCode(order.getUserId());
//       order.setCommodityName(commodity.getName());
//       order.setCostPrice(commodity.getCostPrice());
//       order.setListImg(commodity.getListImg());
//       order.setPrice(commodity.getPrice());
//       order.setShopsId(commodity.getShopsId());
//       //计算订单总价
//       order.setTotalPrice(commodity.getPrice().multiply(new BigDecimal(order.getPurchaseNum())));
//       order.setRemark(commodity.getRemark());
//       //生成订单号
//       order.setOrderNumber(orderNumber);
//       order.setCancelEndTime(commodity.getCancelEndTime());
//       //是否达人自购
////		if(order.getTalent() == 1){
////			order.setActualPrice(order.getTotalPrice().multiply(
////					new BigDecimal(1).subtract(
////							new BigDecimal(OverallVar.getSystemProperty("branch.ipay")))
////					).setScale(1,BigDecimal.ROUND_DOWN));
////		}else{
//           order.setActualPrice(order.getTotalPrice());
////		}
//
//       mapper.insert(order);
//
//       Map<String, String> parameterMap = Collections.synchronizedMap(new LinkedHashMap<String, String>());
//       //获取订单号
//       parameterMap.put("appid",weiXinPayConfig.appid); //微信分配的公众账号 ID
//       parameterMap.put("mch_id",weiXinPayConfig.mchId);//微信支付分配的商户号
//       parameterMap.put("nonce_str",RandomStrg.createNoncestr());//随机字符串，不长于 32 位
//       parameterMap.put("body", "订单付款");//商品描述,商品名称如：番茄 2斤
//       parameterMap.put("out_trade_no", orderNumber);//商户系统内部的订单号,32个字符内、可包含字母,确保在商户系统唯一
//       //订单总金额，单位为分，不能带小数点,微信单位为分
//       parameterMap.put("total_fee", order.getActualPrice().multiply(new BigDecimal(100)).toString().split("\\.")[0]);
//       parameterMap.put("spbill_create_ip", order.getIp());//订单生成的机器 IP
//       //服务器异步通知路径
//       parameterMap.put("notify_url",weiXinPayConfig.app_notify_url);
//       parameterMap.put("trade_type", "JSAPI");
//       parameterMap.put("openid", order.getOpenid());
//       Map<String, String> sortMap = weiXinPayUtil.sortMap(parameterMap);
//       sortMap.put("sign", weiXinPayUtil.getBizSign(parameterMap,false));
//       Map<String, String> returnMsg = weiXinPayUtil.weiXinPayPrepaId(sortMap,weiXinPayConfig.url);
//       //生成预支付是否成功
//       Map<String, String> map = new ConcurrentHashMap<String, String>();
//       if(!"SUCCESS".equals(returnMsg.get("return_code")) || !"SUCCESS".equals(returnMsg.get("result_code"))){
//           throw new ConcurrentException("订单交易失败信息："+parameterMap.toString()+"/n微信返回错误信息："+returnMsg.toString());
//       }else {
//           WeixinPayBill weixinPayBill = new WeixinPayBill();
//           weixinPayBill.setRenturnParam(returnMsg.toString());
//           weixinPayBill.setPaymentNumber(orderNumber);
//           weixinPayBill.setOrderNumber(orderNumber);
//           weixinPayBill.setSendParam(sortMap.toString());
//           weixinPayBill.setPrice(order.getActualPrice());
//           weixinPayBill.setPaymentStatus(0);
//           weixinPayBill.setOpenid(order.getOpenid());
//           returnMsg.put("paymentNumber", orderNumber);
//           //处理微信支付结果
//           map = weiXinPayUtil.gongZhongResultAssemble(returnMsg);
//           mapper.insertWeixinPayBill(weixinPayBill);
//       }
       return null;
   }


   @Override
   public void update(Order order) throws Exception {
       mapper.update(order);
   }



    /**
     * 修改订单状态为已完成
     *
     * @param orderId订单id
     * @return
     * @throws Exception
     */
    @Async
    public  void updateOrder(Integer orderId){
        Order order = new Order();
        try {
            Order o = mapper.query(orderId);

            //修改状态为完成
            order.setState(4);
            order.setId(o.getId());
            order.setVersion(o.getVersion());
            mapper.update(order);
        } catch (Exception e) {
            //如果异常10毫秒后再试
            try {
                Thread.sleep(10);
                Order o = mapper.query(orderId);
                //修改状态为完成
                order.setState(4);
                order.setId(o.getId());
                order.setVersion(o.getVersion());
                mapper.update(order);
            } catch (Exception e1) {
                e1.printStackTrace();
                logger.error("asyn-order:"+e1.getMessage(),e1);
            }
        }
    }


}
