package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuqinpaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuqinpaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinpaixingbangView;


/**
 * 出勤排行榜
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface ChuqinpaixingbangService extends IService<ChuqinpaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuqinpaixingbangVO> selectListVO(Wrapper<ChuqinpaixingbangEntity> wrapper);
   	
   	ChuqinpaixingbangVO selectVO(@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);
   	
   	List<ChuqinpaixingbangView> selectListView(Wrapper<ChuqinpaixingbangEntity> wrapper);
   	
   	ChuqinpaixingbangView selectView(@Param("ew") Wrapper<ChuqinpaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuqinpaixingbangEntity> wrapper);
   	

}

