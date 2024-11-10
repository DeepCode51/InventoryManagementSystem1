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


import com.dao.ShanghuDao;
import com.entity.ShanghuEntity;
import com.service.ShanghuService;
import com.entity.vo.ShanghuVO;
import com.entity.view.ShanghuView;

@Service("shanghuService")
public class ShanghuServiceImpl extends ServiceImpl<ShanghuDao, ShanghuEntity> implements ShanghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShanghuEntity> page = this.selectPage(
                new Query<ShanghuEntity>(params).getPage(),
                new EntityWrapper<ShanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShanghuEntity> wrapper) {
		  Page<ShanghuView> page =new Query<ShanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShanghuVO> selectListVO(Wrapper<ShanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShanghuVO selectVO(Wrapper<ShanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShanghuView> selectListView(Wrapper<ShanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShanghuView selectView(Wrapper<ShanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
