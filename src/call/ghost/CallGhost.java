package call.ghost;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.nio.file.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CallGhost extends Thread {

    private static String AddressDir = "F:\\Desktop\\Google\\Фото\\Takeout\\Google_Photo";
    private static String AddressLog = "F:\\Desktop\\Google\\Фото\\Takeout\\Google_Photo";
    private static boolean Size = false;
    private static boolean CreateTime = false;
    private static boolean LastModifTime = false;
    private static boolean ReadOnly = false;
    private static boolean Archive = false;
    private static boolean Hidden = false;
    private static boolean System = false;
    private static boolean InnerDir = false;

    public static void SetAddressDir(String in) {
        AddressDir = in;
    }

    public static void SetAddressLog(String in) {
        AddressLog = in;
    }

    public static void SetSize() {
        Size = !Size;
    }

    public static void SetCreateTime() {
        CreateTime = !CreateTime;
    }

    public static void SetLastModifTime() {
        LastModifTime = !LastModifTime;
    }

    public static void SetReadOnly() {
        ReadOnly = !ReadOnly;
    }

    public static void SetArchive() {
        Archive = !Archive;
    }

    public static void SetHidden() {
        Hidden = !Hidden;
    }

    public static void SetSystem() {
        System = !System;
    }

    public static void SetInnerDir() {
        InnerDir = !InnerDir;
    }

    @Override
    public void run() {
        while (true) {
            FileWriter txtFile = null;
            try {
                //создаем txt-файл Log-файл
                File Log = new File(AddressLog);
                //txtFile = new FileWriter(Log, true);

                ScanDir(AddressDir);
                //закрываем текстовые файлы
                //txtFile.flush();
                //txtFile.close();
                //sleep(10000);
            } catch (Exception ex) {
                Logger.getLogger(CallGhost.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void ScanDir(String In) {
        File dir = new File(In);//Указываем каталог чтения
        File files[] = dir.listFiles();//считываем список файлов в массив
        Random rnd = new Random(15);
        for (File CurrentFile : files) {
            if (CurrentFile.isFile()) {          //если файл
                if (CurrentFile.getName().equals("метаданные.json")) {
                    CurrentFile.delete();
                } else {
                    File newFile = new File(AddressLog + "/" + CurrentFile.getName());
                    if (newFile.exists()) {
                        String ext = CurrentFile.getName().substring(CurrentFile.getName().length() - 4, CurrentFile.getName().length() - 1);
                        String name = CurrentFile.getName().substring(0, CurrentFile.getName().length() - 4);
                        newFile = new File(AddressLog + "/" + name + rnd.nextInt() + ext);
                    } else {
                        CurrentFile.renameTo(newFile);
                    }
                }
            }
            if (InnerDir) {                          //внутренние папки
                if (CurrentFile.isDirectory()) {    //если папка
                    ScanDir(CurrentFile.getAbsolutePath());
                    if (CurrentFile.list().length==0){
                        CurrentFile.delete();
                    }
                }
            }
        }
    }

    private static void writeInFile(FileWriter txtFile, File file) throws IOException {
        //записываем в файл следущие данные
        txtFile.append(file.getPath() + "\n");
        if (Size) {
            txtFile.append("Size in byte: " + String.valueOf(file.length()) + "\n");
        }
        if (CreateTime) {
            txtFile.append("Creation time: " + String.valueOf(Files.readAttributes(Paths.get(file.getPath()), DosFileAttributes.class).creationTime()) + "\n");
        }
        if (LastModifTime) {
            txtFile.append("Last modified time: " + String.valueOf(Files.readAttributes(Paths.get(file.getPath()), DosFileAttributes.class).lastModifiedTime()) + "\n");
        }
        if (ReadOnly) {
            txtFile.append("Read Only: " + String.valueOf(Files.readAttributes(Paths.get(file.getPath()), DosFileAttributes.class).isReadOnly()) + "\n");
        }
        if (Archive) {
            txtFile.append("Archive: " + String.valueOf(Files.readAttributes(Paths.get(file.getPath()), DosFileAttributes.class).isArchive()) + "\n");
        }
        if (Hidden) {
            txtFile.append("Hidden: " + String.valueOf(Files.readAttributes(Paths.get(file.getPath()), DosFileAttributes.class).isHidden()) + "\n");
        }
        if (System) {
            txtFile.append("System: " + String.valueOf(Files.readAttributes(Paths.get(file.getPath()), DosFileAttributes.class).isSystem()) + "\n");
        }
        txtFile.append("/--------------------------------------------/\n");
    }

}
