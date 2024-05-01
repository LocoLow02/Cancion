import java.util.Scanner;
public class MainCan {

    
    public static void main(String[] args) {
       
        Cancion miCancion = new Cancion();
        
            Scanner leer=new Scanner(System.in);
            
            System.out.println("Ingrese el titulo de la cancion");
            miCancion.setTitulo(leer.next());
            System.out.println("Ingrese el autor");
            miCancion.setAutor(leer.next());
            System.out.println(miCancion.toString());
                
            miCancion.getTitulo();
            miCancion.getAutor();
           
            
    
       
            
        
        
    }
    
}
