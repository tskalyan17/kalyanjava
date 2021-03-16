class Logicgates{

int or_gate(int in1, int in2 ){
   
    int a,b;
	a = in1;
	b = in2;
	int ans;
	
	int or_gate;
	
	or_gate = a | b;
	return or_gate;
}

int nor_gate(int in1, int in2 ){
   
    int nor_ans;
	int a = in1;
	int b = in2;
    if( a==0 && b==0 )
	    nor_ans =1;
	else
	    nor_ans =0;
	   

	return nor_ans;
}

public static void main(String args[]){
    int inp1 =1;
    int inp2 =0;
	
    Logicgates lg = new Logicgates();
	int result_or = lg.or_gate(inp1,inp2);
    int result_nor = lg.nor_gate(inp1,inp2);
    System.out.println("result of or_gate :"+result_or);
	System.out.println("result of nor_gate :"+result_nor);
    }
}
