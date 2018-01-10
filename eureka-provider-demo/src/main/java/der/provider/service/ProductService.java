package der.provider.service;

import der.provider.entity.Products;
import der.provider.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
* @FileName:ProductService
* @Description:
* @Author: Derrick Ye
*/
@Service
@Transactional
public class ProductService implements IProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Products findById(Long id) {
        if(id==null){
            return null;
        }
        return productRepository.findById(id);
    }

    @Override
    public Page<Products> findAll(Pageable pageable) {
        if(pageable==null){
            return null;
        }
        return productRepository.findAll(pageable);
    }

    @Override
    public Products saveProduct(Products products) {
        if(products==null)
            return null;
        return productRepository.save(products);
    }

    @Override
    public Products updateProduct(Products products) {
        if(products==null)
            return null;
        return productRepository.saveAndFlush(products);
    }

    @Override
    public Boolean deleteProduct(Long id) {
        Boolean res=false;
        if(id!=null ){
            productRepository.delete(id);
            res=true;
        }
        return res;
    }

}
