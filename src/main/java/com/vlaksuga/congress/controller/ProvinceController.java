package com.vlaksuga.congress.controller;

import com.vlaksuga.congress.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
public class ProvinceController {
    private ProvinceService provinceService;

    @Autowired
    ProvinceController(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @GetMapping("/province")
    @ResponseBody
    public List<Map<String, Object>> getProvince() {
        return provinceService.getProvince();
    }
}
