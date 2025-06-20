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


import com.dao.XiaochuqueqinbaogaoDao;
import com.entity.XiaochuqueqinbaogaoEntity;
import com.service.XiaochuqueqinbaogaoService;
import com.entity.vo.XiaochuqueqinbaogaoVO;
import com.entity.view.XiaochuqueqinbaogaoView;

@Service("xiaochuqueqinbaogaoService")
public class XiaochuqueqinbaogaoServiceImpl extends ServiceImpl<XiaochuqueqinbaogaoDao, XiaochuqueqinbaogaoEntity> implements XiaochuqueqinbaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaochuqueqinbaogaoEntity> page = this.selectPage(
                new Query<XiaochuqueqinbaogaoEntity>(params).getPage(),
                new EntityWrapper<XiaochuqueqinbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaochuqueqinbaogaoEntity> wrapper) {
		  Page<XiaochuqueqinbaogaoView> page =new Query<XiaochuqueqinbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaochuqueqinbaogaoVO> selectListVO(Wrapper<XiaochuqueqinbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaochuqueqinbaogaoVO selectVO(Wrapper<XiaochuqueqinbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaochuqueqinbaogaoView> selectListView(Wrapper<XiaochuqueqinbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaochuqueqinbaogaoView selectView(Wrapper<XiaochuqueqinbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
