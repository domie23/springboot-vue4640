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


import com.dao.XueshengxuefenDao;
import com.entity.XueshengxuefenEntity;
import com.service.XueshengxuefenService;
import com.entity.vo.XueshengxuefenVO;
import com.entity.view.XueshengxuefenView;

@Service("xueshengxuefenService")
public class XueshengxuefenServiceImpl extends ServiceImpl<XueshengxuefenDao, XueshengxuefenEntity> implements XueshengxuefenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxuefenEntity> page = this.selectPage(
                new Query<XueshengxuefenEntity>(params).getPage(),
                new EntityWrapper<XueshengxuefenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxuefenEntity> wrapper) {
		  Page<XueshengxuefenView> page =new Query<XueshengxuefenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxuefenVO> selectListVO(Wrapper<XueshengxuefenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxuefenVO selectVO(Wrapper<XueshengxuefenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxuefenView> selectListView(Wrapper<XueshengxuefenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxuefenView selectView(Wrapper<XueshengxuefenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
