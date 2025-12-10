package modelo;

public enum Faccion {
    
	// Le he pedido un poco de ayuda a gemini para implementar esto pero me hacia ilusion
	// no sé si la habré liado parda la verdad
	
    TIERRA("Tierra"),
    MARTE("Marte"),
    CINTURON("Cinturón"); 

    // Atributo privado para guardar el nombre de visualización
    private final String nombreVisible;

    // Constructor del ENUM (solo puede ser privado)
    Faccion(String nombreVisible) {
        this.nombreVisible = nombreVisible;
    }

    // Método público para obtener el nombre visible
    public String getNombreVisible() {
        return nombreVisible;
    }
    
    
}
