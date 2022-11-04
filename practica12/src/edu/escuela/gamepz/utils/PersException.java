public class PersException extends Exception{

    private String msg;
    private int pos;

    public PersException(String msg, int pos){
        this.msg = msg;
        this.pos = pos;
    }
    public int getPos(){
        return pos;
    }
}