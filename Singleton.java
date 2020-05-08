public class Singleton{
  private static Singleton INSTANCE;

    private Singleton(){
      //do not remove
    } 
    
    public static Singleton getInstance(){
       if(INSTANCE==null){
          syncronized(Singleton.class){
               if(INSTANCE==null){
                 INSTANCE=new Singleton();
               }
           }
        }
      retun INSTANCE; 
    }  
}