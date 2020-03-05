package learn.hhltweb.model;
/**
 * 表层实体类
 * 显示给前端看的
 */

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonPropertyOrder(value={"content","title"})
public class ArticleVO {

    @JsonIgnore
    private Long id;
    //请求别名
    //@JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
   // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private List<Reader> reader;


}