public class Autos {
    private int combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima;
    double aceleracion;

    //constructor
    public Autos(int combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima, double aceleracion) {
        this.combustible = combustible;
        this.cantidadGalones = cantidadGalones;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(aceleracion);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + cantidadGalones;
        result = prime * result + cantidadPasajeros;
        result = prime * result + combustible;
        result = prime * result + velocidadMaxima;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Autos other = (Autos) obj;
        if (Double.doubleToLongBits(aceleracion) != Double.doubleToLongBits(other.aceleracion))
            return false;
        if (cantidadGalones != other.cantidadGalones)
            return false;
        if (cantidadPasajeros != other.cantidadPasajeros)
            return false;
        if (combustible != other.combustible)
            return false;
        if (velocidadMaxima != other.velocidadMaxima)
            return false;
        return true;
    }

    public double modificadorAceleracion(Autos aceleracion){
        

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
        return aceleracion;
    }
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    
}