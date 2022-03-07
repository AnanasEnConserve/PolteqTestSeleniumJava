package helpers;

import io.cucumber.java.af.En;

public enum Environment {
    Development("https://npto-dev.polteq-testing.com/index.php",
            "https://npto-dev.polteq-testing.com/admin123",
            "https://adminer-dev.polteq-testing.com/??????"),
    Acceptance( "https://npto-acc.polteq-testing.com/index.php",
            " https://npto-acc.polteq-testing.com/admin123",
            "https://adminer-acc.polteq-testing.com/"),
    Production("https://npto-prod.polteq-testing.com/index.php",
            "https://npto-prod.polteq-testing.com/admin123",
                    "https://adminer-prod.polteq-testing.com/??????");

    private String applicationUrl;
    private String apiUrl;
    private String databaseUrl;

    Environment(String applicationUrl, String apiUrl, String databaseUrl){
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


}
