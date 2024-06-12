public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadTanque = 40;

    private static Color colorPatente = Color.AZUL;
    private static float capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;

    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;


    public Automovil () {this.id = ++ultimoId;}


    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public int getId() {
        return id;
    }

    public static float getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static int getUltimoId() {
        return ultimoId;
    }


    public void setId(int id) {
        this.id = id;
    }


    public static void setCapacidadEstanqueEstatico(float capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCilindrada() {

        return cilindrada;
    }

    public int getCapacidadTanque() {

        return capacidadTanque;
    }

    public void setFabricante(String fabricante) {

        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }


    public void setCilindrada(double cilindrada) {

        this.cilindrada = cilindrada;
    }


    public void setCapacidadTanque(int capacidadTanque) {

        this.capacidadTanque = capacidadTanque;
    }

    public String verDetalle() {
        return  "*************************************" +
                "\nAuto id: " + this.id +
                "\nfabricante: " + this.fabricante +
                "\nModelo: " + this.modelo +
                "\nColor: " + this.color +
                "\nColor patente: " + colorPatente+
                "\nCilindrada: " + this.cilindrada +
                "\n*************************************";

    }

    public String acelerar (int rpm){

        return "el auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){

        return fabricante + " " + modelo + " frenando! ";
    }

    public String acelerarFrenar (int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar +"\n" + frenar;
    }

    public float calcularCosumo (int km,float porcentajeBencima){
        return km / (porcentajeBencima * this.capacidadTanque);
    }

    public float calcularCosumo (int km,int porcentajeBencima){
        return km /((porcentajeBencima/100f)* this.capacidadTanque);
    }

    public static float calcularConsumoEstatico(int km,int porcentajeBencima){
        return km/(Automovil.capacidadEstanqueEstatico = (porcentajeBencima/100f));
    }



    @Override
    public boolean equals(Object obj){

        if ( this == obj) {
            return true;
        }
        if(!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }

}

