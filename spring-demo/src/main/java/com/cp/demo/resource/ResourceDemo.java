package com.cp.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 * @author Coder编程
 * @Title: ResourceDemo
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/5/10 14:20
 */
public class ResourceDemo {


	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource(
				"E:/Github/spring-framework/spring-demo/src/main/java/com/cp/demo/resource/text.txt");

		File file = fileSystemResource.getFile();
		System.out.println(file.length());

		OutputStream outputStream = fileSystemResource.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write("Hello World!");
		bufferedWriter.flush();
		outputStream.close();
		bufferedWriter.close();


	}
}
