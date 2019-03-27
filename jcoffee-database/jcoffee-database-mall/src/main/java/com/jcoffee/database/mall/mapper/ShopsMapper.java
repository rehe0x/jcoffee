package com.jcoffee.database.mall.mapper;

import com.jcoffee.database.mall.entity.Shops;

import java.util.List;
import java.util.Map;



public interface ShopsMapper {
   public List<Shops> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public Integer insert(Shops shops) throws Exception;
   public Shops query(Integer id) throws Exception;
   public Integer delete(String[] ids) throws Exception;
   public Integer update(Shops shops)throws Exception;
   public Shops login(String userName) throws Exception;
}
