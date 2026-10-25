package com.codegnan.app.productmanagement.operations;

import com.codegnan.app.productmanagement.entity.Product;

public class ProductOperations {
    private Product[] products=new Product[10];

    //adding a product
    public boolean addProduct(Product product){
        boolean isAdded=false;
        for(int index=0;index<products.length;index++){
            if(products[index]==null){
                products[index]=product;
                isAdded=true;
                break;

            }
        }
        return isAdded;
    }

    //adding multiple products
    public void addProducts(Product... inputProducts) {
        for (int index = 0; index < products.length; index++) {
            products[index] = inputProducts[index];
        }
    }

    public Product[] getProducts(){
        return  products;
    }

    public Product findById(int productId){
        for(Product product:products){
            if(product.productId()==productId){
                return product;
            }
        }
        return null;
    }

    public boolean updateProductPrice(int productId,double newPrice){
        boolean isUpdated=false;
        for(int index=0;index<products.length;index++){
            Product product=products[index];
            if(product.productId()==productId){
                products[index]=new Product(productId,product.productName(),newPrice);
            }
            isUpdated=true;
            break;
        }
        return isUpdated;
    }
    public boolean deleteProduct(int productId){
        boolean isDeleted=false;
        for(int index=0;index<products.length;index++){
            Product product=products[index];
            if(product.productId()==productId){
                products[index]=null;
                isDeleted=true;
                break;
            }
        }
        return isDeleted;
    }
}
