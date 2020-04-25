package barclays;

import java.io.IOException;

class TryCatchTest {

	public static void main(String[] args) {
			System.out.println(new TryCatchTest().show());
	}

	public int show(){
		try{
			throw new IOException();
			System.out.println("hhhhhhhh");
		}catch(IOException e){
			System.out.println("in IOException");
			throw new Exception();
		}catch(Exception e){
			System.out.println("in exception");
		}finally{
			System.out.println("in finally");
			throw new Exception();
		}
				
	}
}

