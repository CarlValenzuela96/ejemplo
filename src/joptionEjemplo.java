import javax.swing.JOptionPane;
       



public class joptionEjemplo {

    
    public static void main(String[] args) {
       menu(); 
    }
    public static void menu(){
        
        int a, b, c;
        String num1;
        String num2;
        
        num1=JOptionPane.showInputDialog(null, "ingrese Numero 1");
        num2=JOptionPane.showInputDialog(null, "ingrese Numero 2");
        
       
            a = Integer.parseInt(num1);
       
       
        b = Integer.parseInt(num2);
        
       int opcion;
       String respuesta;
       do{
           respuesta = JOptionPane.showInputDialog("   MENU \n "
                   + "1) sumar \n 2)restar \n 3) volver a comenzar \n 4) salir" );
           
           opcion = Integer.parseInt(respuesta);
           switch(opcion){
                case 1: int suma = sumar(a,b);
                        JOptionPane.showMessageDialog(null," La suma es:  " +suma);
                        break; 
                case 2: int resta = restar(a,b);
                        JOptionPane.showMessageDialog(null," La resta es:  "+ resta);
                        break;
                case 3: menu();
                        break;
                case 4: break;
                default:    
            }
       }while(opcion !=4);
      
    }
     
    public static int sumar(int a, int b){
        int c;
        c= a+b;
        return c;
    }
    
    public static int restar(int a, int b){
        int c;
        c= a-b;
        return c;
    }
}
