package com.siva.fruitcutter;

import java.util.List;

import android.graphics.Canvas;

public interface ProjectileManager {
    void draw(Canvas c);
    void update();
    void setWidthAndHeight(int width, int height);
    int testForCollisions(List<TimedPath> allPaths);
}
