package demo02;

import java.io.*;

public class Demo1IO {
    public static void main(String[] args) throws IOException {
        //char c;

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符，按下q退出。 ");
        //读取字符
//        do {
//            c = (char) br.read();
//            //System.out.println(br.read());
//            System.out.println(c);
//
//        } while (c != 'q');
        //============================================
//        String str;
//        System.out.println("Enter lines of text.");
//        System.out.println("Enter 'end' to quit.");
//
//        do {
//            System.out.println("qingshuru");
//            str = br.readLine();
//            System.out.println(str);
//
//        } while (!str.equals("end"));
//        System.out.println("chengxujieshu");
        //=======================================
//        InputStream f = new FileInputStream("D:\\Demo\\Git\\day1\\demo02\\liu.txt");
//        File f1 = new File("D:\\Demo\\Git\\day1\\demo02\\liu.txt");
//        InputStream out = new FileInputStream(f1);
//        System.out.println(f);
//        System.out.println(out);
//        OutputStream f2 = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\liu1.txt");
//
//    byte bWrite[] = {11,21,3,40,5};
//    OutputStream os = new FileOutputStream("test.txt");
//    try {
//        for (int x = 0; x < bWrite.length; x++) {
//            os.write(bWrite[x]);
//        }
//        os.close();
//
//        InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\liu.txt");
//        int size = is.available();
//
//        for (int i = 0; i < size; i++) {
//            System.out.print((char) is.read() + " ");
//
//        }
//        is.close();
//    } catch (IOException e ){
//        System.out.println("Exception");
//    }

        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char) reader.read());

        }
        System.out.println(sb.toString());
        reader.close();;
        fip.close();





    }
}
