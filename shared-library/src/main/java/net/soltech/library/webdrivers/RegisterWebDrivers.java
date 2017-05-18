package net.soltech.library.webdrivers;



import net.soltech.library.webdrivers.local.RegisterLocalWebDrivers;

import java.util.stream.Stream;

public interface RegisterWebDrivers
{
    static Stream<WebDriverType> getTypes()
    {
        return RegisterLocalWebDrivers.getTypes();
    }
}