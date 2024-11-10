package com.dao;

import com.entity.ChukujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukujiluVO;
import com.entity.view.ChukujiluView;


/**
 * 出库记录
 * 
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface ChukujiluDao extends BaseMapper<ChukujiluEntity> {
	
	List<ChukujiluVO> selectListVO(@Param("ew") Wrapper<ChukujiluEntity> wrapper);
	
	ChukujiluVO selectVO(@Param("ew") Wrapper<ChukujiluEntity> wrapper);
	
	List<ChukujiluView> selectListView(@Param("ew") Wrapper<ChukujiluEntity> wrapper);

	List<ChukujiluView> selectListView(Pagination page,@Param("ew") Wrapper<ChukujiluEntity> wrapper);
	
	ChukujiluView selectView(@Param("ew") Wrapper<ChukujiluEntity> wrapper);
	
}
