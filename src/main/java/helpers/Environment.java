package helpers;

public enum Environment {
    Development("dev",
            "https://npto-dev.polteq-testing.com/index.php",
            "https://npto-dev.polteq-testing.com/admin123",
            "https://adminer-npto-dev.polteq-testing.com"),
    Acceptance( "acc",
            "https://npto-acc.polteq-testing.com/index.php",
            " https://npto-acc.polteq-testing.com/admin123",
            "https://adminer-npto-acc.polteq-testing.com/"),
    Production("prod",
            "https://npto-prod.polteq-testing.com/index.php",
            "https://npto-prod.polteq-testing.com/admin123",
                    "https://adminer-npto.polteq-testing.com/");

    private String name;
    private String applicationUrl;
    private String apiUrl;
    private String databaseUrl;

    Environment(String name, String applicationUrl, String apiUrl, String databaseUrl){
        this.name = name;
        this. applicationUrl = applicationUrl;
        this.apiUrl = apiUrl;
        this.databaseUrl = databaseUrl;
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
