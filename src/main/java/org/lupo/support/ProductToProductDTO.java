package org.lupo.support;


import org.springframework.core.convert.converter.Converter;
import org.lupo.model.Product;
import org.lupo.web.dto.ProductDTO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductToProductDTO implements Converter<Product, ProductDTO> {

    @Override
    public ProductDTO convert(Product product) {
        ProductDTO productDTO = new ProductDTO();

        productDTO.setId(product.getId());
        productDTO.setOnSale(product.isOnSale());
        productDTO.setNew(product.isNew());
        productDTO.setDiscountPercentage(product.getDiscountPercentage());
        productDTO.setPriceBefore(product.getPriceBefore());
        productDTO.setPriceAfter(product.getPriceAfter());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setProductGender(product.getProductGender());

        return productDTO;
    }

    public List<ProductDTO> convertList(List<Product> products) {
        List<ProductDTO> productDTOs = new ArrayList<>();

        for (Product l : products) {
            productDTOs.add(convert(l));
        }

        return productDTOs;

    }
}
