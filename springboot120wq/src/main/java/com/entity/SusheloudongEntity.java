package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宿舍楼栋
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:01
 */
@TableName("susheloudong")
public class SusheloudongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SusheloudongEntity() {
		
	}
	
	public SusheloudongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 楼栋编号
	 */
					
	private String loudongbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：楼栋编号
	 */
	public void setLoudongbianhao(String loudongbianhao) {
		this.loudongbianhao = loudongbianhao;
	}
	/**
	 * 获取：楼栋编号
	 */
	public String getLoudongbianhao() {
		return loudongbianhao;
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
