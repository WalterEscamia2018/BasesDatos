
package principal;


public class Cliente extends Persona {
    
    private Factura miFactura [] = new Factura [10];
    private int cantFactura[] = new int[10];
    
    public Cliente(String nombre,String identidad, String direccion )
    {
        super(nombre,identidad,direccion);

    }

    public void agregarFactura(Factura factura)
    {
        for ( int i = 0; i < miFactura.length;i++ )
        {
            if ( miFactura[i] == null )
            {
                miFactura[i] = factura;
                cantFactura[i]++;
                break;
            }
        }
        
    }

    public String obtenerCodigoFactura(int i)
    { return miFactura[i].getCodigo(); }
    
    public double obtenerValorDeVentaDeCliente(int indiceDeFactura, int indiceDelDetalle )
    { return miFactura[indiceDeFactura].obtenerValorDeVentaDeFactura(indiceDelDetalle); }
    
    public int obtenerNumUnidadesDeCliente(int indiceDeFactura, int indiceDelDetalle )
    { return miFactura[indiceDeFactura].obtenerNumUnidadesDeFactura(indiceDelDetalle);}
    
    public int obtenerImpuestoDeCliente(int indiceDeFactura, int indiceDelDetalle )
    { return miFactura[indiceDeFactura].obtenerImpuestoDeFactura(indiceDelDetalle);}
    
     public double obtenerImpuestoTotalDeCliente(int indiceDeFactura, int indiceDelDetalle )
    { return miFactura[indiceDeFactura].obtenerImpuestoTotalDeFactura(indiceDelDetalle);}
    
    public double obtenerGranTotalDeCliente(int indiceDeFactura, int indiceDelDetalle )
    { return miFactura[indiceDeFactura].obtenerValorDeVentaDeFactura(indiceDelDetalle);}
    
    
    public String obtenerNombreArticuloDeCliente(int indiceDeFactura, int indiceDelDetalle)
    {return miFactura[indiceDeFactura].obtenerNombreArticuloDeFactura(indiceDelDetalle); }
    
    public double obtenerPrecioArticuloDeCliente(int indiceDeFactura, int indiceDelDetalle)
    {return miFactura[indiceDeFactura].obtenerPrecioArticuloDeFactura(indiceDelDetalle); }
    
    public String obtenerCodigoArticuloDeCliente(int indiceDeFactura, int indiceDelDetalle)
    {return miFactura[indiceDeFactura].obtenerCodigoArticuloDeFactura(indiceDelDetalle); }
    
   
    
}
