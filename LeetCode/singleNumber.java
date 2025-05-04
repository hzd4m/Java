class Solution{
    public int singleNumber(int[] numeros){
        ArrayList<Integer> visitados = new ArrayList<>();

        for(int i = 0 ; i < numeros.length ; i++){
            int numeroAtual = numeros[i]; 

            if(visitados.contains(numeroAtual)){
                visitados.remove(Integer.valueOf(numeroAtual));
            }else{
                visitados.add(numeroAtual);
            }
        }

        return visitados.get(0); 
    }
}