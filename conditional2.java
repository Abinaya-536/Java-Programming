import java.util.Scanner;

public class LoanApprovalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRatio = sc.nextDouble();
        sc.nextLine();
        String loanType = sc.nextLine();

        String decision = "Rejected";
        double maxLoanAmount = 0.0;

        
        if (creditScore < 600 || debtToIncomeRatio > 50) {
            decision = "Rejected";
            maxLoanAmount = 0.0;
        } else {

            // Credit Score Tiers
            if (creditScore >= 750) { 

                if (debtToIncomeRatio <= 30) {
                    if (loanType.equals("Home")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 4;
                    } else if (loanType.equals("Personal")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 1;
                    } else if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    }
                } else if (debtToIncomeRatio <= 40) { 
                    decision = "Needs Review";
                    if (loanType.equals("Home")) {
                        maxLoanAmount = annualIncome * 3;
                    } else if (loanType.equals("Personal")) {
                        maxLoanAmount = annualIncome * 0.5;
                    } else if (loanType.equals("Business")) {
                        maxLoanAmount = annualIncome * 3;
                    }
                } else {
                    decision = "Rejected";
                }

            } else if (creditScore >= 700) { 

                if (debtToIncomeRatio <= 30) { 
                    if (loanType.equals("Home")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    } else if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    } else {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 0.5;
                    }
                } else if (debtToIncomeRatio <= 40) { 
                    if (loanType.equals("Home")) {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 3;
                    } else if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    } else {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 0.5;
                    }
                } else {
                    decision = "Rejected";
                }

            } else if (creditScore >= 650) {

                if (debtToIncomeRatio <= 40) { 
                    if (loanType.equals("Personal")) {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 0.5;
                    } else if (loanType.equals("Home")) {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 3;
                    } else {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 1;
                    }
                } else {
                    decision = "Rejected";
                }

            } else {
                if (debtToIncomeRatio <= 40) {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 0.5;
                } else {
                    decision = "Rejected";
                }
            }
        }

       
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtToIncomeRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoanAmount);

        sc.close();
    }
}