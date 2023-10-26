package oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Integer> numerosDisponibles;
	private List<Llamada> llamadas;
	private List<Cliente> clientes;
	
	public Sistema() {
		numerosDisponibles = new ArrayList<Integer>();
		llamadas = new ArrayList<Llamada>();
		clientes = new ArrayList<Cliente>();
	}
	
	//Agregar un número a la lista de números disponibles
	public void agregarNumero(int numero) {
		this.numerosDisponibles.add(numero);
	}
	
	//Dar de alta como cliente a una persona física (un individuo)
	public Cliente agregarPersonaFisica(String nombre,String direccion,int DNI) {
		PersonaFisica persona = new PersonaFisica(nombre, direccion,DNI,'F'); //asi? o seria Cliente persona = new PersonaFisica.. ?
		clientes.add(persona);
		
		int numero = this.numerosDisponibles.remove(0); //saco el de la primera posicion 
		persona.agregarNumero(numero);		
		
		return persona;
	}
	
	//Dar de alta como cliente a una persona jurídica (empresa, organismo, asociación,etc,)
	public Cliente agregarPersonaJuridica(String nombre,String direccion,int CUIL, String tipo) {
		PersonaJuridica persona = new PersonaJuridica(nombre, direccion,CUIL,tipo,'J');
		clientes.add(persona);
		
		int numero = this.numerosDisponibles.remove(0);
		persona.agregarNumero(numero);		
		
		return persona;
	}
	
	//Registrar una llamada local.
	public Llamada registrarLlamadaLocal (LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe) {
		LlamadaLocal llamada = new LlamadaLocal(fecha,hora,duracion,numeroLlama,numeroRecibe); //asi? o seria Llamada call = new LlamadaLocal..?
		llamadas.add(llamada);
		return llamada;
	}
	
	//Registrar una llamada interurbana
	public Llamada registrarLlamadaInterurbana (LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe,double distancia) {
		LlamadaInterurbana llamada = new LlamadaInterurbana(fecha,hora,duracion,numeroLlama,numeroRecibe,distancia);
		llamadas.add(llamada);
		return llamada;
	}
	
	//Registrar una llamada internacional.
	public Llamada registrarLlamadaInternacional (LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe,String origen, String destino) {
		LlamadaInternacional llamada = new LlamadaInternacional(fecha,hora,duracion,numeroLlama,numeroRecibe,origen,destino);
		llamadas.add(llamada);
		return llamada;
	}
	
	//Facturar las llamadas de un cliente.
	public Factura facturarLlamadasCliente(Cliente cliente, LocalDate desde, LocalDate hasta) {
		List<Llamada> llamadasCliente = llamadas.stream().filter(l -> l.llamadasDeCliente(cliente.getNumero())).collect(Collectors.toList());
		if (llamadasCliente.isEmpty()) {
			System.out.println("Vacia!");
		}
		double monto = llamadasCliente.stream().mapToDouble(l -> l.costoPorLlamada()).sum();
		double descuento = monto * 0.10;
		monto = monto - descuento;
		Factura factura = new Factura (cliente,LocalDate.now(),desde,hasta,monto);
		return factura;

	}

	public List<Integer> getNumerosDisponibles() {
		return numerosDisponibles;
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	
	
}
