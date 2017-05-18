package net.soltech.library.core.commands.driver;


import net.soltech.library.handlers.WebDriverHandler;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface DriverCapabilities {

    Supplier<Capabilities> remoteCapabilities = () -> ((RemoteWebDriver) WebDriverHandler.getDriver()).getCapabilities();

    Function<Supplier<Capabilities>,Optional<Capabilities>> tryCapabilities = supplier -> {
        try { return Optional.of(supplier.get()); }
        catch (ClassCastException e) { return Optional.empty(); }
    };

    Supplier<Capabilities> getCapabilities = () ->
            tryCapabilities.apply(remoteCapabilities)
                    .orElse(new DesiredCapabilities());
}
