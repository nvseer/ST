package net.soltech.handlers;


import net.soltech.pageobjects.header.careers.openpositions.OpenPositions;
import net.soltech.pageobjects.header.careers.openpositions.OpenPositionsPO;

public interface OpenPositionsPageHandler {
    default OpenPositions openPositionsPage()
    {
        return new OpenPositionsPO();
    }
    static OpenPositionsPageHandler get() {
        class Instance implements OpenPositionsPageHandler {
        }
        return new Instance();
    }
}
