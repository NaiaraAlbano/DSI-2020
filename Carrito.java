import  java.util.ArrayList ;
import  java.math.BigDecimal ;


public class Carrito {
public  static ArrayList <ProductoEnCarrito> Productos =  new  ArrayList < ProductoEnCarrito > ();
	
    public static void  Agregar ( Producto  producto , int  cantidad ) {
        
        ProductoEnCarrito prodEnCarrito =  new  ProductoEnCarrito ();
        prodEnCarrito . Producto = producto;
        prodEnCarrito . Cantidad = cantidad;

        Productos . add (prodEnCarrito);	
    }
    
    public static void  MostrarCarrito ()
        {
            System.out.print ( " " );
            System.out.print ( " Tienes en tu carrito: " );

            double totalCarrito = 0.0 ;
          
            for ( ProductoEnCarrito producto :  Productos ) {
            
                int Número  =  producto . Cantidad ;
                double Precio  =  articulo . Producto . Precio ;
                String nombre =  elemento . Producto . Nombre ;
                System.out.print (cantidad +  " x "  + nombre +  " $ "  + cantidad * precio);

                totalCarrito = + cantidad * precio;
            }

            System.out.print ( " Total: $ "  + totalCarrito);
        }

}
