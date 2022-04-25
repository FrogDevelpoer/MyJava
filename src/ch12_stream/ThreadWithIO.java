package ch12_stream;

public class ThreadWithIO {
    public static void main(String[] args) {
        MakeFile mkdir = new MakeFile();
        mkdir.start();

        ReadFile mfile = new ReadFile();
        Thread myfile = new Thread(mfile);
        myfile.start();
    }
}
