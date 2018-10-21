package maven_ssm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cookie312.dao.ItemsDao;
import com.cookie312.domain.Items;
import com.cookie312.service.ItemsService;

public class ItemsTest {
	
 
	/**
	 * dao 代码测试
	 */
	@Test
	public void daoTest() {
		//得到spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从Spring容器中得到所需dao接口的代理对象
		ItemsDao itemDao = applicationContext.getBean(ItemsDao.class);
		//调用方法
		Items items = itemDao.findById(2);
		System.out.println(items);
	}
	
	
	/**
	 * server 代码测试
	 */
	@Test
	public void serverTest() {
		//得到spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从Spring容器中得到所需dao接口的代理对象
		ItemsService itemService = applicationContext.getBean(ItemsService.class);
		//调用方法
		Items items = itemService.findById(1);
		System.out.println(items);
	}
}
