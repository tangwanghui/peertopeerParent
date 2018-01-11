package com.lxit.lrc.action;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Test {
	static BASE64Encoder encoder = new sun.misc.BASE64Encoder(); 
	static BASE64Decoder decoder = new sun.misc.BASE64Decoder();
          
    public static void main(String[] args) {   
    	
        File file1 = new File("E:/123.txt");
        //System.out.println(getImageBinary().equals(base64));      
   
        String base64 = txt2String(file1);
        base64StringToImage(base64);      
    }      
          
    static String getImageBinary(){  
        File f = new File("E:/images/123/2017121008332.png");             
        BufferedImage bi;      
        try {      
            bi = ImageIO.read(f);      
            ByteArrayOutputStream baos = new ByteArrayOutputStream();      
            ImageIO.write(bi, "jpg", baos);      
            byte[] bytes = baos.toByteArray();      
                  
            return encoder.encodeBuffer(bytes).trim();      
        } catch (IOException e) {      
            e.printStackTrace();      
        }      
        return null;      
    }      
          
    static void base64StringToImage(String base64String){      
        try {      
            byte[] bytes1 = decoder.decodeBuffer(base64String);      
                  
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);      
            BufferedImage bi1 =ImageIO.read(bais);      
            File w2 = new File("E:/123.png");//可以是jpg,png,gif格式      
            ImageIO.write(bi1, "jpg", w2);//不管输出什么格式图片，此处不需改动      
        } catch (IOException e) {      
            e.printStackTrace();      
        }      
    }  
    
    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

}
