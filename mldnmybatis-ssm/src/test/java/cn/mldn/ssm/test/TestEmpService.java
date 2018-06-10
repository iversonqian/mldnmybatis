package cn.mldn.ssm.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.ssm.dao.table.entity.Dept;
import cn.mldn.ssm.service.IDeptService;
import cn.mldn.ssm.service.IEmpService;

@ContextConfiguration(locations = { "classpath:spring-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEmpService {
	@Autowired
	private JedisConnectionFactory jedisConnectionFactory;
	@Autowired
	private IEmpService service;
	@Autowired
	private IDeptService deptService;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void testAdd() throws Exception {
		for (int i = 0; i < 20; i++) {
			Dept dept = new Dept();
			dept.setDeptno("Dept" + i);
			dept.setDeptname("部门" + i);
			dept.setEmps(i);
			deptService.add(dept);
		}
	}
	@Test
	public void testSearch() throws Exception{
		List ids = new ArrayList<Integer>();
		ids.add(2);
		System.out.println(deptService.delete(ids));
	//	System.out.println(deptService.findById("3"));
		
		
		
	}

}
