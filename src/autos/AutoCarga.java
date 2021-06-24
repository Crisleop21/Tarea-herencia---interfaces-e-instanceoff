public class AutoCarga extends Autos implements Girar, Carga, Aceleracion{

    public AutoCarga(){
        
    }
    public AutoCarga(int combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima, double aceleracionInicio){
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionInicio);

    }
    @Override
    public String acelerar() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String carga() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void girarDerecha() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void girarIzquierda() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String toString() {
        return super.toString() + "\n\n    * Descripcion: " + carga() + acelerar();
        
    }

    
    
}
