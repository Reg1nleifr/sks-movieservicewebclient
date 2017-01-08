package fhtw.technikumwien.sks.helpers;

/**
 * Created by Flo & Stefan
 */
public class GuiHelper {

    public GuiHelper(){

    }

    public static void getHomeScreen(){
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                   Movie Service Console Client                                                                     ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                   Choose target Action                                                                             ǁ");
        System.out.println("ǁ                       a.) Import Movies                                                                            ǁ");
        System.out.println("ǁ                       b.) Create Studios                                                                           ǁ");
        System.out.println("ǁ                       c.) Create Actors                                                                            ǁ");
        System.out.println("ǁ                       q.) Quit                                                                                     ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
    }

    public static void getMovieImporter(){
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                          Movie Importer                                                                            ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                         Specify File Path (xml)                                                                    ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
    }

    public static void getStudioImporter(){
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                         Studio Importer                                                                            ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                         Specify File Path (json)                                                                   ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
    }

    public static void getActorImporter(){
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                          Actor Importer                                                                            ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                         Specify File Path (json)                                                                   ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
    }

}
