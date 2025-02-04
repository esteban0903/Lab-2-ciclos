package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length > 0){
            String message ="" ;

            for(int i = 0; i < args.length; i++) {
                message += " "+ args[i];
            }
            System.out.println( "Hello"+message);

        }else{
            System.out.println( "Hello World!");
        }
    }
}
