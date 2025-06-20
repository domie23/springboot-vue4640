package com.dao;

import com.entity.ChuqinpaixingbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuqinpaixingbangVO;
import com.entity.view.ChuqinpaixingbangView;


/**
 * 出勤排行榜
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface ChuqinpaixingbangDao extends BaseMapper<ChuqinpaixingbangEntity> {
	
	List<ChuqinpaixingbangVO> selectListVO(@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);
	
	ChuqinpaixingbangVO selectVO(@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);
	
	List<ChuqinpaixingbangView> selectListView(@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);

	List<ChuqinpaixingbangView> selectListView(Pagination page,@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);
	
	ChuqinpaixingbangView selectView(@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);
	

}
