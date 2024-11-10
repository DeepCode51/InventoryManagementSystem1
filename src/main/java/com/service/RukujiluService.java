package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RukujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RukujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RukujiluView;


/**
 * 入库记录
 *
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface RukujiluService extends IService<RukujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RukujiluVO> selectListVO(Wrapper<RukujiluEntity> wrapper);
   	
   	RukujiluVO selectVO(@Param("ew") Wrapper<RukujiluEntity> wrapper);
   	
   	List<RukujiluView> selectListView(Wrapper<RukujiluEntity> wrapper);
   	
   	RukujiluView selectView(@Param("ew") Wrapper<RukujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RukujiluEntity> wrapper);
   	
}

