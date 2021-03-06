package com.spring.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody String uploadFile(@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) {

		String msg = "";
		if (file.isEmpty()) {
			msg = "Selected file is empty";
		} else {
			try {
				byte data[] = file.getBytes();
				File dir = new File("/home/dhiraj/file");
				if (!dir.exists()) {
					dir.mkdirs();
					File f = new File(dir, file.getOriginalFilename());
					BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
							new FileOutputStream(f));
					bufferedOutputStream.write(data);
					bufferedOutputStream.close();
					msg = "File uploaded successfully" + f.getAbsolutePath();
				}

			} catch (Exception e) {
				e.printStackTrace();
				msg = "Error in file uploading";
			}
		}
		return msg;
	}

}
