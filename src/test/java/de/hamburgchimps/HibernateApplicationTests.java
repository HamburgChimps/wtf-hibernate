package de.hamburgchimps;

import de.hamburgchimps.repository.ChildRepository;
import de.hamburgchimps.repository.CrazyUncleRepository;
import de.hamburgchimps.repository.GrandParentRepository;
import de.hamburgchimps.repository.ParentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class HibernateApplicationTests {
    @Autowired
    private ChildRepository childRepository;

    @Test
    void wtf() {
        assertThat(childRepository.findAll().get(0).getUncle()).isNotNull();
    }

}
