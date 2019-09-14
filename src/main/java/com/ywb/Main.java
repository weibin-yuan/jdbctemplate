package com.ywb;

import com.ywb.dao.CardDao;
import com.ywb.dao.RandomCard;
import com.ywb.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao card = (CardDao) context.getBean("cardDao");
        System.out.println("*************************");
        System.out.println(card.count());
//        System.out.println(card.getAll());
//        System.out.println(card.selectById(1));
//        System.out.println(card.selectByName("金石开"));
//        System.out.println(card.selectByNumber(1359));
//        System.out.println(card.del(3));

//        User user = new User();
//        user.setName("更改");
//        user.setId(3);
//        System.out.println(card.update(user));


//        插入数据
        try {
            for (int i=1; i<=3; i++) {
                RandomCard rc = new RandomCard();
                card.add(rc);
                System.out.println("第" + i + "条插入成功");
            }
        }catch(Exception e) {
            System.out.println("插入失败");
        }
    }
}
