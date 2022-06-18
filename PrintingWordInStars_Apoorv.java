import java.util.Arrays;

public class PrintingWordInStars_Apoorv {
    public static void printt(int[] arr,String major,String minor) {


        for(int i=1;i<=41;i++){
            if(i%6==0 && i!=1){
                System.out.print("  ");
                continue;
            }
            if (search(arr,i)) {
                System.out.print(minor);
            }else{
                System.out.print(major);
            }
        }
        System.out.println();
    }

    public static boolean search(int[] arr,int i) {
        for (int k:arr) {
            if(k==i)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println("PRINTING TELUSKO");
        int arr1[]={14, 15, 16, 17,20,21,22,32,33,34};
        printt(arr1,"*"," ");

        int arr2[]={3,7,13,19,23,25,31,34,37,41};
        printt(arr2," ","*");

        int arr3[]={1,2,4,5,14,15,16,17,20,21,22,34,35,38,39,40};
        printt(arr3,"*"," ");

        int arr4[]={3,7,13,19,23,29,31,34,37,41};
        printt(arr4," ","*");

        int arr5[]={1,2,4,5,32,33,34};
        printt(arr5,"*"," ");

        System.out.println();
        System.out.println("PRINTING INEURON");
        System.out.println();

        int arr6[]={1,2,4,5,8,9,10,20,21,22,38,39,40};
        printt(arr6,"*"," ");

        int arr7[]={3,7,8,11,13,19,23,25,29,31,35,37,38,41};
        printt(arr7," ","*");

        int arr8[]={3,7,9,11,13,14,15,16,17,19,23,25,26,27,31,35,37,39,41};
        printt(arr8," ","*");

        int arr9[]={3,7,10,11,13,19,23,25,29,31,35,37,40,41};
        printt(arr9," ","*");

        int arr10[]={1,2,4,5,8,9,10,26,27,28,38,39,40};
        printt(arr10,"*"," ");
    }
}
