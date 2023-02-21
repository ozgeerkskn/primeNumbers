// 1'den 100'e kadar olan sayıların asal olup olmadığını gösteren program.
public class Main {
    public static void main(String[] args) {
     int i, j;
        i=1;
        if(i==1){
            System.out.println(i+" asal sayı değildir.");
        }
        i+=1;
        if(i==2){
            System.out.println(i+" en küçük asal sayıdır.");
        }
        for(i = 3;i<=100;i++){
            int counter = 0;
            for( j = 2;j<i;j++){
                if(i%j==0){
                    counter+=1;
                }
            }
            if(counter==0){
                System.out.println(i+" asal sayıdır.");
            }else{
                System.out.println(i+" asal sayı değildir.");
            }
        }
    }
}