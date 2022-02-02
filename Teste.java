import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        float indice = entrada.nextFloat();
        int ext = 0;

        while (indice >= 1024) {
            indice = indice / 1024;
            ext++;
        }

        switch (ext) {
            case 0:
                System.out.printf("%.2f" + " B", indice);
                break;
            case 1:
                System.out.printf("%.2f" + " KB", indice);
                break;
            case 2:
                System.out.printf("%.2f" + " MB", indice);
                break;
            case 3:
                System.out.printf("%.2f" + " GB", indice);
                break;
            case 4:
                System.out.printf("%.2f" + " TB", indice);
                break;
            case 5:
                System.out.printf("%.2f" + " PB", indice);
                break;
            case 6:
                System.out.printf("%.2f" + " ZB", indice);
                break;
            case 7:
                System.out.printf("%.2f" + " YB", indice);
                break;
            default:
                break;
        }

        entrada.close();

    }
}