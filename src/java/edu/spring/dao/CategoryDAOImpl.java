/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.spring.dao;

import static com.mysql.cj.conf.PropertyKey.logger;
import edu.spring.entity.Category;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yup
 */

@Repository
public class CategoryDAOImpl implements CategoryDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Category getCateById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Category category = (Category)session.get(Category.class, id);
        return category;
    }

    @Override
    @Transactional
    public List<Category> getCates() {
        Session session = sessionFactory.getCurrentSession();
        List<Category> lstCategory = session.createQuery("from Category").list();
        return lstCategory;
    }

    @Override
    @Transactional
    public void saveCate(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(category);
    }
    
//    @Override
//    @Transactional
//    public void updateCate(Category cate) {
//        Session session = sessionFactory.getCurrentSession();
////        session.saveOrUpdate(cate);
//        session.update(cate);
//    }

    @Override
    @Transactional
    public void deleteCategory(int id) {
        Session session = sessionFactory.getCurrentSession();
        Category category = (Category)session.get(Category.class, id);
        session.delete(category);
    }
}
