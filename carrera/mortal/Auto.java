package carrera.mortal;
import java.util.Scanner;

public class Auto {
    private String patente;
    private String color;
    private double combustible=50;
    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    Scanner leer= new Scanner(System.in); 
    public void avanzar(){
        System.out.println("Cuanto desea avanza?");
        int metros = leer.nextInt();
        if (metros<=combustible){combustible -= metros/10;
        System.out.println("Se avanzó "+metros+" metros");
    }else{System.out.println("No hay suficiente combustible");};}
    public void retroceder(){
        System.out.println("Cuanto desea retroceder?");
        int metros = leer.nextInt();
        if (metros<=combustible){combustible -= metros/10;
        System.out.println("Se retrocedio "+metros+" metros");
    }else{System.out.println("No hay suficiente combustible");};}
    public void llenarTanque(){combustible=50;
        System.out.println("Tanque lleno nuevamente!");};
}
