package cn.mccreefei.technologystack.rpc.client;

import cn.mccreefei.technologystack.rpc.api.entity.Address;
import cn.mccreefei.technologystack.rpc.api.service.AddressService;
import cn.mccreefei.technologystack.rpc.api.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author MccreeFei
 * @create 2018-10-16 下午3:39
 */
@SpringBootTest(classes = ClientApplication.class)
@RunWith(SpringRunner.class)
public class RpcClientTest {
    @Resource
    private ApplicationContext context;
    @Test
    public void test(){
        HelloService helloService = context.getBean(HelloService.class);
        String content = helloService.sayHello("MccreeFei");
        System.out.println(content);
        AddressService addressService = context.getBean(AddressService.class);
        Address address = addressService.getAddress("zhejiang", "hangzhou");
        System.out.println(address);
    }
}
