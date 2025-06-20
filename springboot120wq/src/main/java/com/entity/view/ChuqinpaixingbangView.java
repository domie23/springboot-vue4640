package com.entity.view;

import com.entity.ChuqinpaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出勤排行榜
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@TableName("chuqinpaixingbang")
public class ChuqinpaixingbangView  extends ChuqinpaixingbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuqinpaixingbangView(){
	}
 
 	public ChuqinpaixingbangView(ChuqinpaixingbangEntity chuqinpaixingbangEntity){
 	try {
			BeanUtils.copyProperties(this, chuqinpaixingbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
