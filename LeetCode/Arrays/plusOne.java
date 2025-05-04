class Solution{
    public int[] plusOne(int[] numeros){
        for(int i = numeros - 1 ; i >= 0 ; i--){
            if(numeros[i] < 9){
                numeros++;
                return numeros;
            }

            numeros[i] = 0; 
        }

        int[] novosNumeros = new int[numeros.length + 1];
        novosNumeros[0] = 1;
        return novosNumeros;
    }
}