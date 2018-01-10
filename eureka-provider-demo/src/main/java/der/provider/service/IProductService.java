package der.provider.service;

import der.provider.entity.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
* @FileName:IProductService
* @Description:
* @Author: Derrick Ye
*/
public interface IProductService {

    /**
     * return a single product by the passed id
     * @param id
     * @return
     */
    public Products findById(Long id);

    /**
     * return all products with pagination
     * @param pageable
     * @return
     */
    public Page<Products> findAll(Pageable pageable);

    /**
     * save the specific product entity
     * @param products
     * @return
     */
    public Products saveProduct(Products products);

    /**
     * update the specific product
     * @param products
     * @return
     */
    public Products updateProduct(Products products);

    /**
     * delete the  product by the passed id
     * @param id
     */
    public Boolean deleteProduct(Long id);
}
