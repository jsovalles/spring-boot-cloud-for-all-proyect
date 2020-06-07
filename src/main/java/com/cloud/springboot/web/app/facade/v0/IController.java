package com.cloud.springboot.web.app.facade.v0;

import java.util.List;

import com.cloud.springboot.web.app.models.entity.Factura;
import com.cloud.springboot.web.app.models.entity.Producto;

public interface IController {

	List<Factura> listFacturas();
	
	List<Producto> listProductos();
	
	Factura fetchFacturaByIdWithDetalleFacturaWithProducto(int id);
	
	void createFactura(Factura factura);
	
	void updateFactura(int id, Factura factura);
	
	void eliminarFactura(int id);

}
