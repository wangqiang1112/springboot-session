package htjs.service;

import htjs.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/18.
 */
public interface ProductIService {
    public List<Product> getAll(Map pamameMap);
    public int update(Product paramMap);
}
