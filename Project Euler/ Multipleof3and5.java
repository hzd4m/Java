
import java.util.Scanner;


public class solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        
        for(int teste = 0 ; teste < t ; teste++){
            int x = scanner.nextInt();
            int soma = 0; 
            
            for(int i = 1; i < x ; i++){
                if(i % 3 == 0 || i % 5 == 0) {
                    soma += i;
            }
            
        }
        
        System.out.println(soma);
    }
    
    scanner.close();
}
}