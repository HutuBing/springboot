package com.sblearn.mail;

import com.sblearn.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MailTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testMail() throws Exception {
        mailService.sendSimpleMail("1161086097@qq.com","test simple mail", "hello this is test mail");
    }

    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendSimpleMail("1161086097@qq.com","test html mail",content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="C:\\Users\\win10\\Desktop\\周报\\.xlsx";
        mailService.sendAttachmentsMail("1161086097@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\Users\\summer\\Pictures\\favicon.png";

        mailService.sendInlineResourceMail("1161086097@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
