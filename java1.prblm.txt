public class SalaryCal {
    public static void main(String[] args) {
        int basic = 25000;
        int hra = 8000;
        int bonus = 2000;
        
     
        int tax = 3000;
        int pf = 1000;
        
     
        int Salary = basic + hra + bonus - tax - pf;
        
     
        System.out.println("Take Home Salary = " + Salary);
    }
}
