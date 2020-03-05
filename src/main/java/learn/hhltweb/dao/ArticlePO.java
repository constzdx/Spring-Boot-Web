package learn.hhltweb.dao;
/**
 * 数据库实体类
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "article")
public class ArticlePO {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 32)
    private String author;
    //这里设定标题独一无二
    @Column(nullable = false, unique = true, length = 32)
    private String title;

    @Column(length = 512)
    private String content;

    private Date createTime;


}
