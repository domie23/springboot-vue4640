package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuqinlvpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuqinlvpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinlvpingjiaView;


/**
 * 出勤率评价
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public interface ChuqinlvpingjiaService extends IService<ChuqinlvpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuqinlvpingjiaVO> selectListVO(Wrapper<ChuqinlvpingjiaEntity> wrapper);
   	
   	ChuqinlvpingjiaVO selectVO(@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);
   	
   	List<ChuqinlvpingjiaView> selectListView(Wrapper<ChuqinlvpingjiaEntity> wrapper);
   	
   	ChuqinlvpingjiaView selectView(@Param("ew") Wrapper<ChuqinlvpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuqinlvpingjiaEntity> wrapper);
   	

}

