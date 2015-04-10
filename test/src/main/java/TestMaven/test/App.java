package TestMaven.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       new App().sayHello();
    }
    public void sayHello(){
    	 System.out.println( "Hello World!" );
    	 sayError();
    	 
    }
    public void sayError(){
    	int i=0;
   	 System.out.println( "Hello Error!" );
   	 i=9/0;
   }
}
