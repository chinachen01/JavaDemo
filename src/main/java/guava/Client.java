package guava;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * Created by focus on 17/3/30.
 */
public class Client {
    public static void main(String[] args) {
        readLines();
    }

    public static void readLines() {
        String path = "/Users/focus/test";
        CharSource charSource = Files.asCharSource(new File(path), Charsets.UTF_8);
        String writePath = "/Users/focus/testWrite";
        CharSink charSink = Files.asCharSink(new File(writePath), Charsets.UTF_8, FileWriteMode.APPEND);
        try {
            charSource.copyTo(charSink);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ImmutableList<String> lists = charSource.readLines();
            for (String string : lists) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
