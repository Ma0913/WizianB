package com.wizian.admission.wizianb.service;

import com.wizian.admission.wizianb.domain.ApplicationInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.io.IOException;
import java.util.List;

@Service
public interface ApplicationInfoService {

   ApplicationInfo join(ApplicationInfo applicationInfo, MultipartFile file) throws IOException;

   ApplicationInfo appInfo(String email);

   ApplicationInfo findMember(String memId);

   ApplicationInfo savePassword(String loginId,String password);

   String courseName(Object rcrtNo);

   String emailCheck(String email);
   String passwordCheck(String email);

   Boolean existByEmail(String email);

}
