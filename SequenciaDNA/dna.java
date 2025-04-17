//Fazer verificação de uma cadeia , verificando tamanho , presença do ATG  , presença do TGA  e se a cadeia é múltiplo de 3.

public class DNA {
  


  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA"; 
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna2;
    
   int length = dna.length();
   System.out.println("Length: " + length);
 
    
    int start = dna.indexOf("ATG");

    System.out.println("Start: " + start);

    int start2 = dna.indexOf("TGA");

    System.out.println("Final: " + start2);
    if(start != -1 && start2 != -1 ){
        if( length % 3 == 0){
          String protein = dna.substring(start , start2 + 3);
          System.out.println("Protein: " + protein);
        }else{
          System.out.println("No Protein");
        }
    }
  }
  

}
