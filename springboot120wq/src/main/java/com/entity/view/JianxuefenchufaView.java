package com.entity.view;

import com.entity.JianxuefenchufaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 减学分处罚
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@TableName("jianxuefenchufa")
public class JianxuefenchufaView  extends JianxuefenchufaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianxuefenchufaView(){
	}
 
 	public JianxuefenchufaView(JianxuefenchufaEntity jianxuefenchufaEntity){
 	try {
			BeanUtils.copyProperties(this, jianxuefenchufaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
