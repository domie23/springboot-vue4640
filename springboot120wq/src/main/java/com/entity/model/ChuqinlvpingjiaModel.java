package com.entity.model;

import com.entity.ChuqinlvpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 出勤率评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public class ChuqinlvpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 周数
	 */
	
	private String zhoushu;
		
	/**
	 * 评价类型
	 */
	
	private String pingjialeixing;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
	/**
	 * 宿管账号
	 */
	
	private String suguanzhanghao;
		
	/**
	 * 宿管姓名
	 */
	
	private String suguanxingming;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 宿舍楼号
	 */
	
	private String sushelouhao;
		
	/**
	 * 寝室
	 */
	
	private String qinshi;
				
	
	/**
	 * 设置：周数
	 */
	 
	public void setZhoushu(String zhoushu) {
		this.zhoushu = zhoushu;
	}
	
	/**
	 * 获取：周数
	 */
	public String getZhoushu() {
		return zhoushu;
	}
				
	
	/**
	 * 设置：评价类型
	 */
	 
	public void setPingjialeixing(String pingjialeixing) {
		this.pingjialeixing = pingjialeixing;
	}
	
	/**
	 * 获取：评价类型
	 */
	public String getPingjialeixing() {
		return pingjialeixing;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
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
				
	
	/**
	 * 设置：学生账号
	 */
	 
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
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
	 * 设置：寝室
	 */
	 
	public void setQinshi(String qinshi) {
		this.qinshi = qinshi;
	}
	
	/**
	 * 获取：寝室
	 */
	public String getQinshi() {
		return qinshi;
	}
			
}
