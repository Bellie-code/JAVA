package nested;

public class nested_if{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=56;
		
	    if ((age<18) | (age==18)){
	    	System.out.println("The person is teenager");
	    }
			
		else if ((age>19) | (age<50)){
	    		System.out.println("The person an adult.");	
	    }
	    else{
	    			System.out.println("The person is old.");
	    }
	   // if
	    {
        int temp=30;
        if (temp<30) {
        	if (temp<23) {
        		System.out.println("weather is chill.");
        	}
        	else {
        		System.out.println("Weather is little sunny.");
        	}
        }
	    }
	}
}
	
	

      
      

