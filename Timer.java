
public class Timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int count =0;count<5;count++)
         
         {
        	 System.out.println("Hello");
        	 try{
        		 Thread.sleep(5000);
        		 
        	 }catch(InterruptedException e){
        		 e.printStackTrace();
        		 
        	 }
         }

	}

}
