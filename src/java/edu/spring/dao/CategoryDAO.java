/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.spring.dao;

import edu.spring.entity.Category;
import java.util.List;

/**
 *
 * @author yup
 */
public interface CategoryDAO {
    public Category getCateById(int id);
    public List<Category> getCates();
    public void saveCate(Category cate); //addCategory(Category category)
//    public void updateCate(Category cate);
    public void deleteCategory(int id);
}
