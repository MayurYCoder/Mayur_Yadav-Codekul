package controlflow.forloop.patterns;

public class Triangle1 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                if(i>=j) {
                    System.out.print("  *");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





      /*  for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }




        for (int i=1; i<=3; i++){
            for(int j=3; j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
*/
    }
}