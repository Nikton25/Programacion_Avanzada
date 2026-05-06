import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Garage gar = new Garage(50);
    int opcion = 0;

    System.out.println("=== SISTEMA DE GARAGE ===");

    while(opcion!=0){
        System.out.println("\n1. Registrar ingreso");
        System.out.println("2. Registrar salida");
        System.out.println("3. Listar vehiculos");
        System.out.println("4. Estado del garage");
        System.out.println("5. Reportes");
        System.out.println("6. Salir");

        opcion = scan.nextInt();
        scan.nextLine();

        switch(opcion){
            case 1:
                try {
                    System.out.println("Ingresa el tipo de vehiculo");
                    String tipoVehiculo = scan.nextLine();
                    System.out.println("Ingresa la marca");
                    String marca = scan.nextLine();
                    System.out.println("Ingresa el modelo");
                    String modelo = scan.nextLine();
                    System.out.println("Ingresa la patente");
                    String patente = scan.nextLine();
                }
        }
    }




























































        }
}
