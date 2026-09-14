

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pedimos los datos  
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la marca del carro utilizado: ");
        String carro = scanner.nextLine();

        System.out.print("Ingrese el kilometraje del carro: ");
        String kilometraje = scanner.nextLine();

        //archivo txt donde se guardaran los datos
        String nombreArchivo = "registro.txt";

        //se utiliza el try catch para que al ejecutarlo y todo salga bien el progrma se cierre automaticamente y si hubo algun error pasa a la excepcion
        //escribimos en el archivo cada que el codigo se ejecute
        //con el filewriter podemos escribir pero solo en linea recta en cambio al agregar el printwriter podemos hacer que escriba en lineas con mas orden
        try (FileWriter fileWriter = new FileWriter(nombreArchivo, true); 
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            //forma en como se escribiran los datos en el archivo txt
            printWriter.println("__Registro__");
            printWriter.println("Nombre del usuario: "+nombre);
            printWriter.println("Carro: "+carro);
            printWriter.println("Kilometraje: "+kilometraje+" km");
            printWriter.println("\n");
            
            //si no ocurre ningun error sale este aviso en la consola cuando el dato se haya guardado correctamente
            System.out.println("\nDatos guardados exitosamente en el archivo ("+nombreArchivo+")");

        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}