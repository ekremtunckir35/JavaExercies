package variables01;

public class Question3 {
    //Basit faizi bulmak icin bir kod yaziniz.
    //Not =Basit faiz  formulu===> anapara * oran * yilDegeri/100

    public static void main(String[] args) {
         int anaPara= 20000;
         float oran = 3;
         float yilDegeri =3;
        int basitFaiz = (int) (anaPara * oran  * yilDegeri /100);
        System.out.println("Basit faiz degeri:" + basitFaiz);
    }
}
