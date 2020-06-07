package com.cloud.springboot.web.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.springboot.web.app.models.entity.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}
