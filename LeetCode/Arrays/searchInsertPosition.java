public class SearchInsertPosition{
    public int Solution(int[] numeros ,int x){
        for(int i = 0 ; i < numeros.length ; i++){
            if(numeros[i] >= x){
                return i;
            }
        }

        return numeros.length;

    }
}