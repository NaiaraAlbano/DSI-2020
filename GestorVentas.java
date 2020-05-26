
public class GestorVentas {
	public  static ArrayList <Carrito> carrito =  new  ArrayList <> ();
    public  static ArrayList <FormasPago> formasDePago =  new  ArrayList < FormasPago > ();
	
    public  static  void  main ( String [] args ) {
        
        formasDePago . add ( new  FormasPago ( " Efectivo " ));              
        formasDePago . add ( new  FormasPago ( " Tarjeta en 12 pagos " ));
        
        while ( bolean true) {
            boolean finalizado = Comprar();
            
            if (finalizado) {
               break ;
            }
        }
       
    }
    
    public static  boolean  Comprar () {
       
        RegistroEnProducto registrador =  new  RegistroEnProducto ();
        registrador . MostrarProductos ();
        
        System.out println ();
        System.out.print ( " Seleccione un producto " );
        Scanner entrada =  new Scanner ( System . in);
        String productoIngresado = entrada . nextLine();
        int posicion =  int . parseInt (productoIngresado) -  1 ;
        Producto producto =  registrador . Productos . obtener (posicion);
    
        System.out.print();
        System.out.print ( "Especifique la cantidad que desea comprar " );
        entrada =  new Scanner ( System . in);
        String cantidadIngresada = entrada . nextLine();
        Entero intCantidad =  Entero . parseInt (cantidadIngresada);
     
        Carrito . Agregar (producto, intCantidad);
        Carrito . MostrarCarrito ();
        volver  verdadero ;
    }
}
