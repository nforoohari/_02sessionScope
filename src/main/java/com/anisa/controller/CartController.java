package com.anisa.controller;

import com.anisa.entity.ShoppingCart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@SessionAttributes({"shoppingCart"}) //modelattribute ==> request.getSession().setAttribute("shoppingCart",productName);
public class CartController {

    @ModelAttribute("shoppingCart")
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }

    @ModelAttribute("nimaCart")
    public String nimaCart() {
        return "nimaCartController";
    }

    @PostMapping("/addToCart")
    public String addToCart(Model model, @ModelAttribute ShoppingCart shoppingCart, @RequestParam("productName") String productName) {
        System.out.println("Before Adding: " + model.getAttribute("shoppingCart"));
        shoppingCart.addProduct(productName);
        System.out.println("After Adding: " + model.getAttribute("shoppingCart"));
        return "redirect:" + "product-page";
    }

    @GetMapping("product-page")
    public String viewProductCart() {
        System.out.println("Only Redirecting test");
        return "addToCart";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

}
