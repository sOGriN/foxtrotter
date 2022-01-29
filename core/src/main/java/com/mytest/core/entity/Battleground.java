package com.mytest.core.entity;

public class Battleground {
    private int lineCount = 2;
    private int lineLength = 3;
    private Squad leftSquad, rightSquad;

    public Squad getLeftSquad() {
        return leftSquad;
    }

    public void setLeftSquad(Squad leftSquad) {
        this.leftSquad = leftSquad;
    }

    public Squad getRightSquad() {
        return rightSquad;
    }

    public void setRightSquad(Squad rightSquad) {
        this.rightSquad = rightSquad;
    }

    public int getLineCount() {
        return lineCount;
    }
    
    public int getLineLength(int lineIndex) {
        return lineLength;
    }

    public int convertLinePosToIndex(int line, int pos) {
        return line * lineLength + pos;
    }

    public Unit getUnitAt(SquadSide side, int line, int pos) {
        Squad squad = (side==SquadSide.LEFT)?leftSquad:rightSquad;
        int index = convertLinePosToIndex(line, pos);
        return squad.getUnitAt(index);
    }

}
