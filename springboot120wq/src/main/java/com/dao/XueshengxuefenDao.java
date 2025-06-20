package com.dao;

import com.entity.XueshengxuefenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxuefenVO;
import com.entity.view.XueshengxuefenView;


/**
 * 学生学分
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface XueshengxuefenDao extends BaseMapper<XueshengxuefenEntity> {
	
	List<XueshengxuefenVO> selectListVO(@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);
	
	XueshengxuefenVO selectVO(@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);
	
	List<XueshengxuefenView> selectListView(@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);

	List<XueshengxuefenView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);
	
	XueshengxuefenView selectView(@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);
	

}
