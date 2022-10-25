package com.alexkolson.wtf.hibernate;

import com.alexkolson.wtf.hibernate.entity.Child;
import com.alexkolson.wtf.hibernate.entity.CrazyUncle;
import com.alexkolson.wtf.hibernate.entity.GrandParent;
import com.alexkolson.wtf.hibernate.entity.Parent;
import com.alexkolson.wtf.hibernate.repository.ChildRepository;
import com.alexkolson.wtf.hibernate.repository.CrazyUncleRepository;
import com.alexkolson.wtf.hibernate.repository.GrandParentRepository;
import com.alexkolson.wtf.hibernate.repository.ParentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class HibernateApplicationTests {
    @Autowired
    private ChildRepository childRepository;

    @Autowired
    private CrazyUncleRepository crazyUncleRepository;

    @Autowired
    private GrandParentRepository grandParentRepository;

    @Autowired
    private ParentRepository parentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    @Sql("classpath:create-schema.sql")
    void wtf() {
        GrandParent gp = new GrandParent();
        gp.setId(2L);
        grandParentRepository.save(gp);
        CrazyUncle u = new CrazyUncle();
        u.setId(1L);
        u.setName("Crazy Man");
        crazyUncleRepository.save(u);
        Parent p = new Parent();
        p.setId(2L);
        p.setResponsible(false);
        parentRepository.save(p);
        Child c = new Child();
        c.setId(1L);
        c.setUncle(u);
        c.setTroublemaker(true);
        childRepository.save(c);


        System.out.println(childRepository.findAll().get(0).getUncle());
    }

}
