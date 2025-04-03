import java.util.ArrayList; 

class Lanche{

    public static ArrayList<String> remove(ArrayList<String> lancheira){
        int i = 0;

        while(i < lancheira.size()){
            if(lancheira.get(i).equals("banana")){
                lancheira.remove(i);
            }else{
                i++;
            }
        }
        return lancheira;
    }


    public static void main(String [] args){
        ArrayList<String> Lancheira2 = new ArrayList<String>();

        Lancheira2.add("Maça");
        Lancheira2.add("Melão");
        Lancheira2.add("Laranja");
        Lancheira2.add("banana");
        Lancheira2.add("Pêra");
        Lancheira2.add("banana");

        Lancheira2 = remove(Lancheira2);

        System.out.println(Lancheira2); 


    }
}