package _02_Безверхий_Едуард_Володимирович.laba3;

public class Main2 {
     public static void main(String[] args) {

         /*int i = 2;
//         i++;
         System.out.println("++i = " + ++i);*/


         String str = "В этой статье речь пойдет про одну. " +
                 "Из немногих социальных программ, ориентированную на пользователей, " +
                 "которые проводят много времени на различных форумах. Скачать " +
                 "Tapatalk для андроид и установить себе на телефон можно " +
                 "воспользовавшись. Гугл плеймаркетом, все очень просто и займет " +
                 "по времени не более пяти минут.";
         Text str2 = new Text(str);
         //str2.getWords();
         System.out.println("Начальный текст\n");
         str2.getSentence();
         str2.SortingByWordCount();
         System.out.println("Текст после сортировки по предложениям\n");
         str2.getSentence();
    }
}
