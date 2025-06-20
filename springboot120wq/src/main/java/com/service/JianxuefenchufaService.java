package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianxuefenchufaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianxuefenchufaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianxuefenchufaView;


/**
 * 减学分处罚
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface JianxuefenchufaService extends IService<JianxuefenchufaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianxuefenchufaVO> selectListVO(Wrapper<JianxuefenchufaEntity> wrapper);
   	
   	JianxuefenchufaVO selectVO(@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);
   	
   	List<JianxuefenchufaView> selectListView(Wrapper<JianxuefenchufaEntity> wrapper);
   	
   	JianxuefenchufaView selectView(@Param("ew") Wrapper<JianxuefenchufaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianxuefenchufaEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JianxuefenchufaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JianxuefenchufaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JianxuefenchufaEntity> wrapper);



}

