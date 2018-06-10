package cn.mldn.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mldn.ssm.dao.table.entity.Dept;
import cn.mldn.ssm.dao.table.mapper.DeptMapper;
import cn.mldn.ssm.service.IDeptService;
import cn.mldn.util.service.abs.AbstractService;
@Service
public class DeptServiceImpl extends AbstractService implements IDeptService {
	@Autowired
	private DeptMapper DeptMapper;	

	@Override
	public boolean add(Dept vo) {
		return DeptMapper.insert(vo)>0;
	}

	@Override
	public Dept edit(Dept vo) {
		 DeptMapper.updateByPrimaryKey(vo);
		 return vo;
	}

	@Override
	public boolean delete(List ids) {
		// TODO Auto-generated method stub
//		 DeptExample example = new DeptExample();  
//		 example.createCriteria().andDeptnoIn(ids);
//		return DeptMapper.deleteByExample(example)>0;
		return DeptMapper.deleteByPrimaryKey((Integer)ids.get(0))>0;
	}

	@Override
	public Dept findById(String keyId) {
		// TODO Auto-generated method stub
		return DeptMapper.selectByPrimaryKey(new Integer(keyId));
	}
	
//	@Override
//	public Map<String, Object> list(long currentPage, int lineSize, String column, String keyWord) {
//		Map<String,Object> result = new HashMap<String,Object>() ;
//		Map<String,Object> paramMap = super.paramConverterMap(currentPage, lineSize, column, keyWord) ;
//		result.put("allDepts", this.DeptMapper.findSplit(paramMap)) ;
//		result.put("allRecorders", this.DeptMapper.getAllCount(paramMap)) ;
//		return result; 
//	}



	

}
