import java.util.*;

public class FinalProject {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        //untuk membuat program terus berulang
        boolean running = true;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
        
        //Interface
        System.out.println("========== Selamat Datang di Aplikasi MiniMaps ==========");
        
        
        System.out.println("Pilihan Fitur: ");
        System.out.println("a. Musholla Terdekat\n" + "b. Pom Bensin Terdekat\n" + "c. Minimarket Terdekat");
        System.out.println("=========================================================");
        System.out.print("Silahkan pilih fitur yang ingin digunakan : ");
        
        //Pemilihan Menu   
        char InputPilihan = in.next().charAt(0);
        String a = "Musholla Terdekat";
        String b = "Pom Bensin Terdekat";
        String c = "Mini Market Terdekat";
        String PilihanMenu = IsiMenu(InputPilihan);

        switch(PilihanMenu){
        case "a":
        PilihanMenu = a;
        MenuMusholla(a);
        break;
        case "b":
        PilihanMenu = b;
        MenuPomBensin(b);
        break;
        case "c":
        PilihanMenu = c;
        MenuMiniMarket(c);
        break;
        }
        System.out.println("=========================================================");
        System.out.println("Apakah anda ingin keluar?");
            System.out.printf("Jawab [ya/tidak] : ");
            
            jawab = scan.nextLine();

            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

        }//akhir dari program perulangan
        System.out.println("===================== Terima Kasih ======================");

    }
    
    protected static String IsiMenu(char InputMenu) {
        Scanner in = new Scanner(System.in);
        //Input User
        String ListMenu[] = {
            "\n=================== Musholla Terdekat ===================",
            "\n================== Pom Bensin Terdekat ==================", 
            "\n================== Minimarket Terdekat =================="
        };
    
        String Menu1 = ListMenu[0];
        String Menu2 = ListMenu[1];
        String Menu3 = ListMenu[2];
    
        //Logika Input Menu
        for (int i = 0; i <= 9999; i++) {
            if (InputMenu == 'a' || InputMenu == 'b' || InputMenu == 'c') {
                if (InputMenu == 'a') {
                    System.out.println(Menu1); break;
                } else if (InputMenu == 'b') {
                    System.out.println(Menu2); break;
                } else {
                    System.out.println(Menu3); break;
                }
            } else {
                System.out.println("Fitur yang anda masukkan tidak tersedia!");
                System.out.println("=========================================================");
                System.out.print("Masukkan ulang fitur yang ingin digunakan : ");
                InputMenu = in.next().charAt(0);
            }
        }
        return Character.toString(InputMenu);
      
    }
    //Menu Musholla
    private static String MenuMusholla(String DataUser) {
        Scanner in = new Scanner (System.in);
        
        String NamaMusholla,NamaMusholla2 = null;
    
        System.out.print("Silahkan masukkan titik tempat anda saat ini (x,y): ");
        double TitikUserX = in.nextDouble(), TitikUserY = in.nextDouble();
        System.out.println("=========================================================");
    
    //rumus untuk mencari jarak dari 2 titik
        double Musholla1 = Math.sqrt(((-7 - TitikUserX)*(-7 - TitikUserX)) + (( 5 - TitikUserY)*( 5 - TitikUserY)));
        double Musholla2 = Math.sqrt(((-2 - TitikUserX)*(-2 - TitikUserX)) + ((-4 - TitikUserY)*(-4 - TitikUserY)));
        double Musholla3 = Math.sqrt((( 9 - TitikUserX)*( 8 - TitikUserX)) + ((-4 - TitikUserY)*(-4 - TitikUserY)));
        double Musholla4 = Math.sqrt((( 3 - TitikUserX)*( 3 - TitikUserX)) + (( 8 - TitikUserY)*( 8 - TitikUserY)));
        double Musholla5 = Math.sqrt(((-1 - TitikUserX)*(-1 - TitikUserX)) + (( 1 - TitikUserY)*( 1 - TitikUserY)));
    
    //untuk mencari Musholla terdekat
        double terdekat = Math.min(Musholla5,Math.min(Musholla4,Math.min(Musholla3, Math.min(Musholla1,Musholla2))));
        double terdekat2;
        
    //untuk mencari musholla terdekat ke 2, dan menentukan nama 2 mushola yang terdekat
        if (terdekat == Musholla1){
            NamaMusholla = "Musholla 1";
                terdekat2 = Math.min(Musholla5,Math.min(Musholla4,Math.min(Musholla3,Musholla2)));
                if (terdekat2 == Musholla2){
                    NamaMusholla2 = "Musholla 2";     
                }else if(terdekat2 == Musholla3){
                    NamaMusholla2 = "Musholla 3";
                }else if(terdekat2 == Musholla4){
                    NamaMusholla2 = "Musholla 4";
                } else {
                    NamaMusholla2 = "Musholla 5";       
                }
        }else if(terdekat == Musholla2){
            NamaMusholla = "Musholla 2";
                terdekat2 = Math.min(Musholla5,Math.min(Musholla4,Math.min(Musholla3,Musholla1)));
                if (terdekat2 == Musholla1){
                    NamaMusholla2 = "Musholla 1";     
                }else if(terdekat2 == Musholla3){
                    NamaMusholla2 = "Musholla 3";
                }else if(terdekat2 == Musholla4){
                    NamaMusholla2 = "Musholla 4";
                } else {
                    NamaMusholla2 = "Musholla 5";       
                }
        }else if(terdekat == Musholla3){
            NamaMusholla = "Musholla 3";
                terdekat2 = Math.min(Musholla5,Math.min(Musholla4,Math.min(Musholla2,Musholla1)));
                if (terdekat2 == Musholla1){
                    NamaMusholla2 = "Musholla 1";     
                }else if(terdekat2 == Musholla2){
                    NamaMusholla2 = "Musholla 2";
                }else if(terdekat2 == Musholla4){
                    NamaMusholla2 = "Musholla 4";
                } else {
                    NamaMusholla2 = "Musholla 5";       
                }
        }else if(terdekat == Musholla4){
            NamaMusholla = "Musholla 4";
                terdekat2 = Math.min(Musholla5,Math.min(Musholla2,Math.min(Musholla3,Musholla1)));
                if (terdekat2 == Musholla1){
                    NamaMusholla2 = "Musholla 1";     
                }else if(terdekat2 == Musholla3){
                    NamaMusholla2 = "Musholla 3";
                }else if(terdekat2 == Musholla2){
                    NamaMusholla2 = "Musholla 2";
                } else {
                    NamaMusholla2 = "Musholla 5";       
                }
        } else {
            NamaMusholla = "Musholla 5";
                terdekat2 = Math.min(Musholla4,Math.min(Musholla2,Math.min(Musholla3,Musholla1)));
                if (terdekat2 == Musholla1){
                    NamaMusholla2 = "Musholla 1";     
                }else if(terdekat2 == Musholla3){
                    NamaMusholla2 = "Musholla 3";
                }else if(terdekat2 == Musholla2){
                    NamaMusholla2 = "Musholla 2";
                } else {
                    NamaMusholla2 = "Musholla 4";
                        }
                }
    System.out.println("Musholla terdekat dari anda adalah :");
    System.out.printf ("%s dengan jarak %.2fkm \n",NamaMusholla,terdekat);
    System.out.printf ("%s dengan jarak %.2fkm \n",NamaMusholla2,terdekat2);
    return DataUser;
    }
    
    //Menu Pom Bensin
    public static String MenuPomBensin(String DataUser2){
        Scanner in = new Scanner (System.in);
    
        String NamaPomBensin,NamaPomBensin2 = null;
    
        System.out.print("Silahkan masukkan titik tempat anda saat ini (x,y): ");
        double TitikUserX = in.nextDouble(), TitikUserY = in.nextDouble();
        System.out.println("=========================================================");
    
    //rumus untuk mencari jarak dari 2 titik   
        double PomBensin1 = Math.sqrt(((-8 - TitikUserX)*(-8 - TitikUserX)) + (( 3 - TitikUserY)*( 3 - TitikUserY)));
        double PomBensin2 = Math.sqrt(((-9 - TitikUserX)*(-9 - TitikUserX)) + ((-4 - TitikUserY)*(-4 - TitikUserY)));
        double PomBensin3 = Math.sqrt((( 2 - TitikUserX)*( 2 - TitikUserX)) + ((-4 - TitikUserY)*(-4 - TitikUserY)));
        double PomBensin4 = Math.sqrt((( 5 - TitikUserX)*( 5 - TitikUserX)) + (( 7 - TitikUserY)*( 7 - TitikUserY)));
        double PomBensin5 = Math.sqrt((( 0 - TitikUserX)*( 0 - TitikUserX)) + (( 1 - TitikUserY)*( 1 - TitikUserY)));
    
    //untuk mencari pom bensin terdekat
        double terdekat = Math.min(PomBensin5,Math.min(PomBensin4,Math.min(PomBensin3, Math.min(PomBensin1,PomBensin2))));
        double terdekat2;
    
    //untuk mencari pom bensin terdekat ke 2, dan menentukan nama 2 pom bensin yang terdekat
        if (terdekat == PomBensin1){
            NamaPomBensin = "Pom Bensin 1";
                terdekat2 = Math.min(PomBensin5,Math.min(PomBensin4,Math.min(PomBensin3,PomBensin2)));
                if (terdekat2 == PomBensin2){
                    NamaPomBensin2 = "Pom Bensin 2";     
                }else if(terdekat2 == PomBensin3){
                    NamaPomBensin2 = "Pom Bensin 3";
                }else if(terdekat2 == PomBensin4){
                    NamaPomBensin2 = "Pom Bensin 4";
                } else {
                    NamaPomBensin2 = "Pom Bensin 5";       
                }
        }else if(terdekat == PomBensin2){
            NamaPomBensin = "Pom Bensin 2";
                terdekat2 = Math.min(PomBensin5,Math.min(PomBensin4,Math.min(PomBensin3,PomBensin1)));
                if (terdekat2 == PomBensin1){
                    NamaPomBensin2 = "Pom Bensin 1";     
                }else if(terdekat2 == PomBensin3){
                    NamaPomBensin = "Pom Bensin 3";
                }else if(terdekat2 == PomBensin4){
                    NamaPomBensin2 = "Pom Bensin 4";
                } else {
                    NamaPomBensin2 = "Pom Bensin 5";       
                }
        }else if(terdekat == PomBensin3){
            NamaPomBensin = "Pom Bensin 3";
                terdekat2 = Math.min(PomBensin5,Math.min(PomBensin4,Math.min(PomBensin1,PomBensin2)));
                if (terdekat2 == PomBensin1){
                    NamaPomBensin2 = "Pom Bensin 1";     
                }else if(terdekat2 == PomBensin2){
                    NamaPomBensin2 = "Pom Bensin 2";
                }else if(terdekat2 == PomBensin4){
                    NamaPomBensin2 = "Pom Bensin 4";
                } else {
                    NamaPomBensin2 = "Pom Bensin 5";       
                }
        }else if(terdekat == PomBensin4){
            NamaPomBensin = "Pom Bensin 4";
                terdekat2 = Math.min(PomBensin5,Math.min(PomBensin1,Math.min(PomBensin3,PomBensin2)));
                if (terdekat2 == PomBensin1){
                    NamaPomBensin2 = "Pom Bensin 1";     
                }else if(terdekat2 == PomBensin2){
                    NamaPomBensin2 = "Pom Bensin 2";
                }else if(terdekat2 == PomBensin3){
                    NamaPomBensin2 = "Pom Bensin 3";
                } else {
                    NamaPomBensin2 = "Pom Bensin 5";       
                }
        } else {
            NamaPomBensin = "Pom Bensin 5";
                terdekat2 = Math.min(PomBensin1,Math.min(PomBensin4,Math.min(PomBensin3,PomBensin2)));
                if (terdekat2 == PomBensin1){
                    NamaPomBensin2 = "Pom Bensin 1";     
                }else if(terdekat2 == PomBensin2){
                    NamaPomBensin2 = "Pom Bensin 2";
                }else if(terdekat2 == PomBensin3){
                    NamaPomBensin2 = "Pom Bensin 3";
                } else {
                    NamaPomBensin2 = "Pom Bensin 4";       
                        }
                }   
    
    System.out.println("Pom bensin terdekat dari anda adalah :");
    System.out.printf ("%s dengan jarak %.2fkm \n",NamaPomBensin,terdekat);
    System.out.printf ("%s dengan jarak %.2fkm \n",NamaPomBensin2,terdekat2);
    return DataUser2;
    }
    
    //Menu Mini Market
    public static String MenuMiniMarket(String DataUser3){
        Scanner in = new Scanner (System.in);
    
        String NamaMiniMarket,NamaMiniMarket2 = null;
    
        System.out.print("Silahkan masukkan titik tempat anda saat ini (x,y): ");
        double TitikUserX = in.nextDouble(), TitikUserY = in.nextDouble();
        System.out.println("=========================================================");
    
    //rumus untuk mencari jarak dari 2 titik      
        double MiniMarket1 = Math.sqrt(((-2 - TitikUserX)*(-2 - TitikUserX)) + (( 4 - TitikUserY)*( 4 - TitikUserY)));
        double MiniMarket2 = Math.sqrt(((-9 - TitikUserX)*(-9 - TitikUserX)) + ((-4 - TitikUserY)*(-4 - TitikUserY)));
        double MiniMarket3 = Math.sqrt((( 5 - TitikUserX)*( 5 - TitikUserX)) + ((-7 - TitikUserY)*(-7 - TitikUserY)));
        double MiniMarket4 = Math.sqrt((( 8 - TitikUserX)*( 8 - TitikUserX)) + (( 3 - TitikUserY)*( 3 - TitikUserY)));
        double MiniMarket5 = Math.sqrt((( 1 - TitikUserX)*( 1 - TitikUserX)) + (( 1 - TitikUserY)*( 1 - TitikUserY)));
    
    //untuk mencari Mini Market terdekat
        double terdekat = Math.min(MiniMarket5,Math.min(MiniMarket4,Math.min(MiniMarket3, Math.min(MiniMarket1,MiniMarket2))));
        double terdekat2;
    
    //untuk mencari mini market terdekat ke 2, dan menentukan nama 2 mini market yang terdekat
        if (terdekat == MiniMarket1){
            NamaMiniMarket = "Mini Market 1";
                terdekat2 = Math.min(MiniMarket5,Math.min(MiniMarket4,Math.min(MiniMarket3,MiniMarket2)));
                if (terdekat2 == MiniMarket2){
                    NamaMiniMarket2 = "Mini Market 2";     
                }else if(terdekat2 == MiniMarket3){
                    NamaMiniMarket2 = "Mini Market 3";
                }else if(terdekat2 == MiniMarket4){
                    NamaMiniMarket2 = "Mini Market 4";
                } else {
                    NamaMiniMarket2 = "Mini Market 5";       
                }
        }else if(terdekat == MiniMarket2){
            NamaMiniMarket = "Mini Market 2";
                terdekat2 = Math.min(MiniMarket5,Math.min(MiniMarket4,Math.min(MiniMarket3,MiniMarket1)));
                if (terdekat2 == MiniMarket1){
                    NamaMiniMarket2 = "Mini Market 1";     
                }else if(terdekat2 == MiniMarket3){
                    NamaMiniMarket = "Mini Market 3";
                }else if(terdekat2 == MiniMarket4){
                    NamaMiniMarket2 = "Mini Market 4";
                } else {
                    NamaMiniMarket2 = "Mini Market 5";       
                }
        }else if(terdekat == MiniMarket3){
            NamaMiniMarket = "Mini Market 3";
                terdekat2 = Math.min(MiniMarket5,Math.min(MiniMarket4,Math.min(MiniMarket1,MiniMarket2)));
                if (terdekat2 == MiniMarket1){
                    NamaMiniMarket2 = "Mini Market 1";     
                }else if(terdekat2 == MiniMarket2){
                    NamaMiniMarket2 = "Mini Market 2";
                }else if(terdekat2 == MiniMarket4){
                    NamaMiniMarket2 = "Mini Market 4";
                } else {
                    NamaMiniMarket2 = "Mini Market 5";       
                }
        }else if(terdekat == MiniMarket4){
            NamaMiniMarket = "Mini Market 4";
                terdekat2 = Math.min(MiniMarket5,Math.min(MiniMarket1,Math.min(MiniMarket3,MiniMarket2)));
                if (terdekat2 == MiniMarket1){
                    NamaMiniMarket2 = "Mini Market 1";     
                }else if(terdekat2 == MiniMarket2){
                    NamaMiniMarket2 = "Mini Market 2";
                }else if(terdekat2 == MiniMarket3){
                    NamaMiniMarket2 = "Mini Market 3";
                } else {
                    NamaMiniMarket2 = "Mini Market 5";       
                }
        } else {
            NamaMiniMarket = "Mini Market 5";
                terdekat2 = Math.min(MiniMarket1,Math.min(MiniMarket4,Math.min(MiniMarket3,MiniMarket2)));
                if (terdekat2 == MiniMarket1){
                    NamaMiniMarket2 = "Mini Market 1";     
                }else if(terdekat2 == MiniMarket2){
                    NamaMiniMarket2 = "Mini Market 2";
                }else if(terdekat2 == MiniMarket3){
                    NamaMiniMarket2 = "Mini Market 3";
                } else {
                    NamaMiniMarket2 = "Mini Market 4";       
                        }
                }   
    
    System.out.println("Mini Market terdekat dari anda adalah :");
    System.out.printf ("%s dengan jarak %.2fkm \n",NamaMiniMarket,terdekat);
    System.out.printf ("%s dengan jarak %.2fkm \n",NamaMiniMarket2,terdekat2);
    return DataUser3;   
    }

}    
