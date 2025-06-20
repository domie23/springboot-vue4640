package com.dao;

import com.entity.TijiaobaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijiaobaogaoVO;
import com.entity.view.TijiaobaogaoView;


/**
 * 提交报告
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface TijiaobaogaoDao extends BaseMapper<TijiaobaogaoEntity> {
	
	List<TijiaobaogaoVO> selectListVO(@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);
	
	TijiaobaogaoVO selectVO(@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);
	
	List<TijiaobaogaoView> selectListView(@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);

	List<TijiaobaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);
	
	TijiaobaogaoView selectView(@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);
	

}
