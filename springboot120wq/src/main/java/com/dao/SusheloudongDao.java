package com.dao;

import com.entity.SusheloudongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheloudongVO;
import com.entity.view.SusheloudongView;


/**
 * 宿舍楼栋
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface SusheloudongDao extends BaseMapper<SusheloudongEntity> {
	
	List<SusheloudongVO> selectListVO(@Param("ew") Wrapper<SusheloudongEntity> wrapper);
	
	SusheloudongVO selectVO(@Param("ew") Wrapper<SusheloudongEntity> wrapper);
	
	List<SusheloudongView> selectListView(@Param("ew") Wrapper<SusheloudongEntity> wrapper);

	List<SusheloudongView> selectListView(Pagination page,@Param("ew") Wrapper<SusheloudongEntity> wrapper);
	
	SusheloudongView selectView(@Param("ew") Wrapper<SusheloudongEntity> wrapper);
	

}
