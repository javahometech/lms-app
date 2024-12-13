package com.jm.lms.studentms.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.addBasenames("classpath:/langs/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
/*
 INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (1, 'ARJUNSHARMA', 'ARJUN@123', 'ARJUNSHARMA@GMAILCOM', '9876543210', 'SOFTWARE ENGINEER', '1995-04-12', 'MALE', 'BENGALURU');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (2, 'PRIYAVERMA', 'PRIYASECURE!', 'PRIYAVERMA@YAHOOCOM', '9123456789', 'HARDWARE ENGINEER', '1990-08-25', 'FEMALE', 'HYDERABAD');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (3, 'RAHULGUPTA', 'RAHUL@2024', 'RAHULGUPTA@HOTMAILCOM', '9234567890', 'SOFTWARE DEVELOPER', '1992-03-10', 'MALE', 'CHENNAI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (4, 'KAVYANNAIR', 'KAVYAPASS1', 'KAVYANNAIR@GMAILCOM', '9345678901', 'SYSTEM ARCHITECT', '1998-01-15', 'FEMALE', 'MUMBAI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (5, 'AMITSINGH', 'AMITSECURE#99', 'AMITSINGH@OUTLOOKCOM', '9456789012', 'NETWORK ENGINEER', '1985-11-23', 'MALE', 'DELHI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (6, 'SWATIIYER', 'SWATIPASS456', 'SWATIIYER@GMAILCOM', '9567890123', 'HARDWARE SPECIALIST', '1994-07-30', 'FEMALE', 'BENGALURU');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (7, 'VISHALRAO', 'VISHAL@ENGINEER', 'VISHALRAO@GMAILCOM', '9678901234', 'SOFTWARE TESTER', '1991-09-17', 'MALE', 'HYDERABAD');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (8, 'ANANYAMENON', 'ANANYA@1234', 'ANANYAMENON@GMAILCOM', '9789012345', 'SOFTWARE ENGINEER', '1999-12-05', 'FEMALE', 'MUMBAI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (9, 'MANISHPATIL', 'MANISH123', 'MANISHPATIL@OUTLOOKCOM', '9890123456', 'HARDWARE ENGINEER', '1987-06-21', 'MALE', 'DELHI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (10, 'SNEHAREDDY', 'SNEHAREDDY!', 'SNEHAREDDY@GMAILCOM', '9901234567', 'SYSTEM ANALYST', '1996-03-13', 'FEMALE', 'BENGALURU');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (11, 'ADITYAMUKHERJEE', 'ADITYASECURE@!', 'ADITYAMUKHERJEE@YAHOOCOM', '9120123456', 'HARDWARE ARCHITECT', '1989-10-10', 'MALE', 'HYDERABAD');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (12, 'MEGHAKAPOOR', 'MEGHAPASS', 'MEGHAKAPOOR@HOTMAILCOM', '9231234567', 'SOFTWARE ENGINEER', '1993-02-08', 'FEMALE', 'CHENNAI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (13, 'ROHITMEHRA', 'ROHIT@PASSWORD', 'ROHITMEHRA@GMAILCOM', '9340123456', 'SOFTWARE DEVELOPER', '1997-05-18', 'MALE', 'PUNE');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (14, 'DEEPASHETTY', 'DEEPASECURE!', 'DEEPASHETTY@GMAILCOM', '9456123456', 'NETWORK ENGINEER', '1994-10-30', 'FEMALE', 'CHENNAI');

INSERT INTO USER (ID, USER_NAME, PASSWORD, EMAIL, PHONE_NUMBER, ROLE, DATE_OF_BIRTH, GENDER, ADDRESS) 
VALUES (15, 'ARAVINDKUMAR', 'ARAVIND#123', 'ARAVINDKUMAR@YAHOOCOM', '9345123456', 'HARDWARE ENGINEER', '1986-07-09', 'MALE', 'BENGALURU');

 */
