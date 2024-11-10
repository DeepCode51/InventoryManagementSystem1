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


import com.dao.RukujiluDao;
import com.entity.RukujiluEntity;
import com.service.RukujiluService;
import com.entity.vo.RukujiluVO;
import com.entity.view.RukujiluView;

@Service("rukujiluService")
public class RukujiluServiceImpl extends ServiceImpl<RukujiluDao, RukujiluEntity> implements RukujiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RukujiluEntity> page = this.selectPage(
                new Query<RukujiluEntity>(params).getPage(),
                new EntityWrapper<RukujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RukujiluEntity> wrapper) {
		  Page<RukujiluView> page =new Query<RukujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RukujiluVO> selectListVO(Wrapper<RukujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RukujiluVO selectVO(Wrapper<RukujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RukujiluView> selectListView(Wrapper<RukujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RukujiluView selectView(Wrapper<RukujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
