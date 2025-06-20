package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaochuqueqinbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaochuqueqinbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaochuqueqinbaogaoView;


/**
 * 消除缺勤报告
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface XiaochuqueqinbaogaoService extends IService<XiaochuqueqinbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaochuqueqinbaogaoVO> selectListVO(Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
   	
   	XiaochuqueqinbaogaoVO selectVO(@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
   	
   	List<XiaochuqueqinbaogaoView> selectListView(Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
   	
   	XiaochuqueqinbaogaoView selectView(@Param("ew") Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaochuqueqinbaogaoEntity> wrapper);
   	

}

