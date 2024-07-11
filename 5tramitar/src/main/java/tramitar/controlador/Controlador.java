package tramitar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tramitar.interfa.Interfa;
import tramitar.modelo.Modelo;


@RestController
@RequestMapping("/pedidos")
public class Controlador {

@Autowired
private Interfa ped;

@GetMapping("/listape")
@CrossOrigin(origins = "http://127.0.0.1:3000")
public List<Modelo> listarPedidos() {
return ped.findAll();

}

@PostMapping("/crearPedido")
@CrossOrigin(origins = "http://127.0.0.1:3000")
public Modelo crearPedido(@RequestBody Modelo pedido) {
    return ped.save(pedido);
}

}