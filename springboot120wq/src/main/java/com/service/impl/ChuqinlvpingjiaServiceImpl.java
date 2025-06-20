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


import com.dao.ChuqinlvpingjiaDao;
import com.entity.ChuqinlvpingjiaEntity;
import com.service.ChuqinlvpingjiaService;
import com.entity.vo.ChuqinlvpingjiaVO;
import com.entity.view.ChuqinlvpingjiaView;

@Service("chuqinlvpingjiaService")
public class ChuqinlvpingjiaServiceImpl extends ServiceImpl<ChuqinlvpingjiaDao, ChuqinlvpingjiaEntity> implements ChuqinlvpingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuqinlvpingjiaEntity> page = this.selectPage(
                new Query<ChuqinlvpingjiaEntity>(params).getPage(),
                new EntityWrapper<ChuqinlvpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuqinlvpingjiaEntity> wrapper) {
		  Page<ChuqinlvpingjiaView> page =new Query<ChuqinlvpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuqinlvpingjiaVO> selectListVO(Wrapper<ChuqinlvpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuqinlvpingjiaVO selectVO(Wrapper<ChuqinlvpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuqinlvpingjiaView> selectListView(Wrapper<ChuqinlvpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuqinlvpingjiaView selectView(Wrapper<ChuqinlvpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
