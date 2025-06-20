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

import com.entity.XiaochuqueqinbaogaoEntity;
import com.entity.view.XiaochuqueqinbaogaoView;

import com.service.XiaochuqueqinbaogaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 消除缺勤报告
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@RestController
@RequestMapping("/xiaochuqueqinbaogao")
public class XiaochuqueqinbaogaoController {
    @Autowired
    private XiaochuqueqinbaogaoService xiaochuqueqinbaogaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xiaochuqueqinbaogao.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			xiaochuqueqinbaogao.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaochuqueqinbaogaoEntity> ew = new EntityWrapper<XiaochuqueqinbaogaoEntity>();

		PageUtils page = xiaochuqueqinbaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaochuqueqinbaogao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao, 
		HttpServletRequest request){
        EntityWrapper<XiaochuqueqinbaogaoEntity> ew = new EntityWrapper<XiaochuqueqinbaogaoEntity>();

		PageUtils page = xiaochuqueqinbaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaochuqueqinbaogao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao){
       	EntityWrapper<XiaochuqueqinbaogaoEntity> ew = new EntityWrapper<XiaochuqueqinbaogaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaochuqueqinbaogao, "xiaochuqueqinbaogao")); 
        return R.ok().put("data", xiaochuqueqinbaogaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao){
        EntityWrapper< XiaochuqueqinbaogaoEntity> ew = new EntityWrapper< XiaochuqueqinbaogaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaochuqueqinbaogao, "xiaochuqueqinbaogao")); 
		XiaochuqueqinbaogaoView xiaochuqueqinbaogaoView =  xiaochuqueqinbaogaoService.selectView(ew);
		return R.ok("查询消除缺勤报告成功").put("data", xiaochuqueqinbaogaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao = xiaochuqueqinbaogaoService.selectById(id);
        return R.ok().put("data", xiaochuqueqinbaogao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao = xiaochuqueqinbaogaoService.selectById(id);
        return R.ok().put("data", xiaochuqueqinbaogao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao, HttpServletRequest request){
    	xiaochuqueqinbaogao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaochuqueqinbaogao);
        xiaochuqueqinbaogaoService.insert(xiaochuqueqinbaogao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao, HttpServletRequest request){
    	xiaochuqueqinbaogao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaochuqueqinbaogao);
        xiaochuqueqinbaogaoService.insert(xiaochuqueqinbaogao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiaochuqueqinbaogaoEntity xiaochuqueqinbaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaochuqueqinbaogao);
        xiaochuqueqinbaogaoService.updateById(xiaochuqueqinbaogao);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaochuqueqinbaogaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XiaochuqueqinbaogaoEntity> wrapper = new EntityWrapper<XiaochuqueqinbaogaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			wrapper.eq("suguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xiaochuqueqinbaogaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
