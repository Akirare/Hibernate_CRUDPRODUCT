/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.spring.controller;

import edu.spring.dao.CategoryDAO;
import edu.spring.entity.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yup
 */

@Controller
@RequestMapping("cate")
public class CategoryController {
    
    @Autowired
    private CategoryDAO categoryDAO;
    
    // show all Category from table Category on show-cate-list.jsp
    @RequestMapping("list")
    public String showCategoryList(Model model){
        List<Category> listCates = categoryDAO.getCates();
        model.addAttribute("categories", listCates);
        return "show-cate-list";
    }
    
    // Show form for Add new Category
    @RequestMapping("showFormForAdd")
    public String showFormCategory(Model model){
        Category category = new Category();
        model.addAttribute("categories", category);
        return "category-form-add";
    }
    // Add new Category
    @RequestMapping("/saveCategory")
    public String saveCategory(@ModelAttribute("categories") Category cate){
       categoryDAO.saveCate(cate);
       return "redirect:/cate/list";
    }
    
    // Show form for Update Category
    @RequestMapping("showFormForUpdate")
    public String showFormForUpdateCate(@ModelAttribute("categoryId") int cateId, Model model){
        Category category = categoryDAO.getCateById(cateId);
        model.addAttribute("categories", category);
        return "category-form-add";
    }
    
//    // Update Category
//    @RequestMapping("/updateCategory")
//    public String updateCategory(@ModelAttribute("categories") Category cate){
//       categoryDAO.updateCate(cate);
//       return "redirect:/cate/list";
//    }
    
    // Delete Category
    @RequestMapping("/deleteCategory")
    public String deleteCategory(@ModelAttribute("categoryId") int cateId,  Model model){
        categoryDAO.deleteCategory(cateId);
        //model.addAttribute("categories",cat);
        return "redirect:/cate/list";
    }
    
//    @RequestMapping("saveCategoryFirst")
//    public String saveCategoryFirst(Model model){
//        Category category = new Category();
//        model.addAttribute("categories", category);
//        return "show-form-category";
//    }
    
        
}
