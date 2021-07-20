package org.example;

public final class AppConfig {
    private static AppConfig appConfig;
    private String appName = null;

    private AppConfig(){

    }

    public static AppConfig getInstance(){
        if(appConfig == null){
            appConfig = new AppConfig();
        }
            return appConfig;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
