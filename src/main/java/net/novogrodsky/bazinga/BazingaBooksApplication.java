package net.novogrodsky.bazinga;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BazingaBooksApplication extends Application<BazingaBooksConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BazingaBooksApplication().run(args);
    }

    @Override
    public String getName() {
        return "BazingaBooks";
    }

    @Override
    public void initialize(final Bootstrap<BazingaBooksConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final BazingaBooksConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
