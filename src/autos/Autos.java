public abstract class Autos {

    protected int combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima;
    protected double aceleracionInicio;

    public Autos(){
        
    }
    //constructor
    public Autos(int combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima, double aceleracionInicio) {
        this.combustible = combustible;
        this.cantidadGalones = cantidadGalones;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionInicio = aceleracionInicio;
    }


    
    

    
     @Override
    public String toString() {
        return "Autos [aceleracionInicio=" + aceleracionInicio + ", cantidadGalones=" + cantidadGalones
                + ", cantidadPasajeros=" + cantidadPasajeros + ", combustible=" + combustible + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }






    //getters and setters
    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        if (combustible<0) {
            this.combustible = combustible;
            System.out.println("El auto esta sin combustible"+this.toString());
            
        }
        else{
            this.combustible = combustible;

        }
        
    }



    public int getCantidadGalones() {
        return cantidadGalones;
    }
    public void setCantidadGalones(int cantidadGalones) {
        this.cantidadGalones = cantidadGalones;
    }
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getAceleracion() {
        return aceleracionInicio;
    }
    public void setAceleracion(double aceleracion) {
        this.aceleracionInicio = aceleracion;
    }
    
}