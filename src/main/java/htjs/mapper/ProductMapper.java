package htjs.mapper;

import htjs.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {

    public List getAll(Map mapParam);
    public int update(Product product);

}
