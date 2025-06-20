package com.dao;

import com.entity.JiaxuefenjiangliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxuefenjiangliVO;
import com.entity.view.JiaxuefenjiangliView;


/**
 * 加学分奖励
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface JiaxuefenjiangliDao extends BaseMapper<JiaxuefenjiangliEntity> {
	
	List<JiaxuefenjiangliVO> selectListVO(@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);
	
	JiaxuefenjiangliVO selectVO(@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);
	
	List<JiaxuefenjiangliView> selectListView(@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);

	List<JiaxuefenjiangliView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);
	
	JiaxuefenjiangliView selectView(@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);



}
