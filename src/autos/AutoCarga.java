
public class AutoCarga extends Autos implements Girar, Carga, Aceleracion{

    public AutoCarga(){
        
    }
    public AutoCarga(int combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima, double aceleracionInicio){
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionInicio);

    }
    @Override
    public String acelerar() {
        return ("\n      - Su aceleracion es baja");
    }
    @Override
    public String carga() {
        return ("\n      - Permite transportar materiales");
    }
    @Override
    public void girarDerecha() {
        System.out.println("\n    El vehiculo giro hacia la derecha");
        
    }
    @Override
    public void girarIzquierda() {
        System.out.println("\n    El vehiculo giro hacia la izquierda");
        
        
    }
    @Override
    public String toString() {
        return super.toString() + "\n\n    * Descripcion: " + carga() + acelerar();
        
    }
    

    
    
}
