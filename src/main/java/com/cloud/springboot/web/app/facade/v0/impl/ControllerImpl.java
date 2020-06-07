package com.cloud.springboot.web.app.facade.v0.impl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cloud.springboot.web.app.models.entity.DetalleFactura;
import com.cloud.springboot.web.app.models.entity.Factura;
import com.cloud.springboot.web.app.models.entity.Producto;
import com.cloud.springboot.web.app.models.service.IService;

@Controller
@RequestMapping("/facturas")
@SessionAttributes("factura")
public class ControllerImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerImpl.class);

	@Autowired
	IService service;

	@GetMapping
	public String listFacturas(Model model) {

		List<Factura> facturas = service.listFacturas();

		model.addAttribute("facturas", facturas);
		model.addAttribute("titulo", "Listado de facturas");
		return "listado";

	}

	@GetMapping("/productos")
	public List<Producto> listProductos() {

		List<Producto> productos = service.listProductos();

		return productos;
	}

	@GetMapping("/{id}")
	public String fetchFacturaByIdWithDetalleFacturaWithProducto(@PathVariable(name = "id") int id, Model model) {
		Factura factura = service.fetchFacturaByIdWithDetalleFacturaWithProducto(id);

		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Información de la factura");
		return "detalle-factura";
	}

	@GetMapping("/form")
	public String creacionFactura(Model model) {

		Factura factura = new Factura();
		DetalleFactura detalle = new DetalleFactura();

		model.addAttribute("factura", factura);
		model.addAttribute("detalle", detalle);
		model.addAttribute("titulo", "Crear Factura");
		model.addAttribute("productos", listProductos());

		return "form";

	}

	@PostMapping("/form/new")
	public String createFactura(@Valid Factura factura, BindingResult result, DetalleFactura detalle, Model model, RedirectAttributes flash,
			SessionStatus status) {
		
		LOGGER.info(Boolean.toString(result.hasErrors()));
		LOGGER.info(factura.toString());
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Crear Factura");
			return "form";
		}

		factura.setDetalles(new ArrayList<>());
		factura.getDetalles().add(detalle);
		service.createFactura(factura);
		status.setComplete();

		flash.addFlashAttribute("success", "Factura creada con éxito!");

		return "redirect:/facturas/";

	}

	@GetMapping("/delete/{id}")
	public String eliminarFactura(@PathVariable(name = "id") int id, RedirectAttributes flash) {

		service.deleteFactura(id);
		
		flash.addFlashAttribute("warning", "Factura eliminada");
		
		return "redirect:/facturas/";

	}

}
