package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SusheloudongEntity;
import com.entity.view.SusheloudongView;

import com.service.SusheloudongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宿舍楼栋
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@RestController
@RequestMapping("/susheloudong")
public class SusheloudongController {
    @Autowired
    private SusheloudongService susheloudongService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SusheloudongEntity susheloudong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("suguan")) {
			susheloudong.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SusheloudongEntity> ew = new EntityWrapper<SusheloudongEntity>();

		PageUtils page = susheloudongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susheloudong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SusheloudongEntity susheloudong, 
		HttpServletRequest request){
        EntityWrapper<SusheloudongEntity> ew = new EntityWrapper<SusheloudongEntity>();

		PageUtils page = susheloudongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susheloudong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SusheloudongEntity susheloudong){
       	EntityWrapper<SusheloudongEntity> ew = new EntityWrapper<SusheloudongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( susheloudong, "susheloudong")); 
        return R.ok().put("data", susheloudongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SusheloudongEntity susheloudong){
        EntityWrapper< SusheloudongEntity> ew = new EntityWrapper< SusheloudongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( susheloudong, "susheloudong")); 
		SusheloudongView susheloudongView =  susheloudongService.selectView(ew);
		return R.ok("查询宿舍楼栋成功").put("data", susheloudongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SusheloudongEntity susheloudong = susheloudongService.selectById(id);
        return R.ok().put("data", susheloudong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SusheloudongEntity susheloudong = susheloudongService.selectById(id);
        return R.ok().put("data", susheloudong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SusheloudongEntity susheloudong, HttpServletRequest request){
    	susheloudong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susheloudong);
        susheloudongService.insert(susheloudong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SusheloudongEntity susheloudong, HttpServletRequest request){
    	susheloudong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susheloudong);
        susheloudongService.insert(susheloudong);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SusheloudongEntity susheloudong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(susheloudong);
        susheloudongService.updateById(susheloudong);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        susheloudongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SusheloudongEntity> wrapper = new EntityWrapper<SusheloudongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("suguan")) {
			wrapper.eq("suguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = susheloudongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
