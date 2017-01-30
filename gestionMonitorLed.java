public class gestionMonitorLed {

  public static void main (String[] args) {
    int i;
    int j;
    String[][] table = new String[9][5];
  
    for (i = 0; i < table.length; i++) {
      
      for (j = 0; j < table[0].length; j++) {
        table[i][j] = "vacio";
      }
    }
    table[0][0] = "K192HQLB";
    table[0][1] = "89€";
    table[0][2] = "1366x768";
    table[0][3] = "Acer";
    table[0][4] = "LED";
    

    
    int respuestai;
    int respuestaj;
    
    int opcion;
    
    String respuesta;
    String e = "";
    
    
    
    do {
      System.out.println("+------------------------+");
      System.out.println("|Gestión de monitores LED|");
      System.out.println("+------------------------+");
     
      System.out.println("¿Qué desea hacer?");
      System.out.println("1 - Añadir producto");
      System.out.println("2 - Modificar producto");
      System.out.println("3 - Eliminar producto");
      System.out.println("4 - Listar productos");
      System.out.println("5 - Salir");
      System.out.println();
      System.out.print("Table [MonitorLED]> ");
      opcion = Integer.parseInt(System.console().readLine());
    
      if (opcion == 1) {
        i = 0;
  
          while (table[i][0] != "vacio" || i < table.length) {
            i++;
          }
          
          if (i < table.length) {
            System.out.print("Modelo: ");
            respuesta = System.console().readLine();
            table[i][0] = respuesta;
            
            System.out.print("Precio: ");
            respuesta = System.console().readLine();
            table[i][1] = respuesta;
            
            System.out.print("Resolución: ");
            respuesta = System.console().readLine();
            table[i][2] = respuesta;
            
            System.out.print("Marca: ");
            respuesta = System.console().readLine();
            table[i][3] = respuesta;
            
            System.out.print("Tipo: ");
            respuesta = System.console().readLine();
            table[i][4] = respuesta;
            
            System.out.print("Producto añadido, pulse enter para continuar...");
        } else {
          System.out.print("La tabla está llena, pulse enter para continuar...");
        }
          e = System.console().readLine();
          clearScreen();
          
          
      } 
      
      if (opcion == 2) {
        System.out.print("¿Qué producto desea modificar?: ");
        respuestai = Integer.parseInt(System.console().readLine());
        
        
        if (table[respuestai][0] != "vacio") {
          
          muestraFilaArray(table, respuestai);
            
          System.out.println("¿Qué quiere modificar?");
          System.out.println("0 - Modelo");
          System.out.println("1 - Precio");
          System.out.println("2 - Resolución");
          System.out.println("3 - Marca");
          System.out.println("4 - Tipo");
          respuestaj = Integer.parseInt(System.console().readLine());
          
          System.out.print("Dato nuevo: ");
          respuesta = System.console().readLine();
          
          table[respuestai][respuestaj] = respuesta;
          System.out.print("Dato modificado, escriba mostrar si desea visualizarlo\n-> ");
          
          e = System.console().readLine();
          
        
        if (e.equals("mostrar")) {
          clearScreen();
          muestraArray(table);
          System.out.print("Pulse enter para continuar...");
          e = System.console().readLine();
        }
        
        
        } else {
          System.out.print("Este elemento está vacio, pulse enter para continuar...");
          e = System.console().readLine();

          
        }
        clearScreen();
      }
      
      if (opcion == 3) {
        muestraArray(table);
          System.out.println("¿Qué elemento desea eliminar");
          System.out.print("fila: ");
          respuestai = Integer.parseInt(System.console().readLine());
          
          if (table[respuestai][0] != "vacio") {
            for (j = 0; j < table[0].length; j++) {
              table[respuestai][j] = "vacio";
            }
            
            System.out.print("Producto eliminado, pulse enter para continuar...");
            
          } else {
            System.out.print("Este elemento ya está vacío, pulse enter para continuar...");
          }
          
          e = System.console().readLine();
          clearScreen();
      }
      
      if (opcion == 4) {
        clearScreen();
        muestraArray(table);
        System.out.print("Pulse enter para continuar...");
        e = System.console().readLine();
        clearScreen();
      }
      
    } while (opcion != 5);
    
  }
  public static void muestraArray(String[][] array) {
    int i = 0;
    int j = 0;
    
    
    System.out.println("  +----------------+----------------+----------------+----------------+----------------+");
    System.out.println("  |     Modelo     |     Precio     |   Resolución   |     Marca      |      Tipo      | ");
    System.out.println("  +----------------+----------------+----------------+----------------+----------------+");
          
      for (i = 0; i < array.length; i++) {
        
        if (array[i][0] != "vacio") {
              System.out.printf("%s ", i);
          for (j = 0; j < array[0].length; j++) {
              System.out.printf("| %-15s", array[i][j]);
          }
         System.out.println("|");
        }       
      }
    System.out.println("  +----------------+----------------+----------------+----------------+----------------+");
   
  }
  
  public static void muestraFilaArray (String[][] array, int i) {
    
    System.out.println("+----------------+----------------+----------------+----------------+----------------+");
    System.out.println("|     Modelo     |     Precio     |   Resolución   |     Marca      |      Tipo      | ");
    System.out.println("+----------------+----------------+----------------+----------------+----------------+");
          
      for (int j = 0; j < array[0].length; j++) {
        System.out.printf("| %-15s", array[i][j]);
      }
    System.out.println("|");

    System.out.println("+----------------+----------------+----------------+----------------+----------------+");
   
  
  }
  
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
   } 
   
}
