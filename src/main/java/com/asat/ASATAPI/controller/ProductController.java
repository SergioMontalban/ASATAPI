package com.asat.ASATAPI.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asat.ASATAPI.model.ProductModel;
import com.asat.ASATAPI.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository pr;
	
	@GetMapping("/")
	public String verPersonas(Model model) {
		
		model.addAttribute("productos", pr.findAll());
		return "listado";
		
	}
	
	@GetMapping("/insertar")
	public String insertProducto(Model model) {
		model.addAttribute("productos", new ProductModel());
		return "insertar";
	} 
    
	@PostMapping("/insertarProducto")
	public String insertProducto(ProductModel producto){
		pr.save(producto);
		return "redirect:/insercionCorrecta";
	}
	
	@GetMapping("/insercionCorrecta")
	public String insertCorrect(Model model) {
		return "correcto";
	}
	
	@RequestMapping(path = "/eliminar/{id}")
	public String eliminarProducto(ProductModel producto, @PathVariable("id") String id) {
		pr.delete(producto);
		return "correcto";
	}
	
	@RequestMapping(path = "/editar/{id}")
	public String editarPersona(Model model, ProductModel producto, @PathVariable("id") String id) {
			Optional<ProductModel> product = pr.findById(producto.getId());
			
			ProductModel newProducto = product.get();
			newProducto.setId(product.get().getId());
			newProducto.setModelo(product.get().getModelo());
			newProducto.setFechaInstal(product.get().getFechaInstal());
			newProducto.setNumPedidoCli(product.get().getNumPedidoCli());
			newProducto.setNumRefCli(product.get().getNumRefCli());
			newProducto.setNombreCli(product.get().getNombreCli());
			newProducto.setDireccionCli(product.get().getDireccionCli());
			newProducto.setTlfnCli(product.get().getTlfnCli());
			newProducto.setCabina(product.get().getCabina());
			newProducto.setPuertaCabina(product.get().getPuertaCabina());
			newProducto.setPuertaPiso(product.get().getPuertaPiso());
			newProducto.setManiobra(product.get().getManiobra());
			newProducto.setBotoneras(product.get().getBotoneras());
			newProducto.setMotor(product.get().getMotor());
			newProducto.setChasisCabina(product.get().getChasisCabina());
			newProducto.setChasisContrapeso(product.get().getChasisContrapeso());
			newProducto.setGuiasCabina(product.get().getGuiasCabina());
			newProducto.setGuiasContrapeso(product.get().getGuiasContrapeso());
			newProducto.setCablesTraccion(product.get().getCablesTraccion());
			

			model.addAttribute("productos", newProducto);

		return "editar";
	}
	
	@PostMapping("/editarProducto")
	public String modificarProducto(ProductModel producto){
		pr.save(producto);
		return "redirect:/insercionCorrecta";
	}
	
	@RequestMapping(path = "/ver/{id}")
	public String verPersona(Model model, ProductModel producto, @PathVariable("id") String id) {
			Optional<ProductModel> product = pr.findById(producto.getId());
			
			ProductModel newProducto = product.get();
			newProducto.setId(product.get().getId());
			newProducto.setModelo(product.get().getModelo());
			newProducto.setFechaInstal(product.get().getFechaInstal());
			newProducto.setNumPedidoCli(product.get().getNumPedidoCli());
			newProducto.setNumRefCli(product.get().getNumRefCli());
			newProducto.setNombreCli(product.get().getNombreCli());
			newProducto.setDireccionCli(product.get().getDireccionCli());
			newProducto.setTlfnCli(product.get().getTlfnCli());
			newProducto.setCabina(product.get().getCabina());
			newProducto.setPuertaCabina(product.get().getPuertaCabina());
			newProducto.setPuertaPiso(product.get().getPuertaPiso());
			newProducto.setManiobra(product.get().getManiobra());
			newProducto.setBotoneras(product.get().getBotoneras());
			newProducto.setMotor(product.get().getMotor());
			newProducto.setChasisCabina(product.get().getChasisCabina());
			newProducto.setChasisContrapeso(product.get().getChasisContrapeso());
			newProducto.setGuiasCabina(product.get().getGuiasCabina());
			newProducto.setGuiasContrapeso(product.get().getGuiasContrapeso());
			newProducto.setCablesTraccion(product.get().getCablesTraccion());
			

			model.addAttribute("productos", newProducto);

		return "datosProducto";
	}
    
}
