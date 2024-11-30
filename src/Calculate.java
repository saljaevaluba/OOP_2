public class Calculate {
    public double add(double ... args){
        double ans = 0;
        for(double arg : args){
            ans += arg;
        }
        return ans;
    }
    public double subtract(double ... args){
        double ans = 0;
        for(double arg : args){
            ans -= arg;
        }
        return ans;
    }

    public double multiply(double ... args){
        double ans = 1;
        for(double arg : args){
            ans *= arg;
        }
        return ans;
    }

    public double division(double ... args) throws Exception{
        double ans = 1;
        for(double arg : args){
            if(arg == 0) throw new Exception("Ошибка: деление на ноль");
            ans /= arg;
        }
        return ans;
    }
}
