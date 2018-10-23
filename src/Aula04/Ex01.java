package Aula04;

public class Ex01 {
    public static void main(String[] args) {
        int num;
        for(int lance=1;  lance<=3; lance++){
            num =  (int) (Math.random()*5)+1;
            System.out.println("Lance"+ num);

        }
    }
}
