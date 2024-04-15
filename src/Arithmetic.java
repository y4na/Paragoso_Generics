import java.util.ArrayList;
public class Arithmetic<T extends Number,U extends Number > {
    Number num1;
    Number num2;
    ArrayList<Number> arrayList;
    public Arithmetic(T n1, U n2) {
        num1 = n1;
        num2 = n2;

    }
    public Number add(){
        return num1.doubleValue()+ num2.doubleValue();
    }
    public Number subtract(){
        return num1.doubleValue()- num2.doubleValue();

    }
    public Number multiply(){
        return num1.doubleValue()* num2.doubleValue();
    }
    public Number divide(){
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Division by zero not allowed.");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public Number getMin(){
        if(num1.doubleValue()> num2.doubleValue()){
            return num2;
        }
        return num1;
    }
    public Number getMax(){
        if(num1.doubleValue()> num2.doubleValue()){
            return num1;
        }
        return num2;
    }
}
