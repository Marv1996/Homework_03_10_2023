import service.FileService;
import service.HumanService;
import service.Util;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Util.factorial(4));
        System.out.println(Util.fibonacci(6));
        String url = "test.txt";
        System.out.println(Arrays.toString(HumanService.convert(FileService.read(url))));
//        FileService.write(url,"\nFinal");
        HumanService.sort(HumanService.convert(FileService.read(url)));
    }
}