package com.dao;

import com.entity.XiaochuqueqinbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaochuqueqinbaogaoVO;
import com.entity.view.XiaochuqueqinbaogaoView;


/**
 * 消除缺勤报告
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface XiaochuqueqinbaogaoDao extends BaseMapper<XiaochuqueqinbaogaoEntity> {
	
	List<XiaochuqueqinbaogaoVO> selectListVO(@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
	
	XiaochuqueqinbaogaoVO selectVO(@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
	
	List<XiaochuqueqinbaogaoView> selectListView(@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);

	List<XiaochuqueqinbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
	
	XiaochuqueqinbaogaoView selectView(@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
	

}
