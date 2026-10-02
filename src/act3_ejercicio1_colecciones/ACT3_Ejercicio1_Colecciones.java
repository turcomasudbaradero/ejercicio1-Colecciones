package act3_ejercicio1_colecciones;

import java.util.Random;

public class ACT3_Ejercicio1_Colecciones {

    public static void main(String[] args) {
        
        //SE CREA UN ARRAY DE 1000 ELEMENTOS
        int[] numeros = new int[1000];
        
        //SE CREA UN OBJETO RANDOM
        Random random = new Random();
        
        //SE CARGA EL ARRAY CON NUMEROS ALEATRIOS
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(10000);
        }
        
        //SE INICIALIZA EL NUMERO MAYOR Y MENOR
        int mayor = numeros[0];
        int menor = numeros[0];
        
        int posicionMayor = 0;
        int posicionMenor = 0;
        
        //SE BUSCA EL NUMERO MAYOR Y MENOR
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
                posicionMayor = i;
            }
            
            if(numeros[i] < menor){
                menor = numeros[i];
                posicionMenor = i;
            }
        }
        
        //SE MUESTRA LOS RESULTADOS
        System.out.println("==== RESULTADOS ====");
        
        System.out.println();
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + posicionMayor);
        
        System.out.println();
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del menor: " + posicionMenor);
    }
    
}