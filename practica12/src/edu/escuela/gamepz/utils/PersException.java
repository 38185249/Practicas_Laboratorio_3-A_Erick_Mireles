package edu.escuela.gamepz.utils;
public class PersException extends Exception{

    private final String msg;
    private final int pos;

    public PersException(String msg, int pos){
        this.msg = msg;
        this.pos = pos;
    }
    public int getPos(){
        return pos;
    }
}