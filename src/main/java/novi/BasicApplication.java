package novi;

import ro.pippo.core.Application;

public class BasicApplication  extends Application {
    @Override
    protected void onInit() {
        GET("/", routeContext -> routeContext.send("Hello World"));
    }
}
