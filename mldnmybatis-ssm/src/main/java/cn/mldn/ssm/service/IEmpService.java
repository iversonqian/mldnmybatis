package cn.mldn.ssm.service;

import java.util.Map;
import java.util.Set;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import cn.mldn.ssm.vo.Emp;

public interface IEmpService {
	@Cacheable(cacheNames="emp")
	public boolean add(Emp vo);
	@Cacheable(cacheNames="emp")
	public boolean edit(Emp vo);
	@Cacheable(cacheNames="emp")
	public Emp preEdit(Long id);
	@CacheEvict(cacheNames="emp",key="#ids[0]")
	public boolean delete(Set<Long> ids);
	public Map<String,Object> list(long currentPage,int lineSize,String column,String keyWord);
}
