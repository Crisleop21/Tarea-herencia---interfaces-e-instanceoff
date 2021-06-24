public class AutoCarrera extends Autos implements Girar, Aceleracion  {

    public AutoCarrera(){

    }
    public AutoCarrera (int combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima, double aceleracionInicio ){
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionInicio);
        

    }
    @Override
    public String acelerar() {
        return ("\n      - Tiene turbo y puede triplicar la aceleracion base");
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
    public double getAceleracion() {
        return 3 * super.aceleracionInicio;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\n    * Descripcion: " + acelerar();
        
    }
    
}
