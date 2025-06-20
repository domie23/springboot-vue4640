package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxuefenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxuefenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxuefenView;


/**
 * 学生学分
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface XueshengxuefenService extends IService<XueshengxuefenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxuefenVO> selectListVO(Wrapper<XueshengxuefenEntity> wrapper);
   	
   	XueshengxuefenVO selectVO(@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);
   	
   	List<XueshengxuefenView> selectListView(Wrapper<XueshengxuefenEntity> wrapper);
   	
   	XueshengxuefenView selectView(@Param("ew") Wrapper<XueshengxuefenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxuefenEntity> wrapper);
   	

}

