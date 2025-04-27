public class UglyNumber{
    public boolean uglyNumber(int x){
        if(x <= 0){
            return false;
        }

        while(x % 2 == 0){
            n /= 2;
        } 

        while(x % 3 == 0){
            n /= 3;
        } 

        while(x % 5 == 0){
            n /= 5;
        }

        return x == 1;
    }
}