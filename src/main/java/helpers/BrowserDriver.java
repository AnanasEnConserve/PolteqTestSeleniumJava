package helpers;

public enum BrowserDriver {
    ChromeLocal("chrome",
            "local"),
    ChromeRemote("chrome",
            "remote"),
    FireFoxLocal("firefox",
            "local"),
    FireFoxRemote("firefox",
            "remote");

    private String browserName;
    private String driverType;

    BrowserDriver(String browserName, String driverType){
        this.browserName = browserName;
        this.driverType = driverType;
    }

    public String getBrowserName(){
        return browserName;
    }

    public String getDriverType(){
        return driverType;
    }

}
