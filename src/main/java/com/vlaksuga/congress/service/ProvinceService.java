package com.vlaksuga.congress.service;

import java.util.List;
import java.util.Map;


public interface ProvinceService {
    List<Map<String, Object>> getProvince();
    Map<String, Object> getProvinceById(Integer id);
}
