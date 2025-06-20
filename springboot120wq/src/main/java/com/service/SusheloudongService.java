package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheloudongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheloudongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheloudongView;


/**
 * 宿舍楼栋
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface SusheloudongService extends IService<SusheloudongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheloudongVO> selectListVO(Wrapper<SusheloudongEntity> wrapper);
   	
   	SusheloudongVO selectVO(@Param("ew") Wrapper<SusheloudongEntity> wrapper);
   	
   	List<SusheloudongView> selectListView(Wrapper<SusheloudongEntity> wrapper);
   	
   	SusheloudongView selectView(@Param("ew") Wrapper<SusheloudongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheloudongEntity> wrapper);
   	

}

