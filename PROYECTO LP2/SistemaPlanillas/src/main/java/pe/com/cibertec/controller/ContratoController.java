package pe.com.cibertec.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import pe.com.cibertec.model.ContratoEntity;
import pe.com.cibertec.service.ContratoService;

@Controller
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @GetMapping("/")
    public String listarContratos(Model model) {
        List<ContratoEntity> listaContratos = contratoService.buscarTodosContratos();
        model.addAttribute("lst_contratos", listaContratos);
        return "listar_contratos";
    }

    @GetMapping("/detalle_contrato/{id}")
    public String detalleContrato(Model model, @PathVariable("id") Integer id) {
        ContratoEntity contratoEncontrado = contratoService.buscarContratoPorId(id);
        model.addAttribute("contrato", contratoEncontrado);
        return "detalle_contrato";
    }

    @GetMapping("/registrar_contrato")
    public String mostrarRegistrarContrato(Model model) {
        model.addAttribute("contrato", new ContratoEntity());
        return "registrar_contrato";
    }

    @PostMapping("/registrar_contrato")
    public String registrarContrato(@ModelAttribute("contrato") ContratoEntity contrato) {
        contratoService.crearContrato(contrato);
        return "redirect:/";
    }

    @GetMapping("/editar_contrato/{id}")
    public String mostrarEditarContrato(@PathVariable("id") Integer id, Model model) {
        ContratoEntity contratoEncontrado = contratoService.buscarContratoPorId(id);
        model.addAttribute("contrato", contratoEncontrado);
        return "editar_contrato";
    }

    @PostMapping("/editar_contrato/{id}")
    public String editarContrato(@PathVariable("id") Integer id, @ModelAttribute("contrato") ContratoEntity contrato) {
        contratoService.actualizarContrato(id, contrato);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String eliminarContrato(@PathVariable("id") Integer id) {
        contratoService.eliminarContrato(id);
        return "redirect:/";
    }
}