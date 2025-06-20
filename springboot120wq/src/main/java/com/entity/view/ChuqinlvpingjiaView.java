package com.entity.view;

import com.entity.ChuqinlvpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出勤率评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@TableName("chuqinlvpingjia")
public class ChuqinlvpingjiaView  extends ChuqinlvpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuqinlvpingjiaView(){
	}
 
 	public ChuqinlvpingjiaView(ChuqinlvpingjiaEntity chuqinlvpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, chuqinlvpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
