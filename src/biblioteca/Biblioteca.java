//FRANZ FONSECA VILLALOBOS
//SUSTENTACION PRACTICA 1
package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Libros Datos[] = new Libros[100]; 
        Scanner lector = new Scanner (System.in);
        int opc=0, contUs=0,band=0;  
        String name; 
         Datos[contUs] = new Libros();
        do{
            System.out.println("\nMENU PRINCIPAL"); 
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Actualizar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Buscar Libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una Opcion: ");
            opc = lector.nextInt();
            
            switch (opc) {
                case 1:
                    if (contUs<99){
                       
                        System.out.println("\nINGRESO DE LIBROS");
                        System.out.print("Digite el nombre del Libro: ");
                        Datos[contUs].setNombre(lector.next());
                        System.out.print("Digite el Autor: ");
                        Datos[contUs].setAutor(lector.next());
                        System.out.print("Digite el Año de publicacion del libro : ");
                        Datos[contUs].setAñodepublicacion(lector.next());
                        System.out.print("Digite Codigo del libro: ");
                        Datos[contUs].setCodigo(lector.next());
                        System.out.print("Digite Cantidad de libros: ");
                        Datos[contUs].setCantidad(lector.next());
                        System.out.print("Digite area de conocimiento: química, física, tecnología, cálculo o programación:");
                        Datos[contUs].setArea(lector.next());
                        
                      
                        contUs++;
                    }
                    else
                        System.out.println("NO HAY MAS MEMORIA");
                    break;
                case 2:
                        System.out.println("\nACTUALIZAR DATOS ");
                        System.out.print("Digite el nombre del libro a actualizar: ");
                        name = lector.next();
                        for (int i=0; i<contUs;i++){
                            if (name.equals(Datos[i].getNombre())){
                                band=1;
                                System.out.print("Digite Cantidad: ");
                                Datos[i].setCantidad(lector.next());                              
                                System.out.print("Digite el nombre del area de conocimiento: química, física, tecnología, cálculo o programación: ");
                                Datos[i].setArea(lector.next());  
                            }
                        }
                        if(band==0)
                            System.out.println("\nLibro NO ENCONTRADO");
                        else
                            band=0;             
                    break;
                case 3:
                        System.out.println("\nELIMINAR  Libro ");
                        System.out.print("Digite el nombre del Libro a eliminar: ");
                        name = lector.next();
                        for (int i=0; i<contUs;i++){
                            if (name.equals(Datos[i].getNombre())){
                                band=1;
                                System.out.println("Los Datos del Libro"+name+ "se han eliminado: ");
                                Datos[i].setNombre("");
                                Datos[i].setAutor("");
                                Datos[i].setAñodepublicacion("");
                                Datos[i].setCodigo("");
                                Datos[i].setCantidad("");
                                Datos[i].setArea("");
                                

                                 
                            }
                        }
                        if(band==0)
                            System.out.println("\nLibro NO ENCONTRADO");
                        else
                            band=0;  
                    break;
                case 4:
                      System.out.println("\nBUSCAR LIBRO ");
                        System.out.print("Digite el nombre del Libro a buscar: ");
                        name = lector.next();
                        for (int i=0; i<contUs;i++){
                            if (name.equals(Datos[i].getNombre())){
                                band=1;
                                System.out.println("Los Datos del Libro que busca son: ");
                                System.out.println("Nombre: "+Datos[i].getNombre());
                                 System.out.println("Autor: "+Datos[i].getAutor());
                                 System.out.println("Añodepublicacion de Nacimiento: "+Datos[i].getAñodepublicacion());
                                 System.out.println("Codigo: "+Datos[i].getCodigo());
                                 System.out.println("Cantidad: "+Datos[i].getCantidad());
                                  System.out.println("Area de conocimiento: "+Datos[i].getArea());
                                
                                 
                            }
                        }
                        if(band==0)
                            System.out.println("\nLibro NO ENCONTRADO");
                        else
                            band=0;   
                    break;
                case 5:
                    System.out.println("GRACIAS POR VISITARNOS");
                    break;
                default:
                    System.out.println("\nOPCION INCORRECTA!\n");
                    break;                              
            }
        }while(opc!=5);
    }    
    }
    

