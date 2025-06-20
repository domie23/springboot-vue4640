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


import com.dao.SusheloudongDao;
import com.entity.SusheloudongEntity;
import com.service.SusheloudongService;
import com.entity.vo.SusheloudongVO;
import com.entity.view.SusheloudongView;

@Service("susheloudongService")
public class SusheloudongServiceImpl extends ServiceImpl<SusheloudongDao, SusheloudongEntity> implements SusheloudongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheloudongEntity> page = this.selectPage(
                new Query<SusheloudongEntity>(params).getPage(),
                new EntityWrapper<SusheloudongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheloudongEntity> wrapper) {
		  Page<SusheloudongView> page =new Query<SusheloudongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheloudongVO> selectListVO(Wrapper<SusheloudongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheloudongVO selectVO(Wrapper<SusheloudongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheloudongView> selectListView(Wrapper<SusheloudongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheloudongView selectView(Wrapper<SusheloudongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
