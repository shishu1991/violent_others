package com.app.greengrocer.dao.repository.impls;


import com.app.greengrocer.dao.entity.User;
import com.app.greengrocer.dao.repository.contracts.UserRespository;
import com.app.greengrocer.dao.utitlity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRespository {
  @Override
  public void saveUser(User user) {
    Transaction transaction = null;
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
      // start a transaction
      transaction = session.beginTransaction();
      // save the user object
      session.save(user);
      // commit transaction
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    }
  }

  @Override
  public List<User> getUsers() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
      return session.createQuery("from User",User.class).list();
    }
  }
}