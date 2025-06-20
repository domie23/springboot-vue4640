package com.entity.model;

import com.entity.SusheloudongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宿舍楼栋
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public class SusheloudongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍楼号
	 */
	
	private String sushelouhao;
		
	/**
	 * 楼层数
	 */
	
	private String loucengshu;
		
	/**
	 * 宿舍数
	 */
	
	private String susheshu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 楼栋位置
	 */
	
	private String loudongweizhi;
		
	/**
	 * 楼栋详情
	 */
	
	private String loudongxiangqing;
		
	/**
	 * 宿管账号
	 */
	
	private String suguanzhanghao;
		
	/**
	 * 宿管姓名
	 */
	
	private String suguanxingming;
				
	
	/**
	 * 设置：宿舍楼号
	 */
	 
	public void setSushelouhao(String sushelouhao) {
		this.sushelouhao = sushelouhao;
	}
	
	/**
	 * 获取：宿舍楼号
	 */
	public String getSushelouhao() {
		return sushelouhao;
	}
				
	
	/**
	 * 设置：楼层数
	 */
	 
	public void setLoucengshu(String loucengshu) {
		this.loucengshu = loucengshu;
	}
	
	/**
	 * 获取：楼层数
	 */
	public String getLoucengshu() {
		return loucengshu;
	}
				
	
	/**
	 * 设置：宿舍数
	 */
	 
	public void setSusheshu(String susheshu) {
		this.susheshu = susheshu;
	}
	
	/**
	 * 获取：宿舍数
	 */
	public String getSusheshu() {
		return susheshu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：楼栋位置
	 */
	 
	public void setLoudongweizhi(String loudongweizhi) {
		this.loudongweizhi = loudongweizhi;
	}
	
	/**
	 * 获取：楼栋位置
	 */
	public String getLoudongweizhi() {
		return loudongweizhi;
	}
				
	
	/**
	 * 设置：楼栋详情
	 */
	 
	public void setLoudongxiangqing(String loudongxiangqing) {
		this.loudongxiangqing = loudongxiangqing;
	}
	
	/**
	 * 获取：楼栋详情
	 */
	public String getLoudongxiangqing() {
		return loudongxiangqing;
	}
				
	
	/**
	 * 设置：宿管账号
	 */
	 
	public void setSuguanzhanghao(String suguanzhanghao) {
		this.suguanzhanghao = suguanzhanghao;
	}
	
	/**
	 * 获取：宿管账号
	 */
	public String getSuguanzhanghao() {
		return suguanzhanghao;
	}
				
	
	/**
	 * 设置：宿管姓名
	 */
	 
	public void setSuguanxingming(String suguanxingming) {
		this.suguanxingming = suguanxingming;
	}
	
	/**
	 * 获取：宿管姓名
	 */
	public String getSuguanxingming() {
		return suguanxingming;
	}
			
}
