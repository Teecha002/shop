import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Menu1 = 0;
        int Menu2 = 0;
        int Menu3 = 0;
        int Menu4 = 0;
        int Menu5 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("สวัสดีครับคุณลูกค้าไม่ทราบว่าคุณลูกค้าต้องการรับประทานอะไรดีครับ");
        System.out.println("1.ส้มตำปูปาร้า");
        System.out.println("2.ตำข้าวโพดเเซ่บนัวเวอร์");
        System.out.println("3.ไก่ย่างพันดาว");
        System.out.println("4.ลูกชิ้นเนื้อหมูสวรรค์");
        System.out.println("5.ก๋วยเตี๋ยวต้มยำน้ำใสเครื่องข้น");
        System.out.println("กด 6 เพื่อยกเลิกการสั่งหรือสรุปรายการ");

        int choiceMenu;
        do {
            System.out.println("กรุณาเลือกหมายเลขเมนูที่ต้องการ (หรือกด 6 เพื่อยกเลิกรายการ): ");
            choiceMenu = scanner.nextInt();
            switch (choiceMenu) {
                case 1:
                    System.out.println("คุณเลือก: ส้มตำปูปาร้า");
                    Menu1++;
                    break;
                case 2:
                    System.out.println("คุณเลือก: ตำข้าวโพดแซ่บนัวเวอร์");
                    Menu2++;
                    break;
                case 3:
                    System.out.println("คุณเลือก: ไก่ย่างพันดาว");
                    Menu3++;
                    break;
                case 4:
                    System.out.println("คุณเลือก: ลูกชิ้นเนื้อหมูสวรรค์");
                    Menu4++;
                    break;
                case 5:
                    System.out.println("คุณเลือก: ก๋วยเตี๋ยวต้มยำน้ำใสเครื่องข้น");
                    Menu5++;
                    break;
                case 6:
                    System.out.println("ยกเลิกรายการ");
                    break;
                default:
                    System.out.println("กรุณาเลือกหมายเลขเมนูที่ถูกต้อง");
            }

        } while (choiceMenu != 6);

        System.out.println("สรุปจำนวนที่สั่ง:");
        System.out.println("1. ส้มตำปูปาร้า: " + Menu1);
        System.out.println("2. ตำข้าวโพดแซ่บนัวเวอร์: " + Menu2);
        System.out.println("3. ไก่ย่างพันดาว: " + Menu3);
        System.out.println("4. ลูกชิ้นเนื้อหมูสวรรค์: " + Menu4);
        System.out.println("5. ก๋วยเตี๋ยวต้มยำน้ำใสเครื่องข้น: " + Menu5);

        }
    }
