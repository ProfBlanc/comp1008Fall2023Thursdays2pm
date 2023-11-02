import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Week8 {

    public static void main(String[] args) {
           // example2();
        try{
            example12();
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
    static void example1(){
        /*
        What is File Manipulation (FM)
        Adding, Modifying, Deleting files in the environment File System
            adding or removing or modifying files

        Why do it?
            Save data => persistent
            RN: data is destroyed at end of program/script execution

        Persistent Data
            Database
                mysql, mssql, others
            File-based
                sqlite. files and folders

        How does java implement FM
        packages
            java.io.*           *=classes
            java.nio.*          *=classes

        Classes
        Paths
            class with all static methods
                Paths.method()
            like an address:
                1 Georgian Drive

            Paths.get() => create an address location or path
        Files
            class with all static methods
                Files.method()
            like an item/building/home/file or folder located at the address/path
                A-building, StudentLife, C-Building, Parking lot A
            quick shortcut to operate on a PATH (file or folder)
                Files.exists(path)
                Files.createDirectory(path)
                Files.delete(path)

        Path
            object: save a path in the FS
        File
            an object that points to ONE specified file or folder
                operate on this file or folder
                    CRUD: Create, Read/write, Update, Delete

         */
        Path p1 = Paths.get("src");
        Path p2 = Paths.get("out", "production", "untitled");
        Path p3 = Paths.get("out/productions/untitled");
        //Paths.get("src", "Week8.java");
        Path p4 = Paths.get("src").resolve("Week8.java");

        System.out.println(Paths.get("").toAbsolutePath());

    }
    static Path rootPath = Paths.get("src");
    static void example2(){

        /*
            Path and File are easily convertible from one to the other
         */
        File f1 = rootPath.toFile();
        Path p1 = f1.toPath();

        //path methods
        //System.out.println(p1.getFileName());
        System.out.println(p1);
        System.out.println(p1.endsWith("src")); // true
       //toAbsolutePath(), getFileName

        //file methods
        //getName, getParent, plus many more






    }

    static void example3() throws IOException {
        //create
        Path p1 = rootPath.resolve("myDir").resolve("d1").resolve("d2/d3/d4");
        //src/myDir/d1/d2/d3
        //Files.createDirectory(p1);
        Files.createDirectories(p1);

    }

    static void example4() throws IOException {

        //create
        Path p1 = rootPath.resolve("myDir").resolve("d1").resolve("first.txt");
        //Files.createFile(p1);
        for(int i = 2; i <= 4; i++){
            Path p2 = rootPath
                    .resolve("myDir")
                    .resolve("d" + i)
                    .resolve("f" + i + ".txt");
            Files.createFile(p2);
        }

    }
    static void example5() throws IOException{
        Files.createDirectory(rootPath.resolve("d123.txt"));
    }
    static void example6() throws IOException{

        //get all files and folders of a dir
        Path target = rootPath.resolve("myDir/d1");
        File file = target.toFile();
        File[] allFiles = file.listFiles();
        String[] fileNames = file.list();

        for(File current : allFiles){
            System.out.printf("Is %s at directory? %s%n", current.getName(), current.isDirectory());
        }

    }
    static void example7() throws IOException{

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file or folder name");
        String userFile = input.nextLine();

        Path userRoot = rootPath.resolve("data");
        if(!Files.exists(userRoot)){
            Files.createDirectory(userRoot);
        }

        if(userFile.contains(".")){
            Files.createFile(userRoot.resolve(userFile));
        }
        else{
            Files.createDirectory(userRoot.resolve(userFile));
        }



    }

    static void example8() throws IOException{
        //rp = "./src"
        //resolve.resole("data")
        // new path = /src/data
        Path p1= rootPath.resolve("myDir").resolve("d4");
        Path p2= rootPath.resolve("data/d4");
        Files.move(p1, p2);
    }
    static void example9() throws IOException{
        //rp = "./src"
        //resolve.resole("data")
        // new path = /src/data
        Path p2= rootPath.resolve("data/d4/f4.txt");
        Path p1= rootPath.resolve("myDir/d4/f4.txt");
        Files.copy(p2, p1);
        //        Files.copy(p2, p1, StandardCopyOption.REPLACE_EXISTING);
    }
    static void example10() throws IOException{
        Files.delete(rootPath.resolve("myDir/d5"));
       boolean result = rootPath.resolve("myDir/d6").toFile().delete();
    }

    static void example11() throws IOException{

        String content = "I love Java\n";
        Path p1 = rootPath.resolve("data/test.txt");
        Files.writeString(p1, content, StandardOpenOption.APPEND);


    }

    static void example12() throws IOException{

        String content = Files.readString(rootPath.resolve("data/test.txt"));
        System.out.println(content);
    }

}
