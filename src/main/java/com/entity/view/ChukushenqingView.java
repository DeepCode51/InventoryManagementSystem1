package com.entity.view;

import com.entity.ChukushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出库申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
@TableName("chukushenqing")
public class ChukushenqingView  extends ChukushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChukushenqingView(){
	}
 
 	public ChukushenqingView(ChukushenqingEntity chukushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, chukushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
