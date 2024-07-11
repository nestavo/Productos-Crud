package tramitar.modelo;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import jakarta.persistence.Id;

	@Data
	@Entity
	@Table (name ="Pedidos")
	@NoArgsConstructor
	@AllArgsConstructor
	public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
   
	
	private Long id;
	private String nombreCliente;
	private String direccion;
	private long telefono;
	private String [] nomproductos;
	private long [] cantidades;
	private long [] suma;
	private double Total;
	private Date fecha;
	
	
	
	}