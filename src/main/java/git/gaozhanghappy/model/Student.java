package git.gaozhanghappy.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 123456 on 2019/6/2.
 */
@Component //把普通的model实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
@ConfigurationProperties(prefix = "student") //这个指定在配置文件中的名称
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String age;

    //必须要有构造函数

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
