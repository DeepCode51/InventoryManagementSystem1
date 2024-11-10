package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukushenqingView;


/**
 * 出库申请
 *
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface ChukushenqingService extends IService<ChukushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukushenqingVO> selectListVO(Wrapper<ChukushenqingEntity> wrapper);
   	
   	ChukushenqingVO selectVO(@Param("ew") Wrapper<ChukushenqingEntity> wrapper);
   	
   	List<ChukushenqingView> selectListView(Wrapper<ChukushenqingEntity> wrapper);
   	
   	ChukushenqingView selectView(@Param("ew") Wrapper<ChukushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukushenqingEntity> wrapper);
   	
}

