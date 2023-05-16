package hello.upload.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import hello.upload.domain.UploadFile;

@Component
public class FileStore {
	
	@Value("${file.dir}")
	private String fileDir;
	
	public String getFullPath(String filename) {
		return fileDir + filename;
	}
	
	public List<UploadFile> storeFiles(List<MultipartFile> multipartFiles) throws IOException {
		List<UploadFile> storeFileResult = new ArrayList<>();
		for(MultipartFile multipartFile : multipartFiles) {
			if(!multipartFile.isEmpty()) {
				storeFileResult.add(storeFile(multipartFile));
			}
		}
		return storeFileResult;
	}
	
	public UploadFile storeFile(MultipartFile multipartFile) throws IOException {
		if(multipartFile.isEmpty()) {
			return null;
		}
		// 사용자가 보낸 파일명
		String originalFilename = multipartFile.getOriginalFilename();
		// 서버에 저장하는 파일명
		String storeFilename = createSToreFileName(originalFilename);
		multipartFile.transferTo(new File(getFullPath(storeFilename)));
		
		return new UploadFile(originalFilename, storeFilename);
	}
	
	public String extractExt(String originalFilename) {
		int pos = originalFilename.lastIndexOf(".");
		return originalFilename.substring(pos + 1);
	}
	
	public String createSToreFileName(String originalFilename) {
		String uuid = UUID.randomUUID().toString();
		String ext = extractExt(originalFilename);
		return uuid + "." + ext;
	}

}
