package com.dao;

import com.entity.ChuqinlvpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuqinlvpingjiaVO;
import com.entity.view.ChuqinlvpingjiaView;


/**
 * 出勤率评价
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface ChuqinlvpingjiaDao extends BaseMapper<ChuqinlvpingjiaEntity> {
	
	List<ChuqinlvpingjiaVO> selectListVO(@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);
	
	ChuqinlvpingjiaVO selectVO(@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);
	
	List<ChuqinlvpingjiaView> selectListView(@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);

	List<ChuqinlvpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);
	
	ChuqinlvpingjiaView selectView(@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);
	

}
