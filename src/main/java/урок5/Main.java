package урок5;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        AppData appData = new AppData();
        appData.load("src/main/java/HW_5/text.csv");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("src/main/java/HW_5/text_1.csv");
    }
}

