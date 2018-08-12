package com.wang.simplesb.dao;

import com.wang.simplesb.bean.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Girlrespon extends JpaRepository<Girl,Integer> {
        public List<Girl> findByAge(Integer age);
}
