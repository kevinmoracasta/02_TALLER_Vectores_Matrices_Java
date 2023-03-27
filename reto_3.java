import java.util.Scanner;

public class reto_3 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        String[][] matriz = new String[3][3];
        int[] posicion_de_la_palabra = new int[9];
        System.out.println("Digite las palabras de su preferencia");

        for (int t = 0; t < 9; t++) 
        {
            System.out.print("Palabra numero " + (t+1)+":\n" );
            matriz[t/3][t%3] = lec.next();
            posicion_de_la_palabra[t] = t;
        }
        for (int t = 0; t < 9; t++)  {
            int j = (int)(Math.random() * 9);
            int pal = posicion_de_la_palabra[t];
            posicion_de_la_palabra[t] = posicion_de_la_palabra[j];
            posicion_de_la_palabra[j] = pal;
        }
        String[][] concentrate = new String[4][4];
        for (int i = 0; i < 9; i++)
         {
            concentrate[i/3][i%3] = matriz[posicion_de_la_palabra[i]/3][posicion_de_la_palabra[i]%3];
        }
 for (int i = 0; i < 9; i++) {
            int contador_de_rep = 0;
            for (int j = i+1; j < 9; j++) {
                if (concentrate[i/3][i%3].equals(concentrate[j/3][j%3])) {
                    contador_de_rep++;
                }
            }
        for (int t = 0; t < 3; t++)
         {
            
            for (int j = 0; j < 3; j++) {
                System.out.print(concentrate[t][j] + "\t");
            }
            System.out.println();
        }
       
            if (contador_de_rep > 0) {
                System.out.println("Se acabo el juego las palabras " + concentrate[i/3][i%3] + " se repitieron un total de " + (contador_de_rep+1) + " veces.");

                
            }
        }

        lec.close();                                                                                                                                                                                                               
    }
}