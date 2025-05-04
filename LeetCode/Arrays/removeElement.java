public class RemoveElemento{
    public static removeElemento(int[] numeros , int x){
        int k = 0;
        for(int i = 0 ; i < numeros.length ;i++){
            if(numeros[i] != x){
                numeros[k] = numeros[i];
                k++
            }
        }

        return k;
    }
}