package com.w.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;

/**
 * Tianbao entity. @author MyEclipse Persistence Tools
 */

public class Tianbao implements java.io.Serializable {

	// Fields

	private Integer id;
	/*private Tianbao tianbao;*/
	private String quancheng;
	private String guikou;
	private String tongxun;
	private String diyu;
	private String wangzhi;
	private String youxiang;
	private String daibiao;
	private String youbian;
	private String lianxi;
	private String phone;
	private String mphone;
	private String chuanzhen;
	private String jigou;
	private String jianjie;
	private String jname;
	private String qishinian;
	private String zhongzhinian;
	private String gaishu;
	private String gjzi;
	private String zijin;
	private String fangshi;
	private String yixiandanwei;
	private String hdlx;
	private String xueke;
	private String xuqiuliyu;
	private String qita;
	private String xiqiuyingyong;
	private String zhuangtai;
	private String njname;
private Set tianbaos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tianbao() {
	}
	
	/** minimal constructor */
	public Tianbao(Integer id, Tianbao tianbao) {
		this.id = id;
	/*	this.tianbao = tianbao;*/
	}

	/** full constructor */
	public Tianbao(Integer id, String quancheng,
			String guikou, String tongxun, String diyu, String wangzhi,
			String youxiang, String daibiao, String youbian, String lianxi,
			String phone, String mphone, String chuanzhen, String jigou,
			String jianjie, String jname, String qishinian,
			String zhongzhinian, String gaishu, String gjzi, String zijin,
			String fangshi, String yixiandanwei, String hdlx, String xueke,
			String xuqiuliyu, String qita, String xiqiuyingyong,
			String zhuangtai, String njname, Set tianbaos) {
		this.id = id;
		
		this.quancheng = quancheng;
		this.guikou = guikou;
		this.tongxun = tongxun;
		this.diyu = diyu;
		this.wangzhi = wangzhi;
		this.youxiang = youxiang;
		this.daibiao = daibiao;
		this.youbian = youbian;
		this.lianxi = lianxi;
		this.phone = phone;
		this.mphone = mphone;
		this.chuanzhen = chuanzhen;
		this.jigou = jigou;
		this.jianjie = jianjie;
		this.jname = jname;
		this.qishinian = qishinian;
		this.zhongzhinian = zhongzhinian;
		this.gaishu = gaishu;
		this.gjzi = gjzi;
		this.zijin = zijin;
		this.fangshi = fangshi;
		this.yixiandanwei = yixiandanwei;
		this.hdlx = hdlx;
		this.xueke = xueke;
		this.xuqiuliyu = xuqiuliyu;
		this.qita = qita;
		this.xiqiuyingyong = xiqiuyingyong;
		this.zhuangtai = zhuangtai;
		this.njname = njname;
		this.tianbaos = tianbaos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public Tianbao getTianbao() {
		return this.tianbao;
	}

	public void setTianbao(Tianbao tianbao) {
		this.tianbao = tianbao;
	}
*/
	public String getQuancheng() {
		return this.quancheng;
	}

	public void setQuancheng(String quancheng) {
		this.quancheng = quancheng;
	}

	public String getGuikou() {
		return this.guikou;
	}

	public void setGuikou(String guikou) {
		this.guikou = guikou;
	}

	public String getTongxun() {
		return this.tongxun;
	}

	public void setTongxun(String tongxun) {
		this.tongxun = tongxun;
	}

	public String getDiyu() {
		return this.diyu;
	}

	public void setDiyu(String diyu) {
		this.diyu = diyu;
	}

	public String getWangzhi() {
		return this.wangzhi;
	}

	public void setWangzhi(String wangzhi) {
		this.wangzhi = wangzhi;
	}

	public String getYouxiang() {
		return this.youxiang;
	}

	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}

	public String getDaibiao() {
		return this.daibiao;
	}

	public void setDaibiao(String daibiao) {
		this.daibiao = daibiao;
	}

	public String getYoubian() {
		return this.youbian;
	}

	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}

	public String getLianxi() {
		return this.lianxi;
	}

	public void setLianxi(String lianxi) {
		this.lianxi = lianxi;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMphone() {
		return this.mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getChuanzhen() {
		return this.chuanzhen;
	}

	public void setChuanzhen(String chuanzhen) {
		this.chuanzhen = chuanzhen;
	}

	public String getJigou() {
		return this.jigou;
	}

	public void setJigou(String jigou) {
		this.jigou = jigou;
	}

	public String getJianjie() {
		return this.jianjie;
	}

	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}

	public String getJname() {
		return this.jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public String getQishinian() {
		return this.qishinian;
	}

	public void setQishinian(String qishinian) {
		this.qishinian = qishinian;
	}

	public String getZhongzhinian() {
		return this.zhongzhinian;
	}

	public void setZhongzhinian(String zhongzhinian) {
		this.zhongzhinian = zhongzhinian;
	}

	public String getGaishu() {
		return this.gaishu;
	}

	public void setGaishu(String gaishu) {
		this.gaishu = gaishu;
	}

	public String getGjzi() {
		return this.gjzi;
	}

	public void setGjzi(String gjzi) {
		this.gjzi = gjzi;
	}

	public String getZijin() {
		return this.zijin;
	}

	public void setZijin(String zijin) {
		this.zijin = zijin;
	}

	public String getFangshi() {
		return this.fangshi;
	}

	public void setFangshi(String fangshi) {
		this.fangshi = fangshi;
	}

	public String getYixiandanwei() {
		return this.yixiandanwei;
	}

	public void setYixiandanwei(String yixiandanwei) {
		this.yixiandanwei = yixiandanwei;
	}

	public String getHdlx() {
		return this.hdlx;
	}

	public void setHdlx(String hdlx) {
		this.hdlx = hdlx;
	}

	public String getXueke() {
		return this.xueke;
	}

	public void setXueke(String xueke) {
		this.xueke = xueke;
	}

	public String getXuqiuliyu() {
		return this.xuqiuliyu;
	}

	public void setXuqiuliyu(String xuqiuliyu) {
		this.xuqiuliyu = xuqiuliyu;
	}

	public String getQita() {
		return this.qita;
	}

	public void setQita(String qita) {
		this.qita = qita;
	}

	public String getXiqiuyingyong() {
		return this.xiqiuyingyong;
	}

	public void setXiqiuyingyong(String xiqiuyingyong) {
		this.xiqiuyingyong = xiqiuyingyong;
	}

	public String getZhuangtai() {
		return this.zhuangtai;
	}

	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	public String getNjname() {
		return this.njname;
	}

	public void setNjname(String njname) {
		this.njname = njname;
	}

	public Set getTianbaos() {
		return this.tianbaos;
	}

	public void setTianbaos(Set tianbaos) {
		this.tianbaos = tianbaos;
	}

}