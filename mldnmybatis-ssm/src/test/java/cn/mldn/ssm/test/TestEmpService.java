package cn.mldn.ssm.test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.ssm.service.IEmpService;
import cn.mldn.ssm.vo.Emp;

@ContextConfiguration(locations= {"classpath:spring-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEmpService {
	@Autowired
	private IEmpService service;
@Test
public void testAdd() throws Exception{
//	Emp emp = new Emp();
//	emp.setEmpno(3438L);
//	emp.setName("Tom");
//	emp.setSalary(333.0);
//	emp.setJob("Sales");
//	service.add(emp);
	Emp emp = service.preEdit(3438L);
	//emp.setSalary(444.0);
//	service.edit(emp);
//	TimeUnit.SECONDS.sleep(30);
	
//	Set<Long> ids = new HashSet();
//	ids.add(3438L);
//	service.delete(ids);
	
	
	System.out.println("第二次"+service.preEdit(3438L));
	
}
}
