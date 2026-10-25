package com.codegnan.app.productmanagement.program;

import com.codegnan.app.productmanagement.entity.Product;
import com.codegnan.app.productmanagement.operations.ProductOperations;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {
        ProductOperations productOperations = new ProductOperations();

        Product[] products = productOperations.getProducts();
        for(Product product: products){
            System.out.println(product);
        }
        out.println();

        Product product6=new Product(6,"Webcam",3200.00);
        boolean isProductAdded=productOperations.addProduct(product6);
        if(isProductAdded){
            out.println("Product added successfully");
        }else{
            out.println("Product not added successfully");
        }

        Product product1=new Product(1,"Laptop",55000.00);
        Product product2=new Product(2,"Wireless Mouse",750.00);
        Product product3=new Product(3,"Mechanical Keyboard", 2500.00);
        Product product4=new Product(4,"Monitor",12500.00);
        Product product5=new Product(5,"USB-C Hub",1800.00);
        Product product7=new Product(7,"Headphones",1500.00);
        Product product8=new Product(8," External SSD", 6500.00);
        Product product9=new Product(9,"Hard disk",1500.00);
        Product product10=new Product(10,"NoteBook", 6500.00);

        productOperations.addProducts(product1,product1,product3,product4,product5,product6,product7,product8,product9,product10);


        for(Product product: products){
            System.out.println(product);
        }
        out.println();

        //finding by id
        Product product=productOperations.findById(3);
        if(product==null){
            out.println("Customer not found");
        }else{
            out.println("Product found");
            out.println("Product id: "+product.productId());
            out.println("product Name: "+product.productName());
            out.println("Product Price: "+product.productPrice());
            //out.println(product);
        }

        product=productOperations.findById(99);
        if(product==null){
            out.println("Product not found");
        }else{
            out.println("Product found");
            out.println("Product id: "+product.productId());
            out.println("product Name: "+product.productName());
            out.println("Product Price: "+product.productPrice());
            //out.println(product);
        }

        //updating the product with price
        boolean isCustomerUpdated=productOperations.updateProductPrice(2,850.00);
        if(isCustomerUpdated) {
            out.println("Product price succesfully updated");
        }else{
            out.println("Product price failed to update");
        }

        isCustomerUpdated=productOperations.updateProductPrice(99,850.00);
        if(isCustomerUpdated) {
            out.println("Product price succesfully updated");
        }else{
            out.println("Product price failed to update");
        }

        //deleting product by id
        boolean isCustomerDeleted=productOperations.deleteProduct(4);
        if(isCustomerDeleted) {
            out.println("Customer deleted successfully ");
        }else{
            out.println("Customer failed to delete");
        }

        //after deletion

        for(Product finalProducts: products){
            System.out.println(finalProducts);
        }

    }
}
