import java.util.*;  

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Ingrese su nombre: ");
    	String nombre = sc.nextLine();
    	System.out.print("Ingrese su apellido: ");
    	String apellido = sc.nextLine();
    	System.out.print("Ingrese su edad: ");
    	String edad = sc.nextLine();
    	System.out.print("Ingrese su hobbie: ");
    	String hobbie = sc.nextLine();
    	System.out.print("Ingrese su editor preferido: ");
    	String editor= sc.nextLine();
    	System.out.print("Ingrese su sistema Operativo: ");
    	String so= sc.nextLine();
    	System.out.print("\n");
    	System.out.print("Los datos que usted ingreso son:" + "\n");
    	System.out.print("Nombre:" +nombre + "\n");
    	System.out.print("Apellido:" +apellido + "\n");
    	System.out.print("Edad:" +edad + "\n");
    	System.out.print("Hobbie:" +hobbie + "\n");
    	System.out.print("Editor Preferido:" +editor + "\n");
    	System.out.print("SO:" +so + "\n");
    	
    }

}
