package arreglobusquedadetemperatura;

import java.util.Scanner;

/**
 *
 * @author Luisa Lucio & Valentina Rubio
 */
public class ArregloBusquedaDeTemperatura {

    public static void main(String[] args) {
        double[] ArrayTemperaturas = new double[7];
        double temperatura, buscarTemperatura;
        boolean bandera= false;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingresa La Temperatura De La Semana: ");
        for (int i = 0; i< 7; i++){
            System.out.println("Día "+(i+1)+" De La Semana: ");
            ArrayTemperaturas[i]= sc.nextDouble();
        }
        
        int p;
        do{
            System.out.println("\n Menú De Opciones: ");
            System.out.println("1. Buscar Temperatura Específica");
            System.out.println("2. Calcular La Temperatura Promedio De La Semana");
            System.out.println("3. Mostrar Día Con La Temperatura Más Alta");
            System.out.println("4. Salir Del Menú De Opciones");
            System.out.println("\nElige Una De Las Opciones: ");
            
            p= sc.nextInt();
            
            switch (p) {
                case 1: 
                    System.out.println("Ingrese La Temperatura Que Desea Buscar: ");
                    buscarTemperatura = sc.nextDouble();
                    for(int i = 0; i <7 ; i++){
                        if (ArrayTemperaturas[i]== buscarTemperatura)
                            System.out.println("La Temperatura " +buscarTemperatura +" Fue Encontrada En El Día "+(i+1));
                        bandera= true;
                        break;                                              
                    }
                    if (!bandera) {
                        System.out.println("La Temperatura No Fue Encontrada En El Array");
                    }
                    break;
                
                case 2:
                    double temperaturaMaxima = ArrayTemperaturas[0];
                    int diaTemperaturaMaxima = 1;
                    for (int i = 1; i < 7; i++) {
                        if (ArrayTemperaturas[i] > temperaturaMaxima) {
                            temperaturaMaxima = ArrayTemperaturas[i];
                            diaTemperaturaMaxima = i + 1;
                        }
                    }
                    System.out.println("La temperatura más alta fue de " + temperaturaMaxima + "°C en el día " + diaTemperaturaMaxima);
                    break;
                    
                case 3:
                    double suma = 0;
                    for (double temp : ArrayTemperaturas) {
                        suma += temp;
                    }
                    double promedio = suma / 7;
                    System.out.println("El promedio de las temperaturas de la semana es: " + promedio + "°C");
                    break;
                    
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Esta Opcion No Esta Disponible. Elige Una De Las Opciones Mostradas En Pantalla");
            }
            
        } while (p != 4);
        
        sc.close();
    }
}
