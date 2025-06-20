package com.entity.vo;

import com.entity.XueshengkaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生考勤
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
public class XueshengkaoqinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 周数
	 */
	
	private String zhoushu;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 宿舍楼号
	 */
	
	private String sushelouhao;
		
	/**
	 * 寝室
	 */
	
	private String qinshi;
		
	/**
	 * 出勤次数
	 */
	
	private String chuqincishu;
		
	/**
	 * 缺勤次数
	 */
	
	private Integer queqincishu;
		
	/**
	 * 晚归次数
	 */
	
	private String wanguicishu;
		
	/**
	 * 考勤时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoqinshijian;
		
	/**
	 * 宿管账号
	 */
	
	private String suguanzhanghao;
		
	/**
	 * 宿管姓名
	 */
	
	private String suguanxingming;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
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
				
	
	/**
	 * 设置：出勤次数
	 */
	 
	public void setChuqincishu(String chuqincishu) {
		this.chuqincishu = chuqincishu;
	}
	
	/**
	 * 获取：出勤次数
	 */
	public String getChuqincishu() {
		return chuqincishu;
	}
				
	
	/**
	 * 设置：缺勤次数
	 */
	 
	public void setQueqincishu(Integer queqincishu) {
		this.queqincishu = queqincishu;
	}
	
	/**
	 * 获取：缺勤次数
	 */
	public Integer getQueqincishu() {
		return queqincishu;
	}
				
	
	/**
	 * 设置：晚归次数
	 */
	 
	public void setWanguicishu(String wanguicishu) {
		this.wanguicishu = wanguicishu;
	}
	
	/**
	 * 获取：晚归次数
	 */
	public String getWanguicishu() {
		return wanguicishu;
	}
				
	
	/**
	 * 设置：考勤时间
	 */
	 
	public void setKaoqinshijian(Date kaoqinshijian) {
		this.kaoqinshijian = kaoqinshijian;
	}
	
	/**
	 * 获取：考勤时间
	 */
	public Date getKaoqinshijian() {
		return kaoqinshijian;
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
