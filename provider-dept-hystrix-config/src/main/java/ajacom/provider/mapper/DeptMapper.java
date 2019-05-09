package ajacom.provider.mapper;

import com.ajacom.cloud.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 14:02
 */
@Mapper
public interface DeptMapper {

    @Select("select * from dept where dept_no= #{deptNo}")
    public Dept findById(Long deptNo);

    @Select("select * from dept ")
    public List<Dept> findAll();

    @Insert("insert into Dept(dept_name,db_source) values(#{deptName},DATABASE())")
    public boolean insert(Dept dept);
}
