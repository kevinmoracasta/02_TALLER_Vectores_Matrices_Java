import java.util.Scanner;

public class reto_2 {

   public static void main(String[] args)

   {

       Scanner lec= new Scanner(System.in);

       int  ultimominutos=0, primerminuto=0,cantcomp, minutosnadador;

       String nombrecomp, ultimoCompetidor="", primerCompetidor="";

       System.out.println("Digite cuantos competidores participaron en la competencia máximo 4:\n");
       cantcomp = lec.nextInt();

       String[] concursante = new String[cantcomp];

       int[] minutos = new int[cantcomp];

       for(int i=0;i<cantcomp;i++){
           System.out.println("Ingrese el nombre de uno de los nadadores:\n " + (i+1));

           nombrecomp= lec.next();

           concursante[i] =  nombrecomp;

           System.out.println("Digita el tiempo en minutos del nadador:\n ");

           minutosnadador = lec.nextInt();

           minutos[i] = minutosnadador;
       }

       for(int t=0;t<cantcomp;t++){
           if(ultimominutos<minutos[t])

           {

               ultimominutos=minutos[t];

               ultimoCompetidor = concursante[t];

           }

       }

       primerminuto=ultimominutos;

       for(int t= 0; t<cantcomp;t++){
           if(primerminuto>minutos[t])

           {

               primerminuto = minutos[t];

               primerCompetidor = concursante[t];

           }   
        
       }

       System.out.println("Los puestos quedaron en que el primer lugar lo obtuvo "+primerCompetidor+ " con " + primerminuto+ " minutos.\n");

       System.out.println("Y de ultimo lugar lo obtuvo "+ultimoCompetidor+ "  tardó " + ultimominutos + " minutos.");

       lec.close();

   }

}
