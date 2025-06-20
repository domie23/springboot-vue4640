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


import com.dao.JiaxuefenjiangliDao;
import com.entity.JiaxuefenjiangliEntity;
import com.service.JiaxuefenjiangliService;
import com.entity.vo.JiaxuefenjiangliVO;
import com.entity.view.JiaxuefenjiangliView;

@Service("jiaxuefenjiangliService")
public class JiaxuefenjiangliServiceImpl extends ServiceImpl<JiaxuefenjiangliDao, JiaxuefenjiangliEntity> implements JiaxuefenjiangliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxuefenjiangliEntity> page = this.selectPage(
                new Query<JiaxuefenjiangliEntity>(params).getPage(),
                new EntityWrapper<JiaxuefenjiangliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxuefenjiangliEntity> wrapper) {
		  Page<JiaxuefenjiangliView> page =new Query<JiaxuefenjiangliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxuefenjiangliVO> selectListVO(Wrapper<JiaxuefenjiangliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxuefenjiangliVO selectVO(Wrapper<JiaxuefenjiangliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxuefenjiangliView> selectListView(Wrapper<JiaxuefenjiangliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxuefenjiangliView selectView(Wrapper<JiaxuefenjiangliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiaxuefenjiangliEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiaxuefenjiangliEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiaxuefenjiangliEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
