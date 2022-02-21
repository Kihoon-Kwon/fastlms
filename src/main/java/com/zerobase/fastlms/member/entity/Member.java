package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member implements MemberCode {
    
    @Id
    private String userId;
    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;
    
    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;
    
    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;


    private boolean adminYn; //이 회원이 관리자인지 아닌지 판단함
    private LocalDateTime loginDt; //마지막 로그인 일자
    private String userStatus;//이용가능한상태, 정지상태
    
}
