package learn.hhltweb.dao;
/**
 * 持久层仓库类
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface  ArticleRepository extends JpaRepository<ArticlePO, Long> {
    //注意这个方法的名称，jPA会根据方法名自动生成SQL执行
    ArticlePO findByAuthor(String author);
}
