package com.jcoffee.database.mall.mapper;

import com.jcoffee.database.mall.entity.CommodityType;

import java.util.List;
import java.util.Map;


public interface CommodityTypeMapper {
   public List<CommodityType> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public Integer insert(CommodityType commodityType) throws Exception;
   public CommodityType query(Integer id) throws Exception;
   public Integer delete(String[] ids) throws Exception;
   public Integer update(CommodityType commodityType)throws Exception;
}
