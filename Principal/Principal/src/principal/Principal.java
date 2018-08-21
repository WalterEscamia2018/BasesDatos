
package principal;
import java.util.Scanner;


public class Principal {
    
    private static Cliente miCliente[ ] = new Cliente[10];
    private static int cantFacturas[] = new int[10];
    private static Scanner entrada = new Scanner(System.in);
    private static int cantDetalles[] = new int[10];
    private static int i = 0;
    private static int numUnidades;
    private static int impuesto;
    
   
    private static int menu()
    {
        
        System.out.println("Ingrese la opcion 1 para agregar un cliente");
        System.out.println("Ingrese la opcion 2 para agregar una factura a un cliente");
        System.out.println("Ingrese la opcion 3 para ver los clientes registrados");
        System.out.println("Ingrese la opcion 4 para ver las facturas del cliente");
        System.out.println("Ingrese la opcion 0 para terminar");
        int opcion = entrada.nextInt();
        return opcion;
        
    }
    
    public static void mostrarClientes()
    {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Los clientes registrados en el sistema son");
        System.out.println("Nombre\tIdentidad\tDireccion");
        for (int i = 0; i < miCliente.length; i++ )
        {
            if ( miCliente[i] != null )
                System.out.println(miCliente[i].getNombre() + "\t" + miCliente[i].getIdentidad()
                + "\t" + miCliente[i].getDireccion());
        }
        System.out.println("-----------------------------------------------------------");
    }
 
    public static void mostrarArticulos(int indiceDelCliente)
    {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Las facturas del cliente "+ miCliente[indiceDelCliente].getNombre() + " en el sistema son");
        
        for ( int indiceFactura = 0; indiceFactura < cantFacturas[indiceDelCliente]; indiceFactura++ )
        {
            double total = 0;
            System.out.println("-----------------------------------------------------------");
            if ( miCliente[indiceDelCliente] != null )
            { 
                System.out.println(miCliente[indiceDelCliente].obtenerCodigoFactura(indiceFactura));
                System.out.println("Cantidad\tNombre\t\t" + "Precio Unitario\t\t"+"Valor de Venta");
                for (int indiceDetalle = 0; indiceDetalle < cantDetalles[indiceFactura]; indiceDetalle++)
                { System.out.println( 
                        miCliente[indiceDelCliente].obtenerNumUnidadesDeCliente(indiceFactura, indiceDetalle) + "\t\t" +
                        miCliente[indiceDelCliente].obtenerNombreArticuloDeCliente(indiceFactura, indiceDetalle) + "\t\t" +  
                        miCliente[indiceDelCliente].obtenerPrecioArticuloDeCliente(indiceFactura, indiceDetalle) + "\t\t\t" + 
                        miCliente[indiceDelCliente].obtenerValorDeVentaDeCliente(indiceFactura, indiceDetalle)); 
                
                        total += miCliente[indiceDelCliente].obtenerGranTotalDeCliente(indiceFactura, indiceDetalle)+
                                miCliente[indiceDelCliente].obtenerImpuestoTotalDeCliente(indiceFactura, indiceDetalle);
                }
                
                System.out.println( 
                        miCliente[2].obtenerNumUnidadesDeCliente(0, 1) + "\t\t" +
                        miCliente[2].obtenerNombreArticuloDeCliente(0, 1) + "\t\t" +  
                        miCliente[2].obtenerPrecioArticuloDeCliente(0, 1) + "\t\t\t" + 
                        miCliente[2].obtenerValorDeVentaDeCliente(0, 1));
                         
            }
            
           
        }
            
     
        System.out.println("-----------------------------------------------------------");
    }
    
    public static void muestra()
    {
        System.out.println( 
                        miCliente[0].obtenerNumUnidadesDeCliente(0, 0) + "\t\t" +
                        miCliente[0].obtenerNombreArticuloDeCliente(0, 0) + "\t\t" +  
                        miCliente[0].obtenerPrecioArticuloDeCliente(0, 0) + "\t\t\t" + 
                        miCliente[0].obtenerValorDeVentaDeCliente(0, 0)); 
        
      
        
        System.out.println( 
                        miCliente[1].obtenerNumUnidadesDeCliente(0, 0) + "\t\t" +
                        miCliente[1].obtenerNombreArticuloDeCliente(0, 0) + "\t\t" +  
                        miCliente[1].obtenerPrecioArticuloDeCliente(0, 0) + "\t\t\t" + 
                        miCliente[1].obtenerValorDeVentaDeCliente(0, 0)); 
        
        System.out.println( 
                        miCliente[2].obtenerNumUnidadesDeCliente(0, 0) + "\t\t" +
                        miCliente[2].obtenerNombreArticuloDeCliente(0, 0) + "\t\t" +  
                        miCliente[2].obtenerPrecioArticuloDeCliente(0, 0) + "\t\t\t" + 
                        miCliente[2].obtenerValorDeVentaDeCliente(0, 0)); 
        
        System.out.println( 
                        miCliente[2].obtenerNumUnidadesDeCliente(0, 1) + "\t\t" +
                        miCliente[2].obtenerNombreArticuloDeCliente(0, 1) + "\t\t" +  
                        miCliente[2].obtenerPrecioArticuloDeCliente(0, 1) + "\t\t\t" + 
                        miCliente[2].obtenerValorDeVentaDeCliente(0, 1));
        
        System.out.println( 
                        miCliente[2].obtenerNumUnidadesDeCliente(0, 2) + "\t\t" +
                        miCliente[2].obtenerNombreArticuloDeCliente(0, 2) + "\t\t" +  
                        miCliente[2].obtenerPrecioArticuloDeCliente(0, 2) + "\t\t\t" + 
                        miCliente[2].obtenerValorDeVentaDeCliente(0, 2));
        
        
    }

    
    public static void main(String[] args) {
        
        int num;
        
        do 
        {
            num = menu();
            
            switch(num)
            {
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese la identidad del cliente");
                    String identidad = entrada.nextLine();
                    System.out.println("Ingrese la direccion del clinte");
                    String direccion = entrada.nextLine();
                    Cliente cliente = new Cliente(nombre,identidad,direccion);
                    agregarCliente(cliente);
                  
                break;
                
                case 2:
                    System.out.println("Ingrese el indice del cliente al que le quiere agregar una factura");
                    int indice1 = entrada.nextInt();
                    entrada.nextLine();
                    cantFacturas[indice1]++;
                    System.out.println("Ingrese el codigo de la factura");
                    String codigo = entrada.nextLine();
                    Factura factura = new Factura(codigo);
                    miCliente[indice1].agregarFactura(factura);
                    System.out.println("Desea agregar un articulo a la factura ");
                    System.out.println("Ingrese Y/N");
                    String opcion2 = entrada.nextLine() ;
                    if (opcion2.equals("Y"))
                    {
                    System.out.println("Ingrese el impuesto de los articulos");
                    impuesto = entrada.nextInt();
                    }
                    
                    while ( opcion2.equals("Y") ){
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del articulo");
                    String nombreArticulo = entrada.nextLine();
                    System.out.println("Ingrese el precio del articulo");
                    double precio = entrada.nextDouble();
                    System.out.println("Ingrese el codigo del articulo");
                    String codigoArticulo = entrada.nextLine();
                    entrada.nextLine();
                    
                    System.out.println("Ingrese cuantas unidades va a llevar");
                    numUnidades = entrada.nextInt();
                    Articulo art = new Articulo(nombreArticulo,precio,codigoArticulo);
                    entrada.nextLine();
                    cantDetalles[i]++;
                    Detalle miDetalle = new Detalle(impuesto,numUnidades);
                    miDetalle.agregarArticulo(art);
                    factura.agregarDetalle(miDetalle);                
                    System.out.println("Ingrese Y/N");
                    opcion2 = entrada.nextLine() ;
                    
                    }
                    i++;
                break;
                
                case 3:
                    mostrarClientes();
                break;
                
                case 4:
                    System.out.println("Ingrese el indice de la persona a la cual quiere ver sus facturas");
                    int indice4 = entrada.nextInt();
                    mostrarArticulos(indice4);
                break;
                
                case 5:
                muestra();    
                break;
                
                
                
           
            }
            
        } while (num != 0);
        
        
    }
    
    private static void agregarCliente(Cliente cliente)
    {
        for ( int i = 0; i < miCliente.length;i++ )
        {
            if ( miCliente[i] == null )
            {
                miCliente[i] = cliente;
                break;
            }
        }
        
    }
    
}
