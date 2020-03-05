package learn.hhltweb.service;

import learn.hhltweb.dao.ArticlePO;
import learn.hhltweb.dao.ArticleRepository;
import learn.hhltweb.model.ArticleVO;
import learn.hhltweb.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleRestJPAServiceImpl implements ArticleRestService {

    //将JPA仓库对象注入
    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private Mapper dozerMapper;

    public ArticleVO saveArticle(ArticleVO article) {
        //将ArticleVO->ArticlePO
        ArticlePO articlePO = dozerMapper.map(article, ArticlePO.class);
        articleRepository.save(articlePO);    //保存一个对象到数据库，insert

        return  article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);   //根据id删除1条数据库记录
    }

    @Override
    public void updateArticle(ArticleVO article) {
        ArticlePO articlePO = dozerMapper.map(article, ArticlePO.class);
        articleRepository.save(articlePO);   //更新一个对象到数据库，仍然使用save方法
    }

    @Override
    public ArticleVO getArticle(Long id) {
        Optional<ArticlePO> article = articleRepository.findById(id);  //根据id查找一条数据
        return dozerMapper.map(article.get(),ArticleVO.class);
    }

    @Override
    public List<ArticleVO> getAll() {
        List<ArticlePO> articlePOLis = articleRepository.findAll();  //查询article表的所有数据
        return DozerUtils.mapList(articlePOLis,ArticleVO.class);
    }
}

/*
注意：虽然新增和修改都是使用的save方法，但是完成的功能是不一样的。当保存的对象有主键id的时候，save方法会根据id更新记录；当保存的对象没有主键id的时候，save方法会向数据库里面insert一条记录。
然后大家可以在控制层调用一下service层方法，用postman测试一下.
 */