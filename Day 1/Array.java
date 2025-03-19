import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array ra tesko size define garneyy
        int myArray[] = new int[3];

        //array ma value lineyy
        for(int i=0; i<3; i++){
            System.out.println("Enter Array Numbers");
            myArray[i] = sc.nextInt();
        }

        //array ma k xa print garneyy
        for(int i=0; i<3; i++){
            System.out.println(myArray[i]);
        }


        //array ma value 3 kaha xa vanera khojneyy
        int value = 3;
        for(int i=0; i<3; i++){
            if(value==myArray[i]){
                System.out.println("The number is found at index" + i);
            }else{
                System.out.println("The number not available");
            }
        }
    }
}