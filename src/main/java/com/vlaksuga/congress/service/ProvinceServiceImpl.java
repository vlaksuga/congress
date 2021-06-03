package com.vlaksuga.congress.service;

import com.vlaksuga.congress.mapper.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProvinceServiceImpl implements ProvinceService{
    private ProvinceMapper provinceMapper;

    @Autowired
    ProvinceServiceImpl(ProvinceMapper provinceMapper) {
        this.provinceMapper = provinceMapper;
    }

    @Override
    public List<Map<String, Object>> getProvince() {
        return provinceMapper.getProvince();
    }
}
