class Solution{
    public int maximoLucro(int[] precos){
        int menorValor = precos[0];
        int maiorValor = 0; 

        for(int i = 1 ; i < precos.length ; i++){
            if(precos[i] < menorValor){
                menorValor = preco;
            }else{
                lucro = precos[i] - menorValor;
                if(lucro > maiorValor){
                    maiorValor = lucro;
                }
            }
        }

        return maiorValor; 
    }
}