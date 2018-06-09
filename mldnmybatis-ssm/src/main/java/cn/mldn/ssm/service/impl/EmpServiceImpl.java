package cn.mldn.ssm.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.ssm.dao.IEmpDAO;
import cn.mldn.ssm.service.IEmpService;
import cn.mldn.ssm.vo.Emp;
import cn.mldn.util.service.abs.AbstractService;

@Service
public class EmpServiceImpl extends AbstractService implements IEmpService {
	@Resource(name="empDAOImpl")
	private IEmpDAO empDAO;

	@Override
	public boolean add(Emp vo) {
		// TODO Auto-generated method stub
		return empDAO.doCreate(vo);
	}

	@Override
	public boolean edit(Emp vo) {
		// TODO Auto-generated method stub
		return empDAO.doEdit(vo);
	}

	@Override
	public Emp preEdit(Long id) {
		// TODO Auto-generated method stub
		return empDAO.findById(id);
	}

	@Override
	public boolean delete(Set<Long> ids) {
		// TODO Auto-generated method stub
		return empDAO.doRemove(ids);
	}

	@Override
	public Map<String, Object> list(long currentPage, int lineSize, String column, String keyWord) {
		Map<String,Object> result = new HashMap<String,Object>() ;
		Map<String,Object> paramMap = super.paramConverterMap(currentPage, lineSize, column, keyWord) ;
		result.put("allEmps", empDAO.findSplit(paramMap)) ;
		result.put("empCount", empDAO.getAllCount(paramMap)) ;
		return result; 
	}


}
