package learn.hhltweb;

import learn.hhltweb.dao.ArticlePO;
import learn.hhltweb.dao.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPAKeyWordTest {

    @Resource
    private ArticleRepository articleRepository;

    @Test
    public void userTest() {
        ArticlePO articlePO = articleRepository.findByAuthor("hhlt");
        System.out.println(articlePO);
    }

}
