package com.jcoffee.business.order.controller;


import com.jcoffee.business.order.service.OrderService;
import com.jcoffee.commons.basics.model.Result;
import com.jcoffee.database.order.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {
   private Logger logger = LoggerFactory.getLogger(OrderController.class);
   @Autowired
   private OrderService orderService;

   /**
    * 查询
    * @param
    * @return
    */
   @GetMapping("/query")
   public Result query(HttpServletRequest request) {
      List<Order> orderList = null;
      try{
         logger.info("查询成功");
         logger.error("查询失败");

         orderList = orderService.queryList(null);
      }catch (Exception e){
         e.printStackTrace();
      }
      return Result.success(orderList);
   }

   /**
    * 查询
    * @param
    * @return
    */
   @GetMapping("/query/{id}")
   public Result query(@PathVariable("id") Integer id) {
      Order order = null;
      try{
         order = orderService.query(id);
      }catch (Exception e){
         e.printStackTrace();
      }
      return Result.success(order);
   }

}

