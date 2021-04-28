package Exam;

public class Example1 {

	public static void main(String[] args) {
		
		 int num=3;
		    for(int i=0;i<num;i++){
		        for(int j=num-1;j>i;j--){
		    	System.out.printf(" ");
		        }
				    
		        for(int j=0;j<2*i+1;j++){
		        System.out.printf("*");
		        }
		        System.out.printf("\n");
		    }
			
		    for(int i=1;i<num;i++){
		        for(int j=0;j<i;j++){
		        	System.out.printf(" ");
		        }
			
		        for(int j=2*num-1;j>2*i;j--){
		        	System.out.printf("*");
		        }
		        System.out.printf("\n");
		    }

	}
}
