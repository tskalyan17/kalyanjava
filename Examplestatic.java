class Examplestatic{
   static int a=10;
   void display_a(){
        System.out.println("a value : "+a);
	}
	
    static(System.out.println("inside static main ");a=20)
	
	Examplestatic(){
	   a++;
	}
	   
	public static void main(String args[]){
       Examplestatic es1 =new Examplestatic();
       es1.display_a();	   
	   Examplestatic es2 =new Examplestatic();
       es2.display_a();	   
	   
	}
	
}
		