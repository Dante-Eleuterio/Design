import java.util.*;

public class Seguro {
    private String idSeguro;

    public Seguro() {
        // Constructor logic here
    }

    // Getters and Setters
    public String getIdSeguro() { 
        return idSeguro; 
    }
    
    public void setIdSeguro(String idSeguro) { 
        this.idSeguro = idSeguro; 
    }

    // Additional methods
    public static Seguro create() {
        // Static factory method logic
        return new Seguro();
    }
}
