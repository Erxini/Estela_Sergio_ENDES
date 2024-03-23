package itsfreaky;

/**
 *
 * @author Luis Miguel Morales
 */
public class ItsFreaky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("##########################################");
        System.out.println("EJEMPLO 1: Pruebas de cubrimiento (DAM/DAW)");
        System.out.println("##########################################");
        
        // Prueba de caso de uso número 1
        System.out.println("Salida:");
        System.out.println(isFreaky(1,1,1));
        
        // Prueba de caso de uso número 2
        System.out.println("Salida:");
        System.out.println(isFreaky(0,0,1));
        
          // Prueba de caso de uso número 3
        System.out.println("Salida:");
        System.out.println(isFreaky(0,1,0));
        
          // Prueba de caso de uso número 4
        System.out.println("Salida:");
        System.out.println(isFreaky(1,0,0));
      
      
    }

    /**
     * Método que nos devuelve si una persona es Freak o no, dependiendo de si le gustan
     * los videojuegos, el manga y la tecnología.
     * 
     * @param videogames
     * @param manga
     * @param technology
     * @return 1 o 0 dependiendo de si la persona es Freaky o no lo es.
     */
    public static int isFreaky(int videogames, int manga, int technology) {
        if (videogames > 0) {
            if (manga > 0) {
                if (technology > 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

