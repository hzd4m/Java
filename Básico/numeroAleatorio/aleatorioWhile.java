import java.util.Random; 

class numeroSorte{
    public static void main(String[] args){

   

    Random random = new Random(); 

    int numeroDado = random.nextInt(6) + 1;

    while(numeroDado != 5){
        numeroDado = random.nextInt(6) + 1;

        System.out.println(numeroDado);
    }

 }


}


