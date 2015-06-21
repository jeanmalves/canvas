package com.canvas.hibernate.core.coreCanvas;

import com.canvas.hibernate.core.coreCanvas.DAO.CustomEntityManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        CustomEntityManager cm = new CustomEntityManager("postgres");
    }
}
