package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijiaobaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijiaobaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiaobaogaoView;


/**
 * 提交报告
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface TijiaobaogaoService extends IService<TijiaobaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijiaobaogaoVO> selectListVO(Wrapper<TijiaobaogaoEntity> wrapper);
   	
   	TijiaobaogaoVO selectVO(@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);
   	
   	List<TijiaobaogaoView> selectListView(Wrapper<TijiaobaogaoEntity> wrapper);
   	
   	TijiaobaogaoView selectView(@Param("ew") Wrapper<TijiaobaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijiaobaogaoEntity> wrapper);
   	

}

