public class Principal {
    public static void main(String[] args) {
        
        Principal principal = new Principal();
    }

    public Principal(){
        Autos[] autos = {new AutoCarga(), new AutoCarga(), new AutoCarga(),new AutoCarga(),
            new AutoCarga(), new AutoCarga(), new AutoCarrera(), new AutoCarrera(), 
            new AutoCarrera(),  new AutoCarrera(),  new AutoCarrera(),  new AutoCarrera(),
            new AutoCamionetas(), new  AutoCamionetas(), new  AutoCamionetas(), new  AutoCamionetas(),
            new  AutoCamionetas(), new  AutoCamionetas(), new AutoCarga(), new AutoCarrera()};

        imprimirAutos(autos);
    }
    
    public String tipoInstancia(Autos auto) {

        if (auto instanceof AutoCamionetas) {
            return " es una camioneta";
        } else if (auto instanceof AutoCarga) {
            return " es un vehiculo de carga";
        } else {
            return " es un auto de carreras";
        }

    }

    public void imprimirAutos(Autos[] autos) {

        for (int i = 0; i < autos.length; i++) {
            System.out.print("\n  El auto " + (i+1) + tipoInstancia(autos[i]));
            System.out.println(autos[i].toString());
            
        }
    }
}
