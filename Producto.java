
public class Producto {
	public static String Nombre ;
    public static double Precio   ;
    public static String Marca ;

    public Producto ( String  nombre , double  precio , String  marca ){
      this . Nombre  = nombre;
      this . Precio  = precio;
      this . Marca  = marca;
   }

   public  String  getNombre () {
           return  Nombre ;
   }
   public  void  setNombre ( String  nombre ) {
           Nombre  = nombre;
   }
   public  double  getPrecio () {
           return  Precio ;
   }
   public  void  setPrecio ( double  precio ) {
           Precio  = precio;
   }
   public  String  getMarca () {
           return  Marca ;
   }
   public  void  setMarca ( String  marca ) {
           Marca  = marca;
   }

}
