public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	
        for(int i = 0;i < lottogroups.length ;i++){
            System.out.println("Group :"+i);
            for(int value : lottogroups[i]){

                System.out.println("  Value "+" = "+value);
            }        	
        }

    }
}
