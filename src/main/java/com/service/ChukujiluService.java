package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukujiluView;


/**
 * 出库记录
 *
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface ChukujiluService extends IService<ChukujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukujiluVO> selectListVO(Wrapper<ChukujiluEntity> wrapper);
   	
   	ChukujiluVO selectVO(@Param("ew") Wrapper<ChukujiluEntity> wrapper);
   	
   	List<ChukujiluView> selectListView(Wrapper<ChukujiluEntity> wrapper);
   	
   	ChukujiluView selectView(@Param("ew") Wrapper<ChukujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukujiluEntity> wrapper);
   	
}

