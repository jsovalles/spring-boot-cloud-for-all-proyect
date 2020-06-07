package com.cloud.springboot.web.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cloud.springboot.web.app.models.entity.Factura;

public interface IFacturaDAO extends JpaRepository<Factura, Integer> {

	@Query("SELECT f FROM Factura f JOIN FETCH f.detalles d JOIN FETCH d.producto WHERE f.id=?1")
	public Factura fetchByIdWithDetalleFacturaWithProducto(int id);

	@Query("SELECT MAX(id) FROM Factura")
	public int getLastId();
	
}
