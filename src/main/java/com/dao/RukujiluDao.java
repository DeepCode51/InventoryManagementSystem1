package com.dao;

import com.entity.RukujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RukujiluVO;
import com.entity.view.RukujiluView;


/**
 * 入库记录
 * 
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface RukujiluDao extends BaseMapper<RukujiluEntity> {
	
	List<RukujiluVO> selectListVO(@Param("ew") Wrapper<RukujiluEntity> wrapper);
	
	RukujiluVO selectVO(@Param("ew") Wrapper<RukujiluEntity> wrapper);
	
	List<RukujiluView> selectListView(@Param("ew") Wrapper<RukujiluEntity> wrapper);

	List<RukujiluView> selectListView(Pagination page,@Param("ew") Wrapper<RukujiluEntity> wrapper);
	
	RukujiluView selectView(@Param("ew") Wrapper<RukujiluEntity> wrapper);
	
}
