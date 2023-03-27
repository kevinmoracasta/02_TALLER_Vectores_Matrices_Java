import java.util.Scanner;

public class reto_4 {

public static void main(String[] args) {
   Scanner lec = new Scanner(System.in);

   int filas=1, columnas=16;
   String[] mercancia={" \nBotella de agua", " \nDoritos"," \nSpeed max"," \nChocolatina jet"," \nGalleta oreo"," \nGalleta festibal"," \nJugo hit"," \nGol"," \nChocolatina jumbo"," \nChocorramo,\ngansito\nponque bimbo","\ncocacola","\nred bull","\nspartan","\nPonqué Pingüinos "};
   System.out.println();

   int [] precios={1000,1500, 2000, 700, 1200, 1100, 2000, 2000, 2000,2500,1500,1500,1700,2000,2000,2200};

   for(int i=0;i<columnas;i++){
       for(int t=0;t<filas;t++){
       System.out.println((i+1) +mercancia[i]);    
       System.out.println(precios[i]);
       }
   }
   lec.close();
}
}



