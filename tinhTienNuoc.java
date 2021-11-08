public class HelloWorld{
    public static int tinhTienNuoc(int oldn, int newn) {
        int bac1 = 6869, bac2 = 8110, bac3 = 9969, bac4 = 18318;
        int soNuoc = 0;
        int tienNuoc = 0;
        if (newn < 0 || newn > Math.pow(2,31) - 1 || oldn < 0 || oldn > Math.pow(2,31) - 1 || oldn > newn) {
            System.out.println("input khong hop le");
            return -1;
        } else {
            soNuoc = newn - oldn;
        }
        if (soNuoc <= 10) {
            tienNuoc = soNuoc * bac1;
        } else if (soNuoc <= 20) {
            tienNuoc = 10 * bac1 + ((soNuoc - 10) * bac2);
        } else if (soNuoc <= 30) {
            tienNuoc = 10 * bac1 + 10 * bac2 + ((soNuoc - 20) * bac3);
        } else {
             tienNuoc = 10 * bac1 + 10 * bac2 + 10 * bac3 + ((soNuoc - 30) * bac4);
        }
        return tienNuoc;
        
    }
     public static void main(String []args){
        
        System.out.println(tinhTienNuoc(9, 60));
       
     }
}