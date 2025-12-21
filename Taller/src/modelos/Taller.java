package modelos;

import java.util.ArrayList;
import java.util.Scanner;


public class Taller {

	private String direccion;
	private String nombre;
	private String tel;	
	private int campas;
	private int capacidad;
	
	private ArrayList<Coche> coches; // aqui lo instancio
	
	/*
	 * Constructor vacío con una capacidad y num de campas por defecto
	 */
	public Taller() {
			
		coches = new ArrayList<Coche>(); // aqui lo inicializo
		
		// total campas 
		campas = 10;
		capacidad = 50;
		
		}
	
	/**
	 * Constructor que obliga a pasar 2 parámetros
	 * @param numCampas numero de campas que es un entero
	 * @param capacidad es un entero
	 */
	public Taller(int numCampas, int capacidad) {
		
		coches = new ArrayList<Coche>(); // aqui lo inicializo
		
		// total campas disponibles
		this.campas = numCampas;
		this.capacidad = capacidad; 
	}
	
	// GETTERS & SETTERS
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getCampas() {
		return campas;
	}

	public void setCampas(int campas) {
		this.campas = campas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
	// Otros métodos de la clase 
	
	/*
	 * Método que añade un nuevo objeto coche a la lista de coches del taller
	 * Pide los atributos del coche por consola con Scanner()
	 */
	public void anadirCoche() {
    	
    	Scanner sc = new Scanner(System.in);
  
    	Coche auto = new Coche(); 
    	
    	System.out.print("Dame Marca: ");
    	
    	auto.setMarca(sc.nextLine());
    	
    	
     	System.out.print("Dame Modelo: ");
     	
    	auto.setModelo(sc.nextLine());
    	
    	
    	this.coches.add(auto);
    	
    	sc.close(); 
    }
	
	/*
	 * Añade un nuevo coche de la clase Coche a nuestro arraylist coches
	 */
	
	public void nuevoCoche(Coche c) {
			
		this.coches.add(c);
		
		}
		
	
	/**
	 * Recorre todos los objetos coche de la clase Coche y los devuelve
	 * separados por un salto de linea en un String
	 * @return string con la lista de coches
	 */
	public String verCoches() {
		
		String txt = "";
		
		for(Coche c : this.coches) {
			
			txt += c.toString() +"\n";
		} 
		
		return txt;
	}
	 
		
}
