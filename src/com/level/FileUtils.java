package com.level;

import java.io.*;
import java.util.ArrayList;

public abstract class FileUtils {

    public static void write(String fileName, String textToFile) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }
            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                //Записываем текст у файл
                out.print(textToFile);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void update(String fileName, String newText) {
        exists(fileName);
        StringBuilder sb = new StringBuilder();
        String oldFile = convertToString(read(fileName));
        sb.append(oldFile);
        sb.append(newText);
        write(fileName, sb.toString());
    }

    private static void exists(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            //throw new FileNotFoundException(file.getName());
        }
    }

    /*
        public static String[] read(String fileName) {
            //Этот спец. объект для построения строки
            StringBuilder sb = new StringBuilder();
            ArrayList<String> stringFromFileList = new ArrayList<>();

            exists(fileName);

            File file = new File(fileName);
            try {
                //Объект для чтения файла в буфер
                BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                try {
                    //В цикле построчно считываем файл
                    String s;
                    while ((s = in.readLine()) != null) {
                        stringFromFileList.add(s);
                    }
                } finally {
                    //Также не забываем закрыть файл
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //Преобразуем ArrayList в массив текстовых файловых строк
            String[] str = stringFromFileList.toArray(new String[stringFromFileList.size()]);

            //Возвращаем получ`енный массив строк из файла
            //return sb.toString();;
            return str;
        }
    */
    public static ArrayList<String> read(String fileName) {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        ArrayList<String> stringFromFileList = new ArrayList<>();

        exists(fileName);

        File file = new File(fileName);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    stringFromFileList.add(s);
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringFromFileList;
    }

    public static String convertToString(String[] textArray) {
        String str = "";
        for (String s : textArray) {
            //str += s + "\n";
            str = str.concat(s);
            str = str.concat("\n");
        }
        return str;
    }

    public static String convertToString(ArrayList<String> textArray) {
        String str = "";
        for (String s : textArray) {
            //str += s + "\n";
            str = str.concat(s);
            str = str.concat("\n");
        }
        return str;
    }
}
