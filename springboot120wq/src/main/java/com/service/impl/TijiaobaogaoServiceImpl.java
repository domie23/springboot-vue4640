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


import com.dao.TijiaobaogaoDao;
import com.entity.TijiaobaogaoEntity;
import com.service.TijiaobaogaoService;
import com.entity.vo.TijiaobaogaoVO;
import com.entity.view.TijiaobaogaoView;

@Service("tijiaobaogaoService")
public class TijiaobaogaoServiceImpl extends ServiceImpl<TijiaobaogaoDao, TijiaobaogaoEntity> implements TijiaobaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijiaobaogaoEntity> page = this.selectPage(
                new Query<TijiaobaogaoEntity>(params).getPage(),
                new EntityWrapper<TijiaobaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijiaobaogaoEntity> wrapper) {
		  Page<TijiaobaogaoView> page =new Query<TijiaobaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijiaobaogaoVO> selectListVO(Wrapper<TijiaobaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijiaobaogaoVO selectVO(Wrapper<TijiaobaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijiaobaogaoView> selectListView(Wrapper<TijiaobaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijiaobaogaoView selectView(Wrapper<TijiaobaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
