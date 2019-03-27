package com.jcoffee.database.mall.mapper;

import com.jcoffee.database.mall.entity.Commodity;

import java.util.List;
import java.util.Map;


public interface CommodityMapper {
   public List<Commodity> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public Integer insert(Commodity commodity) throws Exception;
   public Commodity query(Integer id) throws Exception;
   public Integer delete(String[] ids) throws Exception;
   public Integer update(Commodity commodity)throws Exception;
}
