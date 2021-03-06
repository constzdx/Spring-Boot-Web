package learn.hhltweb.controller;

import learn.hhltweb.AjaxResponse;
import learn.hhltweb.model.ArticleVO;
import learn.hhltweb.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource(name="articleRestJPAServiceImpl")
    ArticleRestService articleRestService;



    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody ArticleVO article) {


        log.info("saveArticle：{}",article);

        log.info("articleRestService return :" + articleRestService.saveArticle(article));

        return  AjaxResponse.success(article);
    }

    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {

        articleRestService.deleteArticle(id);

        return AjaxResponse.success(id);
    }

    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO article) {
        article.setId(id);

        articleRestService.updateArticle(article);

        return AjaxResponse.success(article);
    }

    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping( "/article/{id}")
    public   AjaxResponse getArticle(@PathVariable Long id) {

        return AjaxResponse.success(articleRestService.getArticle(id));
    }


    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping( "/article")
    public   AjaxResponse getAll() {
        return AjaxResponse.success(articleRestService.getAll());
    }
}
