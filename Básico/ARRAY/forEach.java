import java.util.ArrayList; 

class maisCaro{
    public static void main(String[] args){

        ArrayList<Double> gastos = new ArrayList<Double>();

        gastos.add(25.43);
        gastos.add(22.48);
        gastos.add(34.53);
        gastos.add(45.83);
        gastos.add(95.78);
        gastos.add(21.89);


        double maiorGasto = 0;

        for(double i : gastos){
            if(i > maiorGasto){
                maiorGasto = i;
            }


        }

        System.out.println(maiorGasto);
    }
}