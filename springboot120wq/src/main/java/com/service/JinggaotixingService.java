package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinggaotixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinggaotixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinggaotixingView;


/**
 * 警告提醒
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface JinggaotixingService extends IService<JinggaotixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinggaotixingVO> selectListVO(Wrapper<JinggaotixingEntity> wrapper);
   	
   	JinggaotixingVO selectVO(@Param("ew") Wrapper<JinggaotixingEntity> wrapper);
   	
   	List<JinggaotixingView> selectListView(Wrapper<JinggaotixingEntity> wrapper);
   	
   	JinggaotixingView selectView(@Param("ew") Wrapper<JinggaotixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinggaotixingEntity> wrapper);
   	

}

