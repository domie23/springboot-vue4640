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


import com.dao.JianxuefenchufaDao;
import com.entity.JianxuefenchufaEntity;
import com.service.JianxuefenchufaService;
import com.entity.vo.JianxuefenchufaVO;
import com.entity.view.JianxuefenchufaView;

@Service("jianxuefenchufaService")
public class JianxuefenchufaServiceImpl extends ServiceImpl<JianxuefenchufaDao, JianxuefenchufaEntity> implements JianxuefenchufaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianxuefenchufaEntity> page = this.selectPage(
                new Query<JianxuefenchufaEntity>(params).getPage(),
                new EntityWrapper<JianxuefenchufaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianxuefenchufaEntity> wrapper) {
		  Page<JianxuefenchufaView> page =new Query<JianxuefenchufaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianxuefenchufaVO> selectListVO(Wrapper<JianxuefenchufaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianxuefenchufaVO selectVO(Wrapper<JianxuefenchufaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianxuefenchufaView> selectListView(Wrapper<JianxuefenchufaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianxuefenchufaView selectView(Wrapper<JianxuefenchufaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JianxuefenchufaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JianxuefenchufaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JianxuefenchufaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
