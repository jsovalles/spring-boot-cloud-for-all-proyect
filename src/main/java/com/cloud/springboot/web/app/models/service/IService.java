package com.cloud.springboot.web.app.models.service;

import java.util.List;

import com.cloud.springboot.web.app.models.entity.Factura;
import com.cloud.springboot.web.app.models.entity.Producto;

public interface IService {

	List<Factura> listFacturas();

	List<Producto> listProductos();

	Factura fetchFacturaByIdWithDetalleFacturaWithProducto(int id);

	void createFactura(Factura factura);

	void deleteFactura(int id);

	
	
}
