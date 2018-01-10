package der.customer.web;

import der.customer.service.ProductService;
import der.customer.utils.ReponsePage;
import der.customer.vo.Products;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @FileName:ProductWeb
* @Description:
* @Author: Derrick Ye
*/
@Controller
@RequestMapping("/product")
public class ProductWeb {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public String getAll(@RequestParam(name="pageNumber",defaultValue = "1") int pageNumber,
                         @RequestParam(name="pageSize",defaultValue = "10") int pageSize,
                         Model model){

        ReponsePage<Products> productsPage=productService.getAll(pageNumber,pageSize);
        model.addAttribute("products",productsPage.getContent());
        model.addAttribute("page",productsPage);
        return "product/products";
    }
}
