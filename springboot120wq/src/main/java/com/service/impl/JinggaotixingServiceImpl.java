package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JinggaotixingDao;
import com.entity.JinggaotixingEntity;
import com.service.JinggaotixingService;
import com.entity.vo.JinggaotixingVO;
import com.entity.view.JinggaotixingView;

@Service("jinggaotixingService")
public class JinggaotixingServiceImpl extends ServiceImpl<JinggaotixingDao, JinggaotixingEntity> implements JinggaotixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinggaotixingEntity> page = this.selectPage(
                new Query<JinggaotixingEntity>(params).getPage(),
                new EntityWrapper<JinggaotixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinggaotixingEntity> wrapper) {
		  Page<JinggaotixingView> page =new Query<JinggaotixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinggaotixingVO> selectListVO(Wrapper<JinggaotixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinggaotixingVO selectVO(Wrapper<JinggaotixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinggaotixingView> selectListView(Wrapper<JinggaotixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinggaotixingView selectView(Wrapper<JinggaotixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
