package com.siva.fruitcutter;

import java.util.Random;

import com.siva.fruitcutter.R;

public enum FruitType {
	CITRON(R.drawable.citron),
	CANTALOUPE(R.drawable.cantaloupe),
	CHERRY(R.drawable.cherry),
	CASHEW(R.drawable.cashew),
	BERRY(R.drawable.berry),
	BLUEBERRy(R.drawable.blueberry),
	AVOCADO (R.drawable.avocado),
    WATERMELON(R.drawable.watermelon),
    MANGO(R.drawable.mango),
    JACK(R.drawable.jack),
    STRAWBERRY(R.drawable.strawberry), 
    POMEGRANATE(R.drawable.pomegranate),
    PINEAPPLE(R.drawable.pineapple),
    PAPAYA(R.drawable.papaya),
    GRAPES(R.drawable.grape), 
    APPLE(R.drawable.apple), 
    BANANA(R.drawable.banana), 
    ORANGE(R.drawable.orange);

    private final int resourceId;

    private FruitType(int resourceId) {
	this.resourceId = resourceId;
    }

    public int getResourceId() {
	return resourceId;
    }

    private static final Random random = new Random();

    public static FruitType randomFruit() {
	return FruitType.values()[random.nextInt(FruitType.values().length)];
    }
}