package com.dao;

import com.entity.ChukushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukushenqingVO;
import com.entity.view.ChukushenqingView;


/**
 * 出库申请
 * 
 * @author 
 * @email 
 * @date 2021-01-12 10:13:58
 */
public interface ChukushenqingDao extends BaseMapper<ChukushenqingEntity> {
	
	List<ChukushenqingVO> selectListVO(@Param("ew") Wrapper<ChukushenqingEntity> wrapper);
	
	ChukushenqingVO selectVO(@Param("ew") Wrapper<ChukushenqingEntity> wrapper);
	
	List<ChukushenqingView> selectListView(@Param("ew") Wrapper<ChukushenqingEntity> wrapper);

	List<ChukushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ChukushenqingEntity> wrapper);
	
	ChukushenqingView selectView(@Param("ew") Wrapper<ChukushenqingEntity> wrapper);
	
}
