package git.gaozhanghappy.dao;



import git.gaozhanghappy.model.TbStudent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 123456 on 2019/6/2.
 */
public interface StudentDao extends JpaRepository<TbStudent,Integer> {
}
