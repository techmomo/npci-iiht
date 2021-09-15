package com.mohsinkd786.designpattern.structural;

public class SquareNailAdapter extends RoundNail {

    private SquareNail nail;

    public SquareNailAdapter(SquareNail nail){
        this.nail = nail;
    }

    public double getRadius(){
        // calculate the minimum circle radius to fit the nail
        return Math.sqrt(Math.pow((nail.getWidth() / 2),2)*2);
    }
}
