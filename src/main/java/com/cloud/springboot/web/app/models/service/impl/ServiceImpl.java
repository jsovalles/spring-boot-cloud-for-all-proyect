package com.cloud.springboot.web.app.models.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.springboot.web.app.models.dao.IDetalleFacturaDAO;
import com.cloud.springboot.web.app.models.dao.IFacturaDAO;
import com.cloud.springboot.web.app.models.dao.IProductoDAO;
import com.cloud.springboot.web.app.models.entity.Factura;
import com.cloud.springboot.web.app.models.entity.Producto;
import com.cloud.springboot.web.app.models.service.IService;

@Service
public class ServiceImpl implements IService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceImpl.class);
	
	@Autowired
	IFacturaDAO facturaDao;
	
	@Autowired
	IProductoDAO productoDao;
	
	@Autowired
	IDetalleFacturaDAO detalleFacturaDao;

	@Override
	public List<Factura> listFacturas() {
		List<Factura> facturas = new ArrayList<>();
		
		facturas = facturaDao.findAll();
		
		return facturas;
	}

	@Override
	public List<Producto> listProductos() {
		return productoDao.findAll();
	}

	@Override
	public Factura fetchFacturaByIdWithDetalleFacturaWithProducto(int id) {
		return facturaDao.fetchByIdWithDetalleFacturaWithProducto(id);
	}

	@Override
	public void createFactura(Factura factura) {
		
		facturaDao.save(factura);
		
	}

	@Override
	public void deleteFactura(int id) {

		facturaDao.deleteById(id);
	}

}
