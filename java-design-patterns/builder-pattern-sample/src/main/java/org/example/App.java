package org.example;

import org.example.directors.Director;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Director director = new Director();
        System.out.println(director.createCandidate().toString());
    }
}
