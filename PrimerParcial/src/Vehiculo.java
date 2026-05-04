public abstract class Vehiculo implements Calculable {

    protected String marca;
    protected String modelo;
    protected String patente;
    protected int valorHora;
    protected int horasEstimadas;
    protected Estadia estadia;
    protected int espacio;
    protected String tipoVehiculo;


    public Vehiculo(String marca, String modelo, String patente, int horasEstadia) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public Estadia getEstadia() {
        return estadia;
    }
    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public double calcularTarifa(int horas) {
        double calculo = horas * horasEstimadas;
        return calculo;
    }

    public abstract int getEspacio();

    public abstract String getTipoVehiculo();







}
