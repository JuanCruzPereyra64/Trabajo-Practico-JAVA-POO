public class Planeta {
    private String nombre = null;
    private int cant_satelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diameto = 0;
    private int distancia_sol = 0;
    private boolean observable = false;
    enum Tipo_planeta {
        GASEOSO, TERRESTRE, ENANO
    };
    private int periodo_orbital = 0;
    private int periodo_rotacion = 0;
    private Tipo_planeta tipo_planeta;


    public Planeta(String nombre, int cant_satelites, double masa, double volumen, int diameto, int distancia_sol, boolean observable, Tipo_planeta tipo_planeta, int periodo_orbital, int periodo_rotacion){
        this.nombre = nombre;
        this.cant_satelites = cant_satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diameto = diameto;
        this.distancia_sol = distancia_sol;
        this.observable = observable;
        this.tipo_planeta = tipo_planeta;
        this.periodo_orbital = periodo_orbital;
        this.periodo_rotacion = periodo_rotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_satelites() {
        return cant_satelites;
    }

    public void setCant_satelites(int cant_satelites) {
        this.cant_satelites = cant_satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiameto() {
        return diameto;
    }

    public void setDiameto(int diameto) {
        this.diameto = diameto;
    }

    public int getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public void mostrar_datos(){
        System.out.println("Nombre: " + nombre + ", " + " Cant de Satelites: " + cant_satelites + ", " + " Masa: " + masa + "kg, " + " Volumen: " + volumen + "km cúbicos, " + " Diametro " + diameto + "km, " + " Distancia al Sol " + distancia_sol + "km, " + " Observable " + observable + ", " + " Tipo de Planeta: " + tipo_planeta + ", " + " Periodo Orbital: " + periodo_orbital + " Años " + ", " + " Periodo Rotacional: " + periodo_rotacion + " Dias");
    }

    public static double calcular_densidad(double masa, double volumen) {
        double total = 0.0;

        total = masa / volumen;

        return  total;
    }
    public boolean exterior_interior(double distancia_sol){
        double mas_alla =  3.100;
        boolean exterior = false;

        if(distancia_sol > mas_alla){
            exterior = true;
        } else if (distancia_sol <= mas_alla){
            exterior = false;
        }
        return exterior;
    }
}
