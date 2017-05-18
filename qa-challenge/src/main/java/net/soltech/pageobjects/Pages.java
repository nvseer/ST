package net.soltech.pageobjects;


import net.soltech.pageobjects.header.Header;
import net.soltech.pageobjects.header.careers.openpositions.OpenPositions;
import net.soltech.pageobjects.home.Home;

public interface Pages {
    Home home();
    Header headerSection();
    OpenPositions openPositionsPage();
}
