public class Printer {
    private int paperload;
    private int toner;

    public Printer(int paperload, int toner){
        this.paperload = paperload;
        this.toner = toner;
    }

    public int getPaperload(){
        return this.paperload;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int totalPaperNeeded = pages * copies;
        if (this.paperload >= totalPaperNeeded) {
            this.paperload -= totalPaperNeeded;
            this.toner -= totalPaperNeeded;
        }
    }

    public void refillPaperload(int paper){
        this.paperload += paper;
    }


}
