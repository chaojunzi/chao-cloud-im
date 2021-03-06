package com.chao.cloud.im.dal.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;

import cn.hutool.core.date.DatePattern;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @功能：
 * @author： 超君子
 * @时间：2019-06-26
 * @version 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ImGroup implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 群id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 头像
	 */
	private String headImg;

	/**
	 * 是否删除（0未删除1已删除）
	 */
	@TableLogic
	private Integer deleted;

	/**
	 * 乐观锁
	 */
	@Version
	private Integer version;

	/**
	 * 创建日期
	 */
	@DateTimeFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
	private Date createTime;

}
