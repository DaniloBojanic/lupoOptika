package org.lupo.web.controller;

import org.lupo.model.Product;
import org.lupo.service.ProductService;
import org.lupo.support.ProductToProductDTO;
import org.lupo.web.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductToProductDTO toProductDto;

    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<List<ProductDTO>> getAll() {
        List<Product> productList = productService.getAll();
        if(productList != null && !productList.isEmpty()){
            return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/{id}")
    private ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        Product product = productService.findOneById(id);
        if(product != null)
            return new ResponseEntity<>(toProductDto.convert(product), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping("/user/{id}")
    private ResponseEntity<List<ProductDTO>> getAllProductsFromUser(@PathVariable Long id) {
        List<Product> productList = productService.getAllProductsFromUser(id);
        return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
    }

    @GetMapping("/new")
    private ResponseEntity<List<ProductDTO>> getNewProducts() {
        List<Product> productList = productService.findByIsNew(true);
        return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
    }

    @GetMapping("/onSale")
    private ResponseEntity<List<ProductDTO>> getOnSaleProducts() {
        List<Product> productList = productService.findByOnSale(true);
        return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
    }

    @GetMapping("/gender/man")
    private ResponseEntity<List<ProductDTO>> getManProducts() {
        List<Product> productList = productService.findByGenderMan();
        if(productList != null && !productList.isEmpty()){
            return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/gender/woman")
    private ResponseEntity<List<ProductDTO>> getWomanProducts() {
        List<Product> productList = productService.findByGenderWoman();
        if(productList != null && !productList.isEmpty()){
            return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/gender/kid")
    private ResponseEntity<List<ProductDTO>> getKidProducts() {
        List<Product> productList = productService.findByGenderKid();
        if(productList != null && !productList.isEmpty()){
            return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/gender/unisex")
    private ResponseEntity<List<ProductDTO>> getUnisexProducts() {
        List<Product> productList = productService.findByGenderUnisex();
        if (productList != null && !productList.isEmpty()) {
            return new ResponseEntity<>(toProductDto.convertList(productList), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    }
