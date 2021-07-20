package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        setAppName_1("AVV");
        setAppName_2("WER");
        //No instantiation of Appconfig here but retaining the value last updated in setAppName_2 as Singleton
        System.out.println( "App name is : " + AppConfig.getInstance().getAppName() );
    }

    public static void setAppName_1(String name_1){
        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setAppName(name_1);
        System.out.println( "App name is : " + AppConfig.getInstance().getAppName() );
    }
    public static void setAppName_2(String name_2){
        //getting the same object created in setAppName_1
        AppConfig appConfig = AppConfig.getInstance();
        //getting the name set in setAppName_1 as the object created is singleton
        System.out.println( "App name is : " + AppConfig.getInstance().getAppName() );
        //updating the value of the singleton object to set a new name
        appConfig.setAppName(name_2);
        System.out.println( "App name is : " + AppConfig.getInstance().getAppName() );
    }

}
