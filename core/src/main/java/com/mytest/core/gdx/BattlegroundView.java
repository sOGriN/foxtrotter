package com.mytest.core.gdx;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mytest.core.entity.Battleground;
import com.mytest.core.entity.SquadSide;
import com.mytest.core.entity.Unit;
import com.mytest.core.gdx.assets.GdxSpriteAsset;

import org.lwjgl.util.Point;

public class BattlegroundView {
    private Battleground bg;
    private int width = 800, height = 600;
    private int paddingVertical = 20, paddingHorizontal = 50; 
    private int halfGapHorizontal = 50; 
    
	private SpriteBatch batch;
    
    public BattlegroundView(Battleground bg) {
        this.bg = bg;
        this.batch = new SpriteBatch();
    }

    private int getInnerWidth() {
        return width - 2 * paddingHorizontal;
    }

    private int getInnerHeight() {
        return height - 2 * paddingVertical;
    }

    private int getSideWidth() {
        return (getInnerWidth() - halfGapHorizontal) / 2;
    }

    public Point convertSideLinePosToPoint(SquadSide side, int line, int pos) {
        int yStep = getInnerHeight() / bg.getLineLength(0);
        int xStep = getSideWidth() / bg.getLineCount();
        int y = paddingVertical + yStep * pos;
        int preX =  xStep * line;
        int x = (side == SquadSide.LEFT)? (paddingHorizontal + getSideWidth() - preX) : (paddingHorizontal + getSideWidth() + preX);
        return new Point(x, y);
    }

    private void drawUnit(Unit unit, Point point) {
        if (unit != null) {
            ((GdxSpriteAsset)(unit.getUnitClass().getSprite())).draw(batch, point);
        }
    }

    public void render() {
        batch.begin();
        for (int line = 0; line < bg.getLineCount(); ++line) {
            for (int pos = 0; pos < bg.getLineLength(0); ++pos) {
                drawUnit(bg.getUnitAt(SquadSide.LEFT, line, pos), convertSideLinePosToPoint(SquadSide.LEFT, line, pos));
                drawUnit(bg.getUnitAt(SquadSide.RIGHT, line, pos), convertSideLinePosToPoint(SquadSide.RIGHT, line, pos));
            }
        }
		batch.end();
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

}
