package com.entity.view;

import com.entity.ShanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
@TableName("shanghu")
public class ShanghuView  extends ShanghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShanghuView(){
	}
 
 	public ShanghuView(ShanghuEntity shanghuEntity){
 	try {
			BeanUtils.copyProperties(this, shanghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
