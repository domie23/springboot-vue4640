package com.dao;

import com.entity.JinggaotixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinggaotixingVO;
import com.entity.view.JinggaotixingView;


/**
 * 警告提醒
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface JinggaotixingDao extends BaseMapper<JinggaotixingEntity> {
	
	List<JinggaotixingVO> selectListVO(@Param("ew") Wrapper<JinggaotixingEntity> wrapper);
	
	JinggaotixingVO selectVO(@Param("ew") Wrapper<JinggaotixingEntity> wrapper);
	
	List<JinggaotixingView> selectListView(@Param("ew") Wrapper<JinggaotixingEntity> wrapper);

	List<JinggaotixingView> selectListView(Pagination page,@Param("ew") Wrapper<JinggaotixingEntity> wrapper);
	
	JinggaotixingView selectView(@Param("ew") Wrapper<JinggaotixingEntity> wrapper);
	

}
