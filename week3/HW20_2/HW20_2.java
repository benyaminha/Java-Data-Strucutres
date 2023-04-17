import java.io.File;
import java.util.*;
public class HW20_2{
    public static void main(String[] args) {
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        System.out.println(getSize(new File(directory)) + " bytes");
    }

    private static long getSize(File file) {
        long size = 0;
        Queue<File> files = new LinkedList<>();

        
        for(File i : file.listFiles()) {
            files.offer(i);
        }
        File t;
        while(!files.isEmpty()) {
            t = files.remove();
            if(t.isFile()){
                size+=t.length();
            } 
            else {
                for(File i : file.listFiles()) {
                    files.offer(i);
                }
            }
        }
        return size;
    }
}
