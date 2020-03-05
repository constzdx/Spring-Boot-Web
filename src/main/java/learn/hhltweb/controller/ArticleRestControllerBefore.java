package learn.hhltweb.controller;


/**
 * 三、手动数据转换
 * 除了在spring框架内实现自动的前后端JSON数据与java对象的转换，我们还可以使用jackson自己写代码进行转换。
 *
 * //jackson的ObjectMapper 转换对象
 * ObjectMapper mapper = new ObjectMapper();
 * //将某个java对象转换为JSON字符串
 * String jsonStr = mapper.writeValueAsString(javaObj);
 * //将jsonStr转换为Ademo类的对象
 * Ademo ademo = mapper.readValue(jsonStr, Ademo.class);
 */

import learn.hhltweb.AjaxResponse;

import learn.hhltweb.model.ArticleVO;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.util.Date;



//@Slf4j
//@RestController
//@RequestMapping("/rest")
public class ArticleRestControllerBefore {

//
//
//    /**
//     *  //增加一篇Article ，使用POST方法
//     * @param article
//     * @return
//     */
//    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
//    @PostMapping(value = "/article",produces ="application/json")
//    public AjaxResponse addArticle(@RequestBody ArticleVO article){
//        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
//        log.info("addArticle:{}",article);
//        return AjaxResponse.success(article);
//    }
//
//
//    /**
//     * /删除一篇Article，使用DELETE方法，参数是id
//     * @param id
//     * @return
//     */
//    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
//    @DeleteMapping(value="/article/{id}",produces ="application/json")
//    public AjaxResponse deleteArticle(@PathVariable Long id) {
//
//        log.info("deleteArticle：{}",id);
//        return  AjaxResponse.success(id);
//    }
//
//
//    /**
//     *更新一篇Article，使用PUT方法，以id为主键进行更新
//     * @param id
//     * @return
//     */
//    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
//    @PutMapping(value = "/article/{id}",produces = "application/json")
//    public AjaxResponse updateArticle(@PathVariable Long id,@RequestBody ArticleVO article) {
//        article.setId(id);
//        log.info("updateArticle：{}",article);
//        return AjaxResponse.success(article);
//    }
//
//
//    /**
//     * 获取一篇Article，使用GET方法
//     * @param id
//     * @return
//     */
//    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
//    @GetMapping(value = "/article/{id}",produces = "application/json")
//    public ArticleVO getArticle(@PathVariable Long id) {
//        //使用lombok提供的builder构建对象
//        ArticleVO article0=ArticleVO.builder()
//                .id(id)
//                .author("hhlt")
//                .content("第一个Spring Boot 2.x Demo")
//                .createTime(new Date())
//                .title("标题")
//                .build();
//        return AjaxResponse.successGetArticle(article0);
//
//    }
//
//
//
//
//
//
//


}
