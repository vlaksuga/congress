package com.vlaksuga.congress.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ProvinceMapper {
    List<Map<String, Object>> getProvince();
    Map<String, Object> getProvinceById(Integer id);
}
