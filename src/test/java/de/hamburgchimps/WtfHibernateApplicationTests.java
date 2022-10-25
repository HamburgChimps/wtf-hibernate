package de.hamburgchimps;

import de.hamburgchimps.repository.ChildRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class WtfHibernateApplicationTests {
    @Autowired
    private ChildRepository childRepository;

    @Test
    void wtf() {
        assertThat(childRepository.findAll().get(0).getUncle()).isNotNull();
    }

}
