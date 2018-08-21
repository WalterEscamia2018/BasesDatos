
package principal;


public class Factura {
    private String codigo;
    private Detalle miDetalle [] = new Detalle[10];
    private int cantDetalle [] = new int [10];

    public Factura(String codigo) {
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void agregarDetalle(Detalle detalle)
    {
        for ( int i = 0; i < miDetalle.length;i++ )
        {
            if ( miDetalle[i] == null )
            {
                miDetalle[i] = detalle;
                cantDetalle[i]++;
                break;
            }
        }
        
    }
    
    public double obtenerValorDeVentaDeFactura(int indiceDelDetalle)
    { return miDetalle[indiceDelDetalle].getValorDeVenta();}
    
    public int obtenerNumUnidadesDeFactura(int indiceDelDetalle)
    { return miDetalle[indiceDelDetalle].getNumUnidades();}
    
     public int obtenerImpuestoDeFactura(int indiceDelDetalle)
    { return miDetalle[indiceDelDetalle].getImpuesto();}
     
    public double obtenerImpuestoTotalDeFactura(int indiceDelDetalle)
    { return miDetalle[indiceDelDetalle].obtenerImpuestoTotal(); }
    
    public double obtenerGranTotalDeFactura(int indiceDelDetalle)
    { return miDetalle[indiceDelDetalle].obtenerGranTotal(); }
    

    public String obtenerNombreArticuloDeFactura(int indiceDelDetalle)
    { return miDetalle[indiceDelDetalle].obtenerNombreArticuloDeDetalle(); }
    
    public double obtenerPrecioArticuloDeFactura(int indiceDelDetalle)
    {return miDetalle[indiceDelDetalle].obtenerPrecioArticuloDeDetalle(); }
    
    public String obtenerCodigoArticuloDeFactura(int indiceDelDetalle)
    {return miDetalle[indiceDelDetalle].obtenerCodigoArticuloDeDetalle(); }
    
   
}
