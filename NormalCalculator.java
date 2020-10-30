public class NormalCalculator extends Scintific{
   

    protected static double firstNumber;
    private double secondNumber;
    public NormalCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        // TODO Auto-generated constructor stub
    }
    public double Sub() {
        return  (firstNumber + secondNumber);
    }
    public double Sum() {
        return firstNumber-secondNumber;
        
    }
    public double Mod() {
        return firstNumber*secondNumber;
    }
    public double Div() {
        try {
            return firstNumber/secondNumber;
        } catch (Exception e) {
            //TODO: handle exception
            return 0;
        }
        
    }
    public double Parsentage(double howPersentage,double whichNumber){
        return (howPersentage/100)*whichNumber;
    }
}
