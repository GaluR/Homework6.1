public class Calc {
    public double a;
    public double b;


    public double isHigher(){
        return a+b;
    }

    public double isLower(){
        return a*b;
    }

    public double isEqual(){
        return a*b;
    }

    public double check(){
        if(a>b){
            return isHigher();
        }else if(a<b){
            return isLower();
        }else {
            return isEqual();
        }
    }
}
