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


import com.dao.ChukujiluDao;
import com.entity.ChukujiluEntity;
import com.service.ChukujiluService;
import com.entity.vo.ChukujiluVO;
import com.entity.view.ChukujiluView;

@Service("chukujiluService")
public class ChukujiluServiceImpl extends ServiceImpl<ChukujiluDao, ChukujiluEntity> implements ChukujiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukujiluEntity> page = this.selectPage(
                new Query<ChukujiluEntity>(params).getPage(),
                new EntityWrapper<ChukujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukujiluEntity> wrapper) {
		  Page<ChukujiluView> page =new Query<ChukujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChukujiluVO> selectListVO(Wrapper<ChukujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukujiluVO selectVO(Wrapper<ChukujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukujiluView> selectListView(Wrapper<ChukujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukujiluView selectView(Wrapper<ChukujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
