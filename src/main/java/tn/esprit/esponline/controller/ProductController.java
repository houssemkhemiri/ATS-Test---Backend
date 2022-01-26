package tn.esprit.esponline.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
import tn.esprit.esponline.entities.Product;
import tn.esprit.esponline.repository.ProductRepository;





@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productrep ; 
	
	@GetMapping("/products")
	public List<Product> get(
			@RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "2") Integer pageSize) {
		Pageable paging = (Pageable) PageRequest.of(pageNo, pageSize);
		return productrep.findAll(paging).toList();
	}
	
	@PostMapping("/products")
	  Product newProduct(@RequestBody Product newProduct) {
	    return productrep.save(newProduct);
	}
	
	 @GetMapping("/products/{id_product}")
	  Optional<Product> getbyid(@PathVariable int id_product) {
	    
	    return productrep.findById(id_product) ;
	  }

}


