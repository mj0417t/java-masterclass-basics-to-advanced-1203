public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.pagesPrinted=0;
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100)?tonerLevel:-1;
    }

    public int addToner(int tonerAmt){
        int tonAmt=tonerAmt+tonerLevel;
        if(tonAmt<0 || tonAmt>100)
            return -1;
        tonerLevel+=tonerAmt;
        return tonerLevel;
    }

    public int printPages(int pages){
        if(duplex){
            int jobPages=(pages/2) +(pages%2);
            System.out.println("Its a duplex");
            pagesPrinted+=jobPages;
            return jobPages;
        }else {
            pagesPrinted+=pages;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
