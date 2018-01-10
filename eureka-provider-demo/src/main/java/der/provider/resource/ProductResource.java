package der.provider.resource;

import der.provider.entity.Products;
import der.provider.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
* @FileName:ProductResource
* @Description:
* @Author: Derrick Ye
*/
@RestController
@RequestMapping("/product")
@Api(value = "ProductResource",description = "Rest APIs related to Product entity.",tags = "Product")
public class ProductResource {

    @Autowired
    private IProductService productService;

    @ApiOperation(value = "get all products with pagination.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNumber",dataType = "int",paramType = "query",value = "result page you want to retrieve{0..N}",required = false),
            @ApiImplicitParam(name="pageSize",dataType = "int",paramType = "query",value="number of recorders per page",required = false)
    })
    @GetMapping("/getAll")
    public Page<Products> getAll (@RequestParam(name="pageNumber",defaultValue = "1") int pageNumber,
                                  @RequestParam(name="pageSize",defaultValue = "10") int pageSize){
        Pageable pageable=new PageRequest(pageNumber-1,pageSize);
        return productService.findAll(pageable);
    }

    @ApiOperation(value = "save the new product.")
    @ApiImplicitParam(name = "product",dataType = "Products" ,paramType = "body",value = "product entity")
    @PostMapping("/save")
    public Products saveProduct(@RequestBody  Products product){
       return  productService.saveProduct(product);
    }

    @ApiOperation(value = "update the given product")
    @ApiImplicitParam(name = "product",dataType = "Product",paramType = "body",value = "product entity")
    @PutMapping("/update")
    public Products updateProduct(@RequestBody Products product){
        return productService.updateProduct(product);
    }

    @ApiOperation(value = "delete the product by the given id ")
    @ApiImplicitParam(name = "id",dataType = "Long",paramType = "path",value = "product id")
    @DeleteMapping("/delete/{id}")
    public Boolean deleteProduct(@PathVariable(value="id") Long id){
       Boolean res= productService.deleteProduct(id);
        return res;
    }

}
