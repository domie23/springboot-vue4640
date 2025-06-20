package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaxuefenjiangliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaxuefenjiangliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaxuefenjiangliView;


/**
 * 加学分奖励
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface JiaxuefenjiangliService extends IService<JiaxuefenjiangliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaxuefenjiangliVO> selectListVO(Wrapper<JiaxuefenjiangliEntity> wrapper);
   	
   	JiaxuefenjiangliVO selectVO(@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);
   	
   	List<JiaxuefenjiangliView> selectListView(Wrapper<JiaxuefenjiangliEntity> wrapper);
   	
   	JiaxuefenjiangliView selectView(@Param("ew") Wrapper<JiaxuefenjiangliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaxuefenjiangliEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiaxuefenjiangliEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiaxuefenjiangliEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiaxuefenjiangliEntity> wrapper);



}

