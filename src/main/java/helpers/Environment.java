package helpers;

public enum Environment {
    Development("dev",
            "npto-dev.polteq-testing.com",
            "https://npto-dev.polteq-testing.com/index.php",
            "https://npto-dev.polteq-testing.com/admin123",
            "https://adminer-npto-dev.polteq-testing.com"),
    Acceptance( "acc",
            "npto-acc.polteq-testing.com",
            "https://npto-acc.polteq-testing.com/index.php",
            "https://npto-acc.polteq-testing.com", //admin123
            "https://adminer-npto-acc.polteq-testing.com/"),
    Production("prod",
            "npto-prod.polteq-testing.com",
            "https://npto-prod.polteq-testing.com/index.php",
            "https://npto-prod.polteq-testing.com/admin123",
            "https://adminer-npto.polteq-testing.com/");

    private final String name;
    private final String server;
    private final String applicationUrl;
    private final String apiUrl;
    private final String databaseUrl;

    Environment(String name, String server, String applicationUrl, String apiUrl, String databaseUrl){
        this.name = name;
        this.server = server;
        this. applicationUrl = applicationUrl;
        this.apiUrl = apiUrl;
        this.databaseUrl = databaseUrl;
    }

    public String getServer() {
        return server;
    }

    public String getApiUrl(){
        return apiUrl;
    }

    public String getApplicationUrl(){
        return applicationUrl;
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }

    public String getName(){
        return name;
    }


}
