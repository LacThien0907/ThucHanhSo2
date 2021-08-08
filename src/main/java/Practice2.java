public class Practice2 {
    public static void main(String[] args) {
        // BAI 1
        int Num1 = 4;
        switch (Num1) {
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;
            default:
                System.out.println("Not found"); }
        // BAI 3
        int aNumber3 = 2;
        int bNumber3 = 4;
        double result;
        if(aNumber3 == 0)
        {if (bNumber3 == 0) {
            System.out.println("Phương trình này có vô số nghiệm.");
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }

            }
        else{
            result = (double) -bNumber3 / aNumber3;
            System.out.println("Phương trình có nghiệm x = " + result );
        }

        // BAI 4
        int aNumber4 = 2;
        int bNumber4 = -4;
        int cNumber = 2;
        double result4;

        if(aNumber4 == 0)
        {if (bNumber4 == 0) {
            System.out.println("Phương trình này có vô số nghiệm.");
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }

        }
        float delta = bNumber4*bNumber4 - 4*aNumber4*cNumber;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-bNumber4 + Math.sqrt(delta)) / (2*aNumber4));
            x2 = (float) ((-bNumber4 - Math.sqrt(delta)) / (2*aNumber4));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-bNumber4 / (2 * aNumber4));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");

        }
        // BAI 5
        int A5 = 10;
        int B5 = 20;
        int C5 = -6;
        int D5 = 0;
        int E5 = 100;
        int Min5 = A5;
        if(B5 < Min5){
            Min5 = B5;}
        if (C5 < Min5){
            Min5 = C5;}
        if (D5 < Min5){
            Min5 = D5;;}
        if (E5 < Min5){
            Min5 = E5;}
        System.out.println("Gia tri nho nhat la: " + Min5);

        //BAI 6
            int A6 = 15;
            int B6 = 8;
            int C6 = -7;
            int D6 = 0;

            if (A6 > B6) {
                A6 = A6 + B6;
                B6 = A6 - B6;
                A6 = A6 - B6;
            }
            if (A6 > C6) {
                A6 = A6 + C6;
                C6 = A6 - C6;
                A6 = A6 - C6;
            }
            if (A6 > D6) {
                A6 = A6 + D6;
                D6 = A6 - D6;
                A6 = A6 - D6;
            }
            if (B6 > C6) {
                B6 = B6 + C6;
                C6 = B6 - C6;
                B6 = B6 - C6;
            }
            if (B6 > D6) {
                B6 = B6 + D6;
                D6 = B6 - D6;
                B6 = B6 - D6;
            }
            if (C6 > D6) {
                C6 = C6 + D6;
                D6 = C6 - D6;
                C6 = C6 - D6;
            }

        // BAI 7
        double SoKm = 125;
            if(SoKm <= 1){
                System.out.println("So tien phai tra: 13500đ");}
            if(2 <= SoKm &&  SoKm<= 5 ){
                System.out.println("So tien phai tra: " + SoKm*13500 +"đ");}
            if(6 < SoKm){
                System.out.println("So tien phai tra: " + SoKm*11000 +"đ");}
            if(SoKm>120){
                System.out.println("So tien phai tra: " + SoKm*11000*0.9 +"đ");}

        // BAI 9
        double A8 = 10, B8 = 8, C8 = 6;
        if((A8 + B8 > C8) || (A8 + C8 > B8) || (B8 + C8 > A8)){
            if((A8 == B8) && (A8 == C8) && (B8 == C8)){
                System.out.print("Đây là tam giác đều");}
            else if ((A8 == B8) || (A8 == C8) || (B8 == C8)){
                System.out.print("Đây là tam giác cân");}
            else if ((A8 * A8 == B8 * B8 + C8 * C8) || (B8 * B8 == A8 * A8 + C8 * C8) || (C8 * C8 == B8 * B8 + A8 * A8)){
                System.out.println("Đây là tam giác vuông");
            }
            else{
                System.out.println("Đây không phải tam giác");}
        }

        //BAI 8
        int thang = 2, nam = 2021;
        switch (thang) {
            case 1:
                System.out.println("31 Ngay");
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
                    System.out.println("29 Ngay");
                else
                    System.out.println("28 Ngay");
                break;
            case 3:
                System.out.println("31 Ngay");
                break;
            case 4:
                System.out.println("30 Ngay");
                break;
            case 5:
                System.out.println("31 Ngay");
                break;
            case 6:
                System.out.println("30 Ngay");
                break;
            case 7:
                System.out.println("31 Ngay");
                break;
            case 8:
                System.out.println("31 Ngay");
                break;
            case 9:
                System.out.println("30 Ngay");
                break;
            case 10:
                System.out.println("31 Ngay");
                break;
            case 11:
                System.out.println("30 Ngay");
                break;
            case 12:
                System.out.println("31 Ngay");
                break;
        }

}

}





