package htjs.service.impl;

import htjs.entity.Product;
import htjs.mapper.ProductMapper;
import htjs.service.ProductIService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements ProductIService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll(Map pamameMap) {
        return productMapper.getAll(pamameMap);
    }

    @Override
    public int update(Product paramMap) {
        return productMapper.update(paramMap);
    }
}
