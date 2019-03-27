package com.jcoffee.business.order.controller;


import com.jcoffee.business.order.service.OrderService;
import com.jcoffee.commons.basics.model.JsonResult;
import com.jcoffee.database.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

   @Autowired
   private OrderService orderService;

   /**
    * 查询
    * @param
    * @return
    */
   @GetMapping("/query")
   public JsonResult query() {
      List<Order> orderList = null;
      try{
         orderList = orderService.queryList(null);
      }catch (Exception e){
         e.printStackTrace();
      }
      return JsonResult.success(orderList);
   }

   /**
    * 查询
    * @param
    * @return
    */
   @GetMapping("/query/{id}")
   public JsonResult query(@PathVariable("id") Integer id) {
      Order order = null;
      try{
         order = orderService.query(id);
      }catch (Exception e){
         e.printStackTrace();
      }
      return JsonResult.success(order);
   }

}

