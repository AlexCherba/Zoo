package com.level;

import java.io.*;
import java.util.ArrayList;

public abstract class FileUtils {

    public static void write(String fileName, String textToFile){
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

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
    public static String[] read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        ArrayList stringFromFileList = new ArrayList();

        exists(fileName);

        File file = new File(fileName);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
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
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        //Преобразуем ArrayList в массив текстовых файловых строк
        String[] str = new String[stringFromFileList.size()];
        for (int i = 0; i < str.length; i++) {
            str[i] = (String) stringFromFileList.get(i);
            //System.out.println(str[i]);
        }
        //Возвращаем полученный массив строк из файла
        return str;
    }
}
