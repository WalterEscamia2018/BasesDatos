
package principal;


public class Detalle {

    private Articulo miArticulo;
    private int cantArticulos = 0;
    private double ValorDeVenta = 0;
    public double impuestoSumaTotal = 0;
    private double granTotal = 0;
    private int impuesto;
    private int numUnidades;
    
    public Detalle(int impuesto, int numUnidades)
    {
        this.impuesto = impuesto;
        this.numUnidades = numUnidades;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void agregarArticulo(Articulo articulo)
    {
        miArticulo = articulo;
        establecerValorDeVenta(miArticulo,numUnidades);
        cantArticulos++;
        
    }
    
    public void establecerValorDeVenta( Articulo miArticulo, int numUnidades )
    {
        ValorDeVenta += miArticulo.getPrecio() * numUnidades;
        calcularImpuestoTotal();
        
    }
    
    public double getValorDeVenta()
    { return ValorDeVenta;}
            
    public void calcularImpuestoTotal( )
    {
      impuestoSumaTotal = ( ValorDeVenta * impuesto) / 100 ;
      establecerGranTotal(impuestoSumaTotal, ValorDeVenta);
    }
    
    public double obtenerImpuestoTotal()
    { return impuestoSumaTotal; }
    
    public void establecerGranTotal(double impuestoSuma, double ValorDeVenta)
    { granTotal = (impuestoSuma + ValorDeVenta); }
    
    public double obtenerGranTotal()
    { return granTotal; }
  
    public String obtenerNombreArticuloDeDetalle()
    { return miArticulo.getNombreArticulo(); }
    
      
    public double obtenerPrecioArticuloDeDetalle()
    { return miArticulo.getPrecio(); }
    
    
    public String obtenerCodigoArticuloDeDetalle()
    { return miArticulo.getCodigo(); }
    
    
    
   
            
    
}
