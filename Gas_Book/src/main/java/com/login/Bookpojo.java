package com.login;

public class Bookpojo {
private String cusname;
private String cid;
private String aadhar_no;
private String add;
private String ordet_date;
private String ctype;

public Bookpojo() {
	// TODO Auto-generated constructor stub
}
public Bookpojo(String cusname, String cid, String aadhar_no, String add, String ordet_date, String ctype) {
	super();
	this.cusname = cusname;
	this.cid = cid;
	this.aadhar_no = aadhar_no;
	this.add = add;
	this.ordet_date = ordet_date;
	this.ctype = ctype;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getAadhar_no() {
	return aadhar_no;
}
public void setAadhar_no(String aadhar_no) {
	this.aadhar_no = aadhar_no;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getOrdet_date() {
	return ordet_date;
}
public void setOrdet_date(String ordet_date) {
	this.ordet_date = ordet_date;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
}