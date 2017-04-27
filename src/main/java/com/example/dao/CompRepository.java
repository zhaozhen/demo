package com.example.dao;

import com.example.bean.Comp;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompRepository extends JpaRepository<Comp, Long> {

}
