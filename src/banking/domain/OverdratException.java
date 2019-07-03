package banking.domain;

 public class OverdratException extends Exception{
    private  double deficit;

    public OverdratException(String message,double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

 }
