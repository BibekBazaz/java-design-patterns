package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Phone androidPhone = PhoneFactory.getPhone(PhoneType.ANDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println( "Android : " + androidPhone.toString() );
        System.out.println( "Iphone : " + iphone.toString() );
    }
}
