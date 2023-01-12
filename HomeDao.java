package com.training.springmvc.Dao;

import java.util.List;

import com.training.springmvc.model.User;

public interface HomeDao {
   public List<User> getUsers();
}
