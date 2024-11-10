package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShanghuView;


/**
 * 商户
 *
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface ShanghuService extends IService<ShanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShanghuVO> selectListVO(Wrapper<ShanghuEntity> wrapper);
   	
   	ShanghuVO selectVO(@Param("ew") Wrapper<ShanghuEntity> wrapper);
   	
   	List<ShanghuView> selectListView(Wrapper<ShanghuEntity> wrapper);
   	
   	ShanghuView selectView(@Param("ew") Wrapper<ShanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShanghuEntity> wrapper);
   	
}

