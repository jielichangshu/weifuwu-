package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 标签持久层：spring data jpa
 *
 * spring data jpa(jpa独有功能)  spring data common（持久层公共代码）
 *
 * JpaRepository:基础CRUD
 */
public interface LabelDao  extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label>{
}
