package com.cloud.springboot.web.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.springboot.web.app.models.entity.DetalleFactura;

public interface IDetalleFacturaDAO extends JpaRepository<DetalleFactura, Integer> {

}
