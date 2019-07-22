public class Calc {
    double a;
    double b;


    double isHigher(){
        return a+b;
    }

    double isLower(){
        return a*b;
    }

    double isEqual(){
        return a*b;
    }

    double check(){
        if(a>b){
            return isHigher();
        }else if(a<b){
            return isLower();
        }else {
            return isEqual();
        }
    }
}
