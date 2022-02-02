import java.io.IOException;
import java.util.Scanner;
 

public class main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        float indice = entrada.nextFloat();

        //Byte
        if(indice < 1024){
        System.out.printf("%.2f"+" B", indice);
        }

        //KiloByte
        if(indice >= 1024){
        indice = indice / 1024;
        if(indice < 1024)
        System.out.printf("%.2f"+" KB", indice);
        }

        //MegaByte
        if(indice >= 1024){
            indice = indice / 1024;
            if(indice < 1024)
            System.out.printf("%.2f"+" MB", indice);
            }

        //GigaByte
        if(indice >= 1024){
            indice = indice / 1024;
            if(indice < 1024)
            System.out.printf("%.2f"+" GB", indice);
            }

        //TeraByte
        if(indice >= 1024){
            indice = indice / 1024;
            if(indice < 1024)
            System.out.printf("%.2f"+" TB", indice);
            }

        //PetaByte
        if(indice >= 1024){
            indice = indice / 1024;
            if(indice < 1024)
            System.out.printf("%.2f"+" PB", indice);
            }

        //ZetaByte
        if(indice >= 1024){
            indice = indice / 1024;
            if(indice < 1024)
            System.out.printf("%.2f"+" ZB", indice);
            }

        //YottaByte
        if(indice >= 1024){
            indice = indice / 1024;
            if(indice < 1024)
            System.out.printf("%.2f"+" YB", indice);
            }
    
         
         entrada.close();
 
    } 
}