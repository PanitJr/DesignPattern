package com.thedayafter.designpattern.builder;

import com.thedayafter.designpattern.SUV;

/**
 * Created by waiti on 12/16/2015.
 */
public abstract class SUVBuilder {
    SUV suv;

    public SUV getSUV() { return suv; }
    public void createNewSUV() { suv = new SUV(); }

    public abstract void buildMPG();
    public abstract void buildmke();
    public abstract void buildmdl();
    public abstract void buildReserve();
    public abstract void buildseats();
}
