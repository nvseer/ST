package net.soltech.library.webdrivers.local;



import net.soltech.library.webdrivers.WebDriverType;

import java.util.stream.Stream;

public interface RegisterLocalWebDrivers
{
    static Stream<WebDriverType> getTypes()
    {
        return Stream.of(
                new Chrome()
        //        ,new Firefox(),
        //         new Safari()
        );
    }
}