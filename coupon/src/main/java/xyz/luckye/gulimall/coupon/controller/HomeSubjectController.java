package xyz.luckye.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.luckye.gulimall.coupon.entity.HomeSubjectEntity;
import xyz.luckye.gulimall.coupon.service.HomeSubjectService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.common.utils.R;

@RestController
@RequestMapping("coupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = homeSubjectService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        HomeSubjectEntity homeSubject = homeSubjectService.getById(id);
        return R.ok().put("homeSubject", homeSubject);
    }

    @RequestMapping("/save")
    public R save(@RequestBody HomeSubjectEntity homeSubject) {
        homeSubjectService.save(homeSubject);
        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody HomeSubjectEntity homeSubject) {
        homeSubjectService.updateById(homeSubject);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        homeSubjectService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
