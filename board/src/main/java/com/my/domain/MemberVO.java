package com.my.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {

	private String mid;
	private String mpw;
	private String mname;
	private String maddress;
	private int mbirth;
	private Date msignupdate;
	private String mdeleteyn;
	
}
