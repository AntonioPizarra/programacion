public class Factura{
    public static void main(String[] args) { 

        double preciobase ;
        preciobase = 26.76 ;

        int iva ;
        iva = 21 ;

        double precioiva ;
        precioiva = preciobase*iva/100 ;

        System.out.println("Base imponible "+preciobase) ;
        System.out.println("IVA            "+precioiva) ;
        System.out.println("--------------------") ;
        System.out.println("Total          "+(preciobase+precioiva)) ;
    }
}