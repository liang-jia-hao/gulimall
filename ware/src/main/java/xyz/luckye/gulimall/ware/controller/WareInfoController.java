package xyz.luckye.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.luckye.gulimall.ware.entity.WareInfoEntity;
import xyz.luckye.gulimall.ware.service.WareInfoService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.common.utils.R;

@RestController
@RequestMapping("ware/wareinfo")
public class WareInfoController {
    @Autowired
    private WareInfoService wareInfoService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wareInfoService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        WareInfoEntity wareInfo = wareInfoService.getById(id);
        return R.ok().put("wareInfo", wareInfo);
    }

    @RequestMapping("/save")
    public R save(@RequestBody WareInfoEntity wareInfo) {
        wareInfoService.save(wareInfo);
        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody WareInfoEntity wareInfo) {
        wareInfoService.updateById(wareInfo);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        wareInfoService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
