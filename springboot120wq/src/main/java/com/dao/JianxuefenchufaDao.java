package com.dao;

import com.entity.JianxuefenchufaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianxuefenchufaVO;
import com.entity.view.JianxuefenchufaView;


/**
 * 减学分处罚
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface JianxuefenchufaDao extends BaseMapper<JianxuefenchufaEntity> {
	
	List<JianxuefenchufaVO> selectListVO(@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);
	
	JianxuefenchufaVO selectVO(@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);
	
	List<JianxuefenchufaView> selectListView(@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);

	List<JianxuefenchufaView> selectListView(Pagination page,@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);
	
	JianxuefenchufaView selectView(@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);



}
