package der.customer.service;

import der.customer.utils.ReponsePage;
import der.customer.vo.Products;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.*;

/**
* @FileName:ProductService
* @Description:
* @Author: Derrick Ye
*/
@FeignClient(name="eureka-provider-demo")
public interface ProductService {

    @RequestMapping(value = "/product/getAll",method = RequestMethod.GET)
    public ReponsePage<Products> getAll(@RequestParam(name="pageNumber",defaultValue = "1") int pageNumber,
                                        @RequestParam(name="pageSize",defaultValue = "10") int pageSize);

    @RequestMapping(value = "/product/save",method = RequestMethod.POST)
    public Products saveProduct(@RequestBody Products product);

    @RequestMapping(value = "/product/update",method = RequestMethod.PUT)
    public Products updateProduct(@RequestBody Products product);

    @RequestMapping(value = "/product/delete/{id}",method = RequestMethod.DELETE)
    public Boolean deleteProduct(@PathVariable(value="id") Long id);
}
