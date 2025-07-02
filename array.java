public class array {
    public static void main(String[] args) {
        int[] a= {5,10,23,56};
        int sum =0;
         for(int i=0;i<=a.length-1;i++)
         {
            if(a[i]%2==0){
                sum = sum+a[i];}
         }
         System.out.println(sum+" ");
    }
}
