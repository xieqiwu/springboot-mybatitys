package com.jbit;

import com.jbit.entity.Customer;
import com.jbit.entity.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStream;
import java.util.List;

@SpringBootTest
public class TestOne2Many {
    /**
     * 测试往Customer插入指定的数据
     */
    @Test
    public void testInsertCustomer() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sess = sf.openSession();
        Customer c = new Customer();
        c.setName("王明");
        c.setAge(20);
        sess.insert("com.jbit.mapper.CustomerMapper.insert", c);

        Order o = new Order();
        o.setOrderno("0003");
        o.setPrice(99);
        //设置关联关系
        o.setCustomer(c);

        sess.insert("com.jbit.mapper.OrderMapper.insert" , o) ;
        sess.commit();
        sess.close();
    }

    /**
     * 测试查询指定的order
     */
    @Test
    public void testSelectOneOrder() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sess = sf.openSession();
        Order o = sess.selectOne("com.jbit.mapper.OrderMapper.selectOne" , 1);
        System.out.println(o.getOrderno());
        List<Order> orders = sess.selectList("com.jbit.mapper.OrderMapper.selectAll");
        for(Order obj : orders){
            System.out.print(obj.getOrderno());
            Customer c = obj.getCustomer() ;
            if(c != null){
                System.out.println(c.getName());
            }
            else{
                System.out.println();
            }
        }
        sess.commit();
        sess.close();
    }


    /**
     * 测试查询指定的Customer
     */
    @Test
    public void testSelectCustomer() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sess = sf.openSession();
        Customer c = sess.selectOne("com.jbit.mapper.CustomerMapper.selectOne" , 1);
        for(Order o : c.getOrders()){
            System.out.println(o.getId() + "  " + o.getOrderno());
        }
        sess.commit();
        sess.close();
    }
}