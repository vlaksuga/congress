package com.vlaksuga.congress.controller;

import com.vlaksuga.congress.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/province")
public class ProvinceController {
    private ProvinceService provinceService;

    @Autowired
    ProvinceController(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Map<String, Object>> getProvince() {
        return provinceService.getProvince();
    }

    @GetMapping("")
    @ResponseBody
    public Map<String, Object> getProvinceById(@RequestParam("id") Integer id) {
        return provinceService.getProvinceById(id);
    }
}
