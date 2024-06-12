import jdk.swing.interop.SwingInterOpUtils;

public class EjemploAutomovil {
    public static void main(String[] args) {

//objeto estableciendo los atributos son sets
        
        Automovil auto = new Automovil();

        auto.setColor(Color.GRIS);
        auto.setFabricante("subaru");
        auto.setModelo("Impreza");
        auto.setCilindrada(2.0);

        Automovil auto2 = new Automovil();
        auto2.setColor(Color.NARANJA);
        auto2.setFabricante("MAZDA");
        auto2.setModelo("BT-50");
        auto2.setCilindrada(4.0);

// ejemplo de un objeto poniendo sus atributos desde el constructor

        Automovil auto3 = new Automovil("toyota","nose",Color.BLANCO,2.0,60);

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());
        System.out.println(auto2.acelerar(5000));
        System.out.println(auto2.frenar());


        System.out.println(auto.acelerarFrenar(3000));
        System.out.println(auto2.acelerarFrenar(5000));

        System.out.println("kilometros por litro: " + auto.calcularCosumo(300,0.75f));
        System.out.println("kilometros por litro: " + auto2.calcularCosumo(400,50));
        System.out.println("kilometros por litro: " + Automovil.calcularConsumoEstatico(300,400));
        System.out.println("Automovil color de pantente: " + Automovil.getColorPatente());
    }
}
