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


import com.dao.ChuqinpaixingbangDao;
import com.entity.ChuqinpaixingbangEntity;
import com.service.ChuqinpaixingbangService;
import com.entity.vo.ChuqinpaixingbangVO;
import com.entity.view.ChuqinpaixingbangView;

@Service("chuqinpaixingbangService")
public class ChuqinpaixingbangServiceImpl extends ServiceImpl<ChuqinpaixingbangDao, ChuqinpaixingbangEntity> implements ChuqinpaixingbangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuqinpaixingbangEntity> page = this.selectPage(
                new Query<ChuqinpaixingbangEntity>(params).getPage(),
                new EntityWrapper<ChuqinpaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuqinpaixingbangEntity> wrapper) {
		  Page<ChuqinpaixingbangView> page =new Query<ChuqinpaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuqinpaixingbangVO> selectListVO(Wrapper<ChuqinpaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuqinpaixingbangVO selectVO(Wrapper<ChuqinpaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuqinpaixingbangView> selectListView(Wrapper<ChuqinpaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuqinpaixingbangView selectView(Wrapper<ChuqinpaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
