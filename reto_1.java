import java.util.Scanner;

public class reto_1 {

   public static void main(String[] args) {

       int cantidad_de_numeros=0;
       int i=0;
       int varnumero=0;
       int contmulti_1=0;  
       int cont_3=0;
       int multiplicaion=0;

       Scanner lec= new Scanner(System.in);

       System.out.println("Digite la cantidad de numeros  que desea saber si es multiplo de dos:\n");
       cantidad_de_numeros = lec.nextInt();

       int num2[] =  new int[cantidad_de_numeros];

        while(i<cantidad_de_numeros)  {

             System.out.println("Digite el numero qeu desee: \n" + (i+1));
             varnumero = lec.nextInt();

             num2[i]=varnumero;

            i++;

        }
        while (contmulti_1 < cantidad_de_numeros) {
           if (num2[contmulti_1] % 2 == 0)
           {
               multiplicaion++;
           }

           contmulti_1++;

        }
        System.out.println("EL RESULTADO ES:\n");
       System.out.println("De los numero/s que digitaste solo " + multiplicaion + " son multiplos de dos");

       System.out.println("Esos son: ");

        while (cont_3 < cantidad_de_numeros){
           if (num2[cont_3] % 2 == 0)
           {
               System.out.println(num2[cont_3]);
           }
           cont_3++;
        }
           lec.close();
}

}
