package com.jcoffee.database.mall.mapper;

import com.jcoffee.database.mall.entity.Banner;

import java.util.List;
import java.util.Map;


/**
 *
 */
public interface BannerMapper {
   public List<Banner> queryList(Map<String, Object> config) throws Exception;
   public Integer queryCount(Map<String, Object> config) throws Exception;
   public void insert(Banner banner) throws Exception;
   public Banner query(Integer id) throws Exception;
   public void delete(String[] ids) throws Exception;
   public void update(Banner banner)throws Exception;
}
