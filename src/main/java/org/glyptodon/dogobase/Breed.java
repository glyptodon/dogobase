/*
 * Copyright (C) 2018 Glyptodon, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.glyptodon.dogobase;

/**
 * A uniquely-identified breed of dog.
 */
public class Breed {

    /**
     * An arbitrary identifier which uniquely identifies this dog breed
     * relative to other defined dog breeds.
     */
    private String id;

    /**
     * A human-readable name for this dog breed. The name of the breed need not
     * be unique.
     */
    private String name;

    private int size;

    private int kidFriendly;

    private int dogFriendly;

    private int lowShedding;

    private int easyToGroom;

    private int highEnergy;

    private int goodHealth;

    private int lowBarking;

    private int intelligence;

    private int easyToTrain;

    private int toleratesHot;

    private int toleratesCold;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getKidFriendly() {
        return kidFriendly;
    }

    public void setKidFriendly(int kidFriendly) {
        this.kidFriendly = kidFriendly;
    }

    public int getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(int dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public int getLowShedding() {
        return lowShedding;
    }

    public void setLowShedding(int lowShedding) {
        this.lowShedding = lowShedding;
    }

    public int getEasyToGroom() {
        return easyToGroom;
    }

    public void setEasyToGroom(int easyToGroom) {
        this.easyToGroom = easyToGroom;
    }

    public int getHighEnergy() {
        return highEnergy;
    }

    public void setHighEnergy(int highEnergy) {
        this.highEnergy = highEnergy;
    }

    public int getGoodHealth() {
        return goodHealth;
    }

    public void setGoodHealth(int goodHealth) {
        this.goodHealth = goodHealth;
    }

    public int getLowBarking() {
        return lowBarking;
    }

    public void setLowBarking(int lowBarking) {
        this.lowBarking = lowBarking;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getEasyToTrain() {
        return easyToTrain;
    }

    public void setEasyToTrain(int easyToTrain) {
        this.easyToTrain = easyToTrain;
    }

    public int getToleratesHot() {
        return toleratesHot;
    }

    public void setToleratesHot(int toleratesHot) {
        this.toleratesHot = toleratesHot;
    }

    public int getToleratesCold() {
        return toleratesCold;
    }

    public void setToleratesCold(int toleratesCold) {
        this.toleratesCold = toleratesCold;
    }

}
