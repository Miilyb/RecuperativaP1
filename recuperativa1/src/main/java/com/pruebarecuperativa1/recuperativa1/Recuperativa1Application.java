/* ----------Minimarket Don Jose -------------------------
 * Objetos necesarios = Tipos de productos y productos 
 * Funciones =  1- Guardar productos y los muestre (OK)
 * 				2- Ganancia total
 * 				3- Producto mas caro y mas economico */


package com.pruebarecuperativa1.recuperativa1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import com.pruebarecuperativa1.recuperativa1.model.Producto;

@SpringBootApplication
public class Recuperativa1Application {

/* 1- Funcion que permite guardar cierta cantidad de productos en un arreglo
  y que luego nos lo muestre*/

	public static void productos(){
//Iniciamos el array donde guardaremos los objetos de tipo Producto 
		ArrayList<Producto> product = new ArrayList<Producto>();
//Traemos al teclado 
		Scanner teclado = new Scanner(System.in);

//Le pedimos a Don Jose cuantos productos desea ingresar
		System.out.print("¿Cuantos Productos desea registrar?: ");
//Inicializamos variable
		int cantidadProductos= teclado.nextInt();
//Repetimos por la cantidad de productos que desea ingresar

		for(int i = 1; i<=cantidadProductos; i++){
//Creamos realmente al objeto producto
			Producto producto = new Producto();
			teclado.nextLine();
// Ciclo do--while para que por lo menos ingrese 1 vez y se repitael ciclo

			do {

//Le pedimos a don jose ingrese por orden 
				System.out.println("Ingrese Producto numero:" + i);

//Le pedimos que ingrese el nombre del producto y lo seteamos
				System.out.print("Ingrese nombre del producto: ");
		        producto.setNombreProducto(teclado.nextLine());
//Le pedimos que ingrese el valor de costo del producto y setemos

				System.out.print("Ingrese cuanto le costo el producto: ");
				producto.setPrecioCompra(teclado.nextInt());
//Le pedimos que ingrese el valor de costo del producto y setemos

				System.out.print("Ingrese el valor de venta del producto: ");
				producto.setPrecioVenta(teclado.nextInt());	

			} while (i>cantidadProductos);

// Agregamos los productos 
			product.add(producto);
		}
// Le mostramos los productos a Don jose
		System.out.print(product);

}

/* 2- Funcion de ganancia  */

public static Integer ganancia (ArrayList<Integer>gan){
	Integer resta = 0;
	//recorrimos el array que contiene las valores
	for(int i = 0; i< gan.size();i++){
		resta = resta - gan.get(i);
	}
	//retorno la resta
	return resta;
}


/*3- Comparacion */

	 public static void comparacion(ArrayList<Integer>ganan){
		Integer mayor = 0;
		Integer menor = 0 ;
		
		// no se como decrile aun que me de el numeromas pequeño de los que ingreso
		for (int i = 0; i < ganan.size(); i++) {
			
		
			if(ganan.get(i)>=mayor){
				mayor = ganan.get(i);
			}
			if(ganan.get(i)< ganan.get(i)){
				menor = ganan.get(i);
			}
	
		}
		
		
        
		System.out.println("La ganancia mas alta fue: "+mayor+"\nla ganancia mas baja fue: "+menor);
	}



	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
// Menu para guiar a Don jose

		int opcion=1;
		while(opcion!=0){
			do {
				System.out.println("Bienvenido Don jose");
				System.out.println("Ingresa 1 si quieres ver la ganancia de un producto");
				System.out.println("Ingresa 2 si quieres guardar un producto");
				System.out.println("Ingresa 3 si quieres guardar productos y evaluarlos");
				System.out.println("Ingresa 0 para salir del menú");
				System.out.print("Don jose ingrese su opcion: ");
				opcion=teclado.nextInt();

			} while (opcion < 0 || opcion > 3);
			if(opcion==1){
// inicializamos un hashmap para guardar un producto con sus respectivos valores de costos
				HashMap <String,ArrayList<Integer>> costos = new HashMap<>();
				int cantproductos;
				int cosst;
				System.out.print("Indique cantidad de productos a guardar : ");
				cantproductos = teclado.nextInt(); 
				System.out.print("ingrese 2 si tiene el costo de compra y el valor de venta del producto : ");
				cosst= teclado.nextInt();  
//Guardamos los productos con su nombre y los dos costos

				for (int i = 1; i <= cosst; i++) {
// array donde guardaremos los costos
					ArrayList<Integer> cost = new ArrayList<Integer>(); 
// inicializamos el producto con todo
					Producto contodo = new Producto();
					teclado.nextLine();
					System.out.print("Ingrese nombre del producto: ");
					
					contodo.setNombreProducto(teclado.nextLine());

					for (int x = 1; x <= cantproductos ; x++) {
						
						System.out.print("Ingrese precio de venta "+x+" del producto "+ contodo.getNombreProducto()+" :");
						contodo.setPrecioVenta(teclado.nextInt());
						
						cost.add(contodo.getPrecioVenta());
						System.out.print("Ingrese costo de compra "+x+" del producto "+ contodo.getNombreProducto()+" :");
						contodo.setPrecioCompra(teclado.nextInt());
						
						cost.add(contodo.getPrecioCompra());
	
					}
//obtenemos el nombre del objeto producto + el array de costos y lo guardamos en el hashmap	
					costos.put(contodo.getNombreProducto(), cost);

		        }
				for(String i : costos.keySet()){
					//llamamos a la funcion promedio y le pasamos el valor de la key, que en este caso son de tipo array
					Integer ganancias = ganancia(costos.get(i));
		            System.out.println("La ganancia del producto "+ i + " es de:" + ganancias);
				}
			}
			else if(opcion ==2){
// llamamos a la funcion 1 productos
					productos();

			}

			else if(opcion == 3){
// creamos el array donde se guardaran las ganancias
				ArrayList<Integer> ganancias = new ArrayList<Integer>();
				 
				System.out.print("¿Cuantas ganancias de productos vamos a comparar?: ");
				int cantprod = teclado.nextInt();
				for(int i=0; i<cantprod;i++){ 
					Producto newProducto = new Producto(); 
					do {
						System.out.println("Ingrese ganancia numero"+(i+1));
						System.out.print("Ingrese ganancia: ");
						newProducto.setGanancia(teclado.nextInt()); 
						
					} while (i>cantprod);
					ganancias.add(newProducto.getGanancia()); 
				}

				comparacion(ganancias);
			}


			}

		
	}

}
