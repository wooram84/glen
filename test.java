public class Test{
	public static void main(String[] args){
		try{
			int sizeOfArgs = 0;
			sizeOfArgs = args.length;
			
			if(sizeOfArgs <= 1){
				System.out.println("parameter fail");
			}else{
				String msg = "*";
				String ast = "**";
				String empty = "";
				int loopCnt = Integer.parseInt(args[0]);
				
				for(int inc1 = 1; inc1 <= sizeOfArgs -1; inc1++){
					msg = msg + " " + args[inc1];
				}
				
				for(int inc2 = 0; inc2 <= msg.length(); inc2++){
					ast = ast + "*";
					empty = empty + " ";
				}
				System.out.println(ast);
				for(int inc3 = 0; inc3 <= loopCnt; inc3++){
					System.out.print("*");
					System.out.print(empty);
					System.out.println("*");
				}
				
				System.out.println(msg + "  *");
				
				for(int inc3 = 0; inc3 <= loopCnt; inc3++){
					System.out.print("*");
					System.out.print(empty);
					System.out.println("*");
				}
				System.out.println(ast);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
