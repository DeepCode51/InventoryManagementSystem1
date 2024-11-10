package com.entity.view;

import com.entity.RukujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入库记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
@TableName("rukujilu")
public class RukujiluView  extends RukujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RukujiluView(){
	}
 
 	public RukujiluView(RukujiluEntity rukujiluEntity){
 	try {
			BeanUtils.copyProperties(this, rukujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
