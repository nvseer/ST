package net.soltech.pageobjects;


import net.soltech.pageobjects.header.Header;
import net.soltech.pageobjects.header.HeaderPO;
import net.soltech.pageobjects.header.careers.openpositions.OpenPositions;
import net.soltech.pageobjects.header.careers.openpositions.OpenPositionsPO;
import net.soltech.pageobjects.home.Home;
import net.soltech.pageobjects.home.HomePO;

public class PagesImpl implements Pages {
    @Override
    public Home home() {
        return new HomePO();
    }

    @Override
    public Header headerSection() {
        return new HeaderPO();
    }

    @Override
    public OpenPositions openPositionsPage() { return new OpenPositionsPO(); }
}
