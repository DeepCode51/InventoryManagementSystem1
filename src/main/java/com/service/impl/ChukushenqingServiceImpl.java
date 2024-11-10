package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChukushenqingDao;
import com.entity.ChukushenqingEntity;
import com.service.ChukushenqingService;
import com.entity.vo.ChukushenqingVO;
import com.entity.view.ChukushenqingView;

@Service("chukushenqingService")
public class ChukushenqingServiceImpl extends ServiceImpl<ChukushenqingDao, ChukushenqingEntity> implements ChukushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukushenqingEntity> page = this.selectPage(
                new Query<ChukushenqingEntity>(params).getPage(),
                new EntityWrapper<ChukushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukushenqingEntity> wrapper) {
		  Page<ChukushenqingView> page =new Query<ChukushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChukushenqingVO> selectListVO(Wrapper<ChukushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukushenqingVO selectVO(Wrapper<ChukushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukushenqingView> selectListView(Wrapper<ChukushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukushenqingView selectView(Wrapper<ChukushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
