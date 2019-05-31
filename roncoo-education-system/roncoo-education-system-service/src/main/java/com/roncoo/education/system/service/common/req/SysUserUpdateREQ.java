package com.roncoo.education.system.service.common.req;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 后台用户信息-更新
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysUserUpdateREQ implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键", required = true)
	private Long id;
	/**
	 * 手机
	 */
	@ApiModelProperty(value = "手机", required = true)
	private String mobile;
	/**
	 * 真实姓名
	 */
	@ApiModelProperty(value = "真实姓名", required = true)
	private String realName;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注", required = false)
	private String remark;

}