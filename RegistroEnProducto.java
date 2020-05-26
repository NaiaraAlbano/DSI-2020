import  java.util.ArrayList ;
public class RegistroEnProducto {
	public  static  ArrayList < Producto > Productos =  new  ArrayList < Producto > ();
    Producto producto1 =  new Producto (" Cafetera ", 3000 ," Philips ");
    
      public RegistroEnProducto(){                    
        
        Productos . add (producto1);
        
        Productos . add (new Producto  ( " Celular " , 249999.99 , " Apple " ));
        Productos . add (new Producto   ( " Televisor " , 22000 , " Sony " ));
        Productos . add (new Producto   ( " Ojotas " , 700 , " Havaianas " ));
        Productos . add (new Producto   ( " Teclado " , 6500.99 , " Razer " ));
    }
    public static void MostrarProductos () {			 
        System.out.print ( " TIENDA ABIERTA " );
        System.out.print ( " Listado de productos: " );
        int pos =  1 ;
        for ( Producto tema :  Productos ) {
            System.out.println ();
            System.out.print (pos +  " - "  +  Producto.Nombre  +  "  "  +Producto.Marca  +  " $ "  +  Producto.Precio );
            pos ++ ;
        }
}

}
