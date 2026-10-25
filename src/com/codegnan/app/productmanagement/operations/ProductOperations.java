package com.codegnan.app.productmanagement.operations;

import com.codegnan.app.productmanagement.entity.Product;

public class ProductOperations {
    private Product[] products=new Product[10];
    public ProductOperations(){
        Product product1=new Product(1,"Laptop",55000.00);
        Product product2=new Product(2,"Wireless Mouse",750.00);
        Product product3=new Product(3,"Mechanical Keyboard", 2500.00);
        Product product4=new Product(4,"Monitor",12500.00);
        Product product5=new Product(5,"USB-C Hub",1800.00);
        products[0]=product1;
        products[1]=product2;
        products[2]=product3;
        products[3]=product4;
        products[4]=product5;
    }

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
            if(product!=null) {
                if (product.productId() == productId) {
                    return product;
                }
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
