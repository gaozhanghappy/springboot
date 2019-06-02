package git.gaozhanghappy.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by 123456 on 2019/6/2.
 */
@Component //把普通的model实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
@ConfigurationProperties(prefix = "student") //这个指定在配置文件中的名称
public class Student implements Serializable {
    private String name;
    private String age;

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
